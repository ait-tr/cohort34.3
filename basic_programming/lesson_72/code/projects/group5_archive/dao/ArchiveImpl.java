package projects.group5_archive.dao;

import projects.group5_archive.model.Document;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchiveImpl implements Archive {

    private final String filePath;

    public ArchiveImpl(String filePath) {
        this.filePath = filePath;
    }

    private List<Document> readDocuments() {
        List<Document> documents = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Пропускаем строку заголовка
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Document doc = new Document(
                        Integer.parseInt(values[0]), // folderId
                        Integer.parseInt(values[1]), // documentId
                        values[2],                   // name
                        values[3],                   // url
                        values[4],                   // annotation
                        LocalDateTime.parse(values[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
                );
                documents.add(doc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return documents;
    }

    private void writeDocuments(List<Document> documents) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("folder id,documents id,name,URL,annotation,date document");
            bw.newLine();
            for (Document doc : documents) {
                bw.write(doc.getFolderId() + "," + doc.getDocumentId() + "," + doc.getName() + "," +
                        doc.getUrl() + "," + doc.getAnnotation() + "," +
                        doc.getDocumentDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addDocuments(Document document) {
        List<Document> documents = readDocuments();
        if (document != null && documents.stream().noneMatch(d -> d.equals(document))) {
            documents.add(document);
            writeDocuments(documents);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDocuments(int folderId, int documentId) {
        List<Document> documents = readDocuments();
        boolean removed = documents.removeIf(doc -> doc.getFolderId() == folderId && doc.getDocumentId() == documentId);
        if (removed) {
            writeDocuments(documents);
            return true;
        }
        return false;
    }

    @Override
    public void updateDocument(int folderId, int documentId, String annotation, String url) {
        List<Document> documents = readDocuments();
        documents.stream()
                .filter(doc -> doc.getFolderId() == folderId && doc.getDocumentId() == documentId)
                .forEach(doc -> {
                    doc.setAnnotation(annotation);
                    doc.setUrl(url);
                });
        writeDocuments(documents);
    }

    @Override
    public Document getDocumentsFromFolder(int documentId, int folderId) {
        return readDocuments().stream()
                .filter(doc -> doc.getFolderId() == folderId && doc.getDocumentId() == documentId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Document> getAllDocumentsFromFolder(int folderId) {
        return readDocuments().stream()
                .filter(doc -> doc.getFolderId() == folderId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Document> getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return readDocuments().stream()
                .filter(doc -> doc.getDocumentDate().toLocalDate().isAfter(dateFrom) && doc.getDocumentDate().toLocalDate().isBefore(dateTo))
                .collect(Collectors.toList());
    }
    public List<Document> findDocumentByKeyWord(String keyword) {
        List<Document> documents = readDocuments();
        return documents.stream()
                .filter(doc -> doc.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                        (doc.getAnnotation() != null && doc.getAnnotation().toLowerCase().contains(keyword.toLowerCase())))
                .collect(Collectors.toList());
    }
    @Override
    public int size() {
        return readDocuments().size();
    }

    @Override
    public void viewArchive() {
        readDocuments().forEach(System.out::println);
    }
}

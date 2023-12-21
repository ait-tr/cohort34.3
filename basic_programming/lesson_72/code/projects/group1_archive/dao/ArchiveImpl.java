package projects.group1_archive.dao;

import projects.group1_archive.model.Documents;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchiveImpl implements Archive, Serializable {
    List<Documents> documents;
    public ArchiveImpl(List<Documents> documents){
        this.documents = new ArrayList<>(documents);
    }



    @Override
    public boolean addDocument(Documents doc) {
        if (doc == null || getDocFromFolder(doc.getFolderId(), doc.getDocId()) != null) {
            return false;
        }
        return documents.add(doc);
    }

    @Override
    public boolean removeDocument(int folderId, int docId) {
        Documents removed = getDocFromFolder(folderId, docId);
        if (removed == null){
            return false;
        }
        documents.remove(removed);
        return true;
    }

    @Override
    public boolean updateDocument(int folderId, int docId, String url) {
        Documents updated = getDocFromFolder(folderId, docId);
        if (updated == null){
            return false;
        }
        updated.setUrl(url);
        return true;
    }

    @Override
    public Documents getDocFromFolder(int folderId, int docId) {
        return documents.stream()
                .filter(n -> n.getFolderId() == folderId && n.getDocId() == docId)
                .findFirst().orElse(null);
    }

    @Override
    public Iterable<Documents> getAllDocFromFolder(int folderId) {
        List<Documents> docsInFolder = documents.stream()
                .filter(n -> n.getFolderId() == folderId)
                .collect(Collectors.toList());

        return docsInFolder.isEmpty() ? null : docsInFolder;
    }

    @Override
    public Iterable<Documents> getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        LocalDateTime from = dateFrom.atStartOfDay();
        LocalDateTime to = LocalDateTime.of(dateTo, LocalTime.MAX);
        return documents.stream()
                .filter(n -> n.getDate().isAfter(from) && n.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    @Override
    public int size() {
        return documents.size();
    }

    @Override
    public void viewArchive() {
        for (Documents d : documents) {
            System.out.println(d);
        }
    }

}

package projects.group5_archive.dao;

import projects.group5_archive.model.Document;

import java.time.LocalDate;
import java.util.List;

public interface Archive { // класс интерфейс (с абстрактыми методами)
    boolean addDocuments(Document documents); // добавление документа
    boolean removeDocuments(int folderId, int documentId); // удаление документа
    void updateDocument(int folderId, int documentId, String annotation, String url);
    Document getDocumentsFromFolder(int folderId, int documentId); // получение документа из папки
    List<Document> getAllDocumentsFromFolder(int folderId); // получение всех документов из папки
    List<Document> getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo); // получение документов подате от и до
    List<Document> findDocumentByKeyWord(String keyword); // поиск по ключевому слову или анотации
    int size(); // количество документов
    void viewArchive(); // метод для печати содержимого
}

package hw.archive.dao;

import hw.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument (Document document);
    boolean removeDocument(int folderId, int documentId);
    boolean updateDocument(int folderId, int documentId,String url);
    Document getDocFromFolder (int folderId, int documentId);
    Document[] getAllDocFromFolder(int folderId);
    Document[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size(); //quantity
    void viewArchive(); // метод для печати содержимого
}

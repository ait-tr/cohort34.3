package projects.group1_archive;

import org.junit.platform.engine.support.hierarchical.OpenTest4JAwareThrowableCollector;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import projects.group1_archive.dao.Archive;
import projects.group1_archive.dao.ArchiveImpl;
import projects.group1_archive.model.Documents;
import projects.group1_archive.model.Menu;

public class ArchiveAppl {
    private static final String ARCHIVE_FILE_PATH = "./dest/archive.csv";

    public static void main(String[] args) {
        Archive archive = loadArchive(); // Загрузка архива

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------");
            Menu.printMenu();
            System.out.print("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addDocument(archive, scanner);
                case 2 -> removeDocument(archive, scanner);
                case 3 -> findDocument(archive, scanner);
                case 4 -> ViewDocumentsBetweenDates(archive);
                case 5 -> ViewDocumentsFromFolder(archive, scanner);
                case 6 -> viewAllDocuments(archive);
                case 7 -> printTotalQuantity(archive);
                case 8 -> {saveAndExit(archive);
                    return;}

                default -> System.out.println("Wrong choice. Please try again.");
            }
        }
    } // end main


    // Этот метод проверяет наличие файла архива.
    // Если файл существует, то архив загружается из файла. В противном случае создается новый архив.
    private static Archive loadArchive() {
        Archive archive;

        File archiveFile = new File(ARCHIVE_FILE_PATH);

        if (archiveFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archiveFile))) {
                archive = (Archive) ois.readObject();
                archive.viewArchive();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            archive = new ArchiveImpl(new ArrayList<>());
        }

        return archive;
    }
    // Метод добавляет новый документ в архив.
    // Запрашиваются у пользователя необходимые данные для создания документа, и он добавляется в архив.
    private static void addDocument(Archive archive, Scanner scanner) {
        System.out.print("Input folder ID: ");
        int folderId = scanner.nextInt();
        System.out.print("Input document ID: ");
        int docId = scanner.nextInt();
        System.out.print("Input title: ");
        String title = scanner.next();
        System.out.print("Input URL: ");
        String url = scanner.next();
        Documents newDoc = new Documents(folderId, docId, title, url, LocalDateTime.now());

        if (archive.addDocument(newDoc)) {
            System.out.println("Document added.");
        } else {
            System.out.println("Document with the same ID already exists.");
        }
    }
    // Метод удаляет документ из архива.
    private static void removeDocument(Archive archive, Scanner scanner) {
        System.out.print("Input folder ID: ");
        int folderId = scanner.nextInt();
        System.out.print("Input document ID: ");
        int docId = scanner.nextInt();

        if (archive.removeDocument(docId, folderId)) {
            System.out.println("Document removed.");
        } else {
            System.out.println("Document not found.");
        }
    }
    // Метод находит документ в архиве по запрашиваемым данным от пользователя.
    private static void findDocument(Archive archive, Scanner scanner) {
        System.out.print("Input folder ID: ");
        int folderId = scanner.nextInt();
        System.out.print("Input document ID: ");
        int docId = scanner.nextInt();

        Documents doc = archive.getDocFromFolder(folderId, docId);
        if (doc != null) {
            System.out.println("Found document: " + doc);
        } else {
            System.out.println("Document not found.");
        }
    }
    // Метод распечатывает все документы согласно заданного периода дат.
    private static void ViewDocumentsBetweenDates(Archive archive) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date from (yyyy-MM-dd): ");
        String dateFromStr = scanner.next();
        LocalDate dateFrom = LocalDate.parse(dateFromStr);

        System.out.println("Input date to (yyyy-MM-dd): ");
        String dateToStr = scanner.next();
        LocalDate dateTo = LocalDate.parse(dateToStr);

        Iterable<Documents> docBetweenDates = archive.getDocBetweenDate(dateFrom, dateTo);
        if (docBetweenDates != null) {
            System.out.println("Documents between " + dateFrom + " and " + dateTo + ":");
            for (Documents d : docBetweenDates) {
                System.out.println(d);
            }
        } else {
            System.out.println("No documents found between " + dateFrom + " and " + dateTo);
        }
    }
    // Метод распечатывает все документы из папки.
    private static void ViewDocumentsFromFolder(Archive archive, Scanner scanner) {
        System.out.print("Input folder ID: ");
        int folderId = scanner.nextInt();
        Iterable<Documents> docInFolder = archive.getAllDocFromFolder(folderId);

        if (docInFolder != null) {
            System.out.println("Documents in folder " + folderId + ":");
            for (Documents d : docInFolder) {
                System.out.println(d);
            }
        } else {
            System.out.println("No documents found in folder " + folderId);
        }
    }
    // Метод распечатывает все документы из архива.
    private static void viewAllDocuments(Archive archive) {
        archive.viewArchive();
    }
    // Метод выводит на печать текущий размер архива (кол-во документов).
    private static void printTotalQuantity(Archive archive) {
        System.out.println("Total quantity of documents: " + archive.size());
    }
    // Метод сохраняет документы в файл.
    private static void saveAndExit(Archive archive) {
        System.out.println("Saving ....");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVE_FILE_PATH))) {
            oos.writeObject(archive);
        } catch (IOException e) {
            throw new RuntimeException("Error saving archive.", e);
        }

//            System.out.println("Buy - buy.");
//            System.exit(0);
    }
}

package projects.group5_archive;

import projects.group5_archive.dao.ArchiveImpl;
import projects.group5_archive.model.Document;
import projects.group5_archive.model.Menu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// приложение ArchiveAppl, в котором должно быть меню с функциями:
// добавить документ (запрос id документа, id папки, названия документа, url, присвоение текущей даты и времени)
//показать список всех документов в архиве
//узнать количество хранимых документов в архиве
//выход

public class ArchiveAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to Archive.");
        ArchiveImpl archive = new ArchiveImpl("basic_programming/lesson_72/code/projects/group5_archive/documents.csv");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.printMenu();
            System.out.print("Input your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Очистка буфера сканера
                continue; // Продолжаем цикл, предлагая пользователю повторить выбор
            }
            switch (choice) {
                case 1: // Добавить документ
                    addDocument(scanner, archive);
                    break;
                case 2: // Показать список всех документов
                    archive.viewArchive();
                    break;
                case 3: // Обновить документ
                    updateDocument(scanner, archive);
                    break;
                case 4: // Удалить документ
                    removeDocument(scanner, archive);
                    break;
                case 5: // Найти документ
                    findDocument(scanner, archive);
                    break;
                case 6: // Найти документ
                    findDocumentByKeyWord(scanner, archive);
                    break;
                case 7: // Найти документ по времени
                    findDocumentByTime(scanner, archive);
                    break;
                case 8: // Количество документов
                    System.out.println("Quantity of documents in Archive: " + archive.size());
                    break;
                case 9: // Выход
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong input. Please try again.");
            }
        }
    }

    private static void addDocument(Scanner scanner, ArchiveImpl archive) {
        try {
            scanner.nextLine(); // Очистка буфера
            System.out.println("Input folder ID: ");
            int folderId = scanner.nextInt();
            System.out.println("Input document ID: ");
            int documentId = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            System.out.println("Input document title: ");
            String title = scanner.nextLine();
            System.out.println("Input document URL: ");
            String url = scanner.nextLine();
            System.out.println("Input document annotation: ");
            String annotation = scanner.nextLine();
            LocalDateTime currTime = LocalDateTime.now();
            Document document = new Document(folderId, documentId, title, url, annotation, currTime);
            boolean isAdded = archive.addDocuments(document);
            if (isAdded) {
                System.out.println("Document added successfully.");
            } else {
                System.out.println("Failed to add the document.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }

    private static void updateDocument(Scanner scanner, ArchiveImpl archive) {
        try {
            System.out.println("Updating a document.");
            System.out.println("Input folder ID: ");
            int folderId = scanner.nextInt();
            System.out.println("Input document ID: ");
            int documentId = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            System.out.println("Input new document URL: ");
            String url = scanner.nextLine();
            System.out.println("Input new document annotation: ");
            String annotation = scanner.nextLine();
            archive.updateDocument(folderId, documentId, annotation, url);
            System.out.println("Document updated successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }

    private static void removeDocument(Scanner scanner, ArchiveImpl archive) {
        try {
            System.out.println("Removing a document.");
            System.out.println("Input folder ID: ");
            int folderId = scanner.nextInt();
            System.out.println("Input document ID: ");
            int documentId = scanner.nextInt();
            boolean isRemoved = archive.removeDocuments(folderId, documentId);
            if (isRemoved) {
                System.out.println("Document removed successfully.");
            } else {
                System.out.println("Failed to remove the document.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }

    private static void findDocument(Scanner scanner, ArchiveImpl archive) {
        try {
            System.out.println("Finding a document.");
            System.out.println("Input folder ID: ");
            int folderId = scanner.nextInt();
            System.out.println("Input document ID: ");
            int documentId = scanner.nextInt();
            Document document = archive.getDocumentsFromFolder(folderId, documentId);
            if (document != null) {
                System.out.println("Document found: " + document);
            } else {
                System.out.println("Document not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }

    private static void findDocumentByTime(Scanner scanner, ArchiveImpl archive) {
        try {
            System.out.println("Finding documents by time range.");
            System.out.println("Input start date (yyyy-MM-dd (- 1d)): ");
            String startDateStr = scanner.next();
            System.out.println("Input end date (yyyy-MM-dd(+ 1d)): ");
            String endDateStr = scanner.next();
            LocalDate startDate = LocalDate.parse(startDateStr);
            LocalDate endDate = LocalDate.parse(endDateStr);
            List<Document> documents = archive.getAllDocumentBetweenDate(startDate, endDate);
            if (!documents.isEmpty()) {
                documents.forEach(System.out::println);
            } else {
                System.out.println("No documents found in the specified time range.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }
    private static void findDocumentByKeyWord(Scanner scanner, ArchiveImpl archive) {
        try {
            System.out.println("Enter keyword for search: ");
            scanner.nextLine(); // Очистка буфера
            String keyword = scanner.nextLine();
            List<Document> foundDocuments = archive.findDocumentByKeyWord(keyword);
            if (!foundDocuments.isEmpty()) {
                System.out.println("Found documents:");
                foundDocuments.forEach(System.out::println);
            } else {
                System.out.println("No documents found with the keyword '" + keyword + "'.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Очистка буфера сканера
        }
    }
}

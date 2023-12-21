package projects.group5_archive.test;

// рефакторинг с учетом JCF, Stream API;
//CRUD-функции для хранимых в архиве документов;
//поиск документа по ключевому слову в его заголовке или аннотации;
//возможность получить список документов, внесенных в архив за указанный период.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import projects.group5_archive.dao.ArchiveImpl;
import projects.group5_archive.model.Document;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArchiveImplTest {
    // Тестовый класс для ArchiveImpl
    private ArchiveImpl archive; // Экземпляр ArchiveImpl для тестирования
    private Path testFile; // Путь к тестовому файлу
    @TempDir
    Path tempDir; // Временная директория для тестовых файлов
    @BeforeEach
    void setUp() throws IOException {
        testFile = tempDir.resolve("test_documents.csv"); // Определение пути к тестовому файлу
        Files.createFile(testFile); // Создание тестового файла
        try (BufferedWriter writer = Files.newBufferedWriter(testFile)) {
            writer.write("folder id,documents id,name,URL,annotation,date document"); // Запись заголовка CSV
            writer.newLine(); // Переход на новую строку
            // Запись тестовых данных в файл
            writer.write("1,1,Test Document,http://test.com,Test Annotation," + LocalDateTime.now().minusDays(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            writer.newLine();
            writer.write("2,2,Another Document,http://another.com,Another Annotation," + LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            writer.newLine();
            writer.write("1,3,Third Document,http://third.com,Third Annotation," + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            writer.newLine();
        }
        archive = new ArchiveImpl(testFile.toString()); // Инициализация ArchiveImpl с путем к тестовому файлу
    }
    @Test
    void testAddAndGetDocument() {
        Document newDoc = new Document(3, 4, "New Document", "http://new.com", "New Annotation", LocalDateTime.now()); // Создание нового документа
        assertTrue(archive.addDocuments(newDoc)); // Проверка успешности добавления
    }
    @Test
    void testRemoveDocument() {
        assertTrue(archive.removeDocuments(1, 3)); // Проверка успешности удаления документа
        assertNull(archive.getDocumentsFromFolder(1, 3)); // Проверка, что документ удален
    }
    @Test
    void testUpdateDocument() {
        String newUrl = "http://updated.com"; // Новый URL для обновления
        String newAnnotation = "Updated Annotation"; // Новая аннотация для обновления
        archive.updateDocument(1, 1, newAnnotation, newUrl); // Обновление документа
        Document updatedDoc = archive.getDocumentsFromFolder(1, 1); // Получение обновленного документа
        assertNotNull(updatedDoc); // Проверка, что документ существует
        assertEquals(newUrl, updatedDoc.getUrl()); // Проверка обновленного URL
        assertEquals(newAnnotation, updatedDoc.getAnnotation()); // Проверка обновленной аннотации
    }
    @Test
    void testFindDocumentByKeyWord() {
        List<Document> foundDocs = archive.findDocumentByKeyWord("Test"); // Поиск документов по ключевому слову "Test"
        assertFalse(foundDocs.isEmpty()); // Проверка, что найдены документы
        assertTrue(foundDocs.stream().anyMatch(doc -> doc.getName().contains("Test") || doc.getAnnotation().contains("Test"))); // Проверка, что найденные документы содержат ключевое слово
    }
    @Test
    void testGetAllDocumentsFromFolder() {
        List<Document> docsInFolder1 = archive.getAllDocumentsFromFolder(1); // Получение всех документов из папки 1
        assertFalse(docsInFolder1.isEmpty()); // Проверка, что документы найдены
        assertTrue(docsInFolder1.stream().allMatch(doc -> doc.getFolderId() == 1)); // Проверка, что все документы принадлежат папке 1
    }
    @Test
    void testGetAllDocumentBetweenDate() {
        LocalDateTime startDate = LocalDateTime.now().minusDays(3); // Начальная дата для поиска
        LocalDateTime endDate = LocalDateTime.now(); // Конечная дата для поиска
        List<Document> foundDocs = archive.getAllDocumentBetweenDate(startDate.toLocalDate(), endDate.toLocalDate()); // Получение документов между датами
        assertFalse(foundDocs.isEmpty()); // Проверка, что документы найдены
    }
    @Test
    void testSize() {
        int size = archive.size(); // Получение размера архива
        assertEquals(3, size); // Проверка, что размер архива соответствует ожидаемому (3 документа)
    }
}

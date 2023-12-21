package projects.group1_archive.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projects.group1_archive.dao.Archive;
import projects.group1_archive.dao.ArchiveImpl;
import projects.group1_archive.model.Documents;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    public static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        LocalDateTime now = LocalDateTime.now();
        archive = new ArchiveImpl(List.of(
                new Documents(1, 10, "A", "URL_A", now.minusYears(3)),
                new Documents(2, 11, "B", "URL_B", now.minusYears(4)),
                new Documents(3, 12, "C", "URL_C", now.minusYears(1)),
                new Documents(4, 13, "D", "URL_D", now.minusYears(2)),
                new Documents(5, 14, "E", "URL_E", now.minusYears(8)),
                new Documents(6, 15, "F", "URL_F", now.minusYears(6)),
                new Documents(7, 16, "G", "URL_G", now.minusYears(5))
        ));
    }

    @Test
    void addDocument() {
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(new Documents(2, 11, "B", "URL_B", now.minusYears(4).atStartOfDay())));
    }

    @Test
    void removeDocument() {
        //удаляем существующий документ
        assertFalse(archive.removeDocument(10, 1));
        //убеждаемся в количестве документов
        assertFalse(archive.size() == 6);
        //удаляем несуществующий документ
        assertFalse(archive.removeDocument(6, 10));
        //убеждаемся в количестве документов
        assertFalse(archive.size() == 6);
    }

    @Test
    void updateDocument() {
        //обновляем существующий документ
        assertTrue(archive.updateDocument(1, 10, "URL_A"));
        //обновляем несуществующий документ
        assertFalse(archive.updateDocument(6, 10, "URL_A"));
    }

    @Test
    void getDocFromFolder() {
        //ищем существующий документ
        assertNotNull(archive.getDocFromFolder(1, 10));
        //ищем несуществующий документ
        assertNull(archive.getDocFromFolder(6, 10));
    }

    @Test
    void getAllDocFromFolder() {
        //ищем документы в существующей папке
        Iterable<Documents> documents = archive.getAllDocFromFolder(1);
        //проверяем, что документы найдены
        assertNotNull(documents);
        //ищем документы в несуществующей папке
        documents = archive.getAllDocFromFolder(10);
        //проверяем, что документы не найдены
        assertNull(documents);
    }

    @Test
    void getDocBetweenDate() {
        //ищем документы, созданные между 2 и 4 годами назад
        Iterable<Documents> documents = archive.getDocBetweenDate(now.minusYears(4), now.minusYears(2));
        //проверяем, что документы найдены
        assertNotNull(documents);
    }

    @Test
    void size() {
        //убеждаемся в количестве документов
        assertTrue(archive.size() == 7);
    }

    @Test
    void viewArchive() {
        archive.viewArchive();
    }
}
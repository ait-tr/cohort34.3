package homework.doc_archive.dao;

import homework.doc_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;


class ArchiveImplTest {

    Archive archive;
    Document[] d;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);

//        ph[0] = new Photo(1, 1, "title1", "url1", now.minusDays(7));
//        ph[1] = new Photo(1, 2, "title2", "url2", now.minusDays(7));
//        ph[2] = new Photo(1, 3, "title3", "url3", now.minusDays(5));
//        ph[3] = new Photo(2, 1, "title1", "url1", now.minusDays(7));
//        пример данных, p[4] и p[5] совпадают по времени полностью
//        ph[4] = new Photo(2, 4, "title4", "url4", LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));
//        ph[5] = new Photo(1, 4, "title4", "url1", LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));

        d = new Document[6];

        d[0] = new Document(1,1,"t1","url1",now.minusDays(2));
        d[1] = new Document(1,2,"t2","url2",now.minusDays(3));
        d[2] = new Document(1,3,"t3","url3",now.minusDays(5));
        d[3] = new Document(2,4,"t1","url4",LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));
        d[4] = new Document(2,5,"t2","url5",LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));
        d[5] = new Document(1,6,"t3","url6",LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));

        for (int i = 0; i < d.length; i++) {
            archive.addDocument(d[i]);
        }
    }

    @Test
    void addDocumentTest() {
        //нельзя добавить null
        assertFalse(archive.addDocument(null));
        //нельзя добавить уже имеющийся объект
        assertFalse(archive.addDocument(d[0]));
        archive.viewArchive(); // печатаем массив до добавления
        //добавляем один объект
        Document doc = new Document(3,1,"t7","url",now);
        assertTrue(archive.addDocument(doc));
        //проверяем размер массива
        assertEquals(7,archive.size());
        System.out.println("-----------------------");
        archive.viewArchive(); // печатаем массив после добавления
        // проверяем, что нельзя добавить еще один из-за достижения capacity
        doc = new Document(3,1,"t7","url",now);
        assertFalse(archive.addDocument(doc));

    }

    @Test
    void removeDocumentTest(){
        archive.viewArchive(); // до удаления
        // удаление имеющегося фото
        assertTrue(archive.removeDocument(1, 1)); // это проверка на удаление d[0]
        System.out.println("---------------------");
        archive.viewArchive(); // после удаления
        // удаление отсутствующего фото
         assertFalse(archive.removeDocument(3, 7)); // такого документа нет в архиве
        // проверка количества
        assertEquals(5, archive.size());
        // не найдем удаленный документ
        assertNull(archive.getDocFromFolder(1, 1));

    }

    @Test
    void updateDocumentTest() {
        assertTrue(archive.updateDocument(1, 1, "newURL"));
        assertEquals("newURL",archive.getDocFromFolder(1,1).getUrl());//проверили url
    }

    @Test
    void getDocFromFolderTest() {
        assertEquals(d[0],archive.getDocFromFolder(1,1));//проверка нахождения фото
        assertNull(archive.getDocFromFolder(4,3));// ищем несуществующее
    }

    @Test
    void getAllDocFromFolderTest() {
        Document[] expected = {d[3],d[4]};
        Document[] actual = archive.getAllDocFromFolder(2);//выбрали folderId = 2
        Arrays.sort(actual);// сортируем
        assertArrayEquals(expected,actual);
    }

    @Test
    void getDocBetweenDateTest() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату
        Document[] actual = archive.getDocBetweenDate(ld.minusDays(7), ld.minusDays(3));
        Arrays.sort(actual);
        Document[] expected = {d[1],d[2],d[3], d[4], d[5]};
        Arrays.sort(expected);
        assertArrayEquals(expected,actual);
    }

    @Test
    void getDocBetweenDateTestTwo() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату
        Document[] actual = archive.getDocBetweenDateTwo(ld.minusDays(7), ld.minusDays(3));
        Arrays.sort(actual);
        Document[] expected = {d[1],d[2],d[3], d[4], d[5]};
        Arrays.sort(expected);
        assertArrayEquals(expected,actual);
    }

    @Test
    void sizeTest() {
        assertEquals(6,archive.size());
    }

    @Test
    void viewDocumentsTest() {
        archive.viewArchive(); // до сортировки
        Arrays.sort(d);
        archive.viewArchive(); // после сортировки
    }

//    public static void printArray(Document[] doc){
//        for (int i = 0; i < doc.length; i++) {
//            System.out.println(doc[i]);
//        }
//    }

}
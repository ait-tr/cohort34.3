package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        ph = new Photo[6];
        ph[0] = new Photo(1, 1,"t1", "url1", now.minusDays(2));
        ph[1] = new Photo(1, 2,"t2", "url2", now.minusDays(3));
        ph[2] = new Photo(1, 3,"t3", "url3", now.minusDays(5));
        ph[3] = new Photo(2, 1,"t1", "url4", now.minusDays(7));
        ph[4] = new Photo(2, 2,"t2", "url5", now.minusDays(7));
        ph[5] = new Photo(2, 3,"t3", "url6", now.minusDays(7));

        // не забыть положить эти ph в альбом методом addPhoto
        for (int i = 0; i < ph.length; i++) {
            album.addPhoto(ph[i]);
        }
    }

    @Test
    void addPhoto() {
        // нельзя добавить null
        assertFalse(album.addPhoto(null));
        // нельзя добавить имеющееся
        assertFalse(album.addPhoto(ph[1]));
        // проверить возможность добавления
        Photo photo = new Photo(3,1,"t", "url", now);
        assertTrue(album.addPhoto(photo));
        // проверить ожидаемое кол-во после добавления
        assertEquals(7, album.size());
        // нельзя превысить capacity
        photo = new Photo(3,2,"t", "url", now);
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void removePhoto() {
        // удаление имеющегося фото
        assertTrue(album.removePhoto(3, 1)); // удалили ph[2]
        // удаление отсутствующего фото
        assertFalse(album.removePhoto(5, 1)); // такого фото нет в альбоме
        // проверка количества
        assertEquals(5, album.size());
        // не найдем удаленное фото
        assertNull(album.getPhotoFromAlbum(3, 1));

    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));// обновили url
        assertEquals("newUrl", album.getPhotoFromAlbum(1,1).getUrl());// проверили, что он обновился
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0], album.getPhotoFromAlbum(1,1)); // проверяем нахождение фото
        assertNull(album.getPhotoFromAlbum(1,3)); // ищем несуществующее фото
    }

    @Test
    void getAllPhotoFromAlbum() {
        // этот метод возвращает массив фото
        Photo[] expected = {ph[3], ph[4], ph[5]}; // это фото из albumId = 2
        Photo[] actual = album.getAllPhotoFromAlbum(2); // выбрали альбом  albumId = 2
        Arrays.sort(actual); // сортируем массив
        assertArrayEquals( expected, actual);
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату, убираем время
        Photo[] actual = album.getPhotoBetweenDate(ld.minusDays(1), ld.minusDays(6));
        Arrays.sort(actual); // сортируем массив
        Photo[] expected = {ph[0], ph[1], ph[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}
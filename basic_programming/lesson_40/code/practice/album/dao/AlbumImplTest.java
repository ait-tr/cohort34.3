package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        ph = new Photo[6];
        ph[0] = new Photo(1, 1,"t1", "url1", now.minusDays(7));
        ph[1] = new Photo(1, 2,"t2", "url2", now.minusDays(7));
        ph[2] = new Photo(1, 3,"t3", "url3", now.minusDays(5));
        ph[3] = new Photo(2, 1,"t1", "url4", now.minusDays(7));
        ph[4] = new Photo(2, 2,"t2", "url5", now.minusDays(7));
        ph[5] = new Photo(2, 3,"t3", "url6", now.minusDays(7));

        // не забыть положить эти ph в альбом методом addPhoto


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

    }

    @Test
    void updatePhoto() {
    }

    @Test
    void getPhotoFromAlbum() {
    }

    @Test
    void getAllPhotoFromAlbum() {
    }

    @Test
    void getPhotoBetweenDate() {
    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}
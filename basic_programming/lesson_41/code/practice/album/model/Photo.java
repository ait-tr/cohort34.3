package practice.album.model;

import java.time.LocalDateTime;

public class Photo implements Comparable<Photo> {

    //fields
    private int albumId;
    private int photoId;
    private String title;
    private String url;
    private LocalDateTime date;

    // constructor
    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        int result = albumId;
        result = 31 * result + photoId;
        return result;
    }

    @Override
    public int compareTo(Photo o) {
        // надо определить, как сортировать объекты в массиве Photo по двум полям albumId и photoId
        int res = Integer.compare(albumId, o.albumId);
        return res !=0 ? res : Integer.compare(photoId, o.photoId); // тернарный оператор
        // if (res != 0) {return res} else {return Integer.compare(photoId, o.photoId)} - возможно и так
    }
}

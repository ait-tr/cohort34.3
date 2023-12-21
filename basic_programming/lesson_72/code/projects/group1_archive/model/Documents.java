package projects.group1_archive.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Documents implements Comparable<Documents>, Serializable {
    private int folderId;
    private int docId;
    private String title;
    private  String url;
    private LocalDateTime date;

    public Documents(int folderId, int docId, String title, String url, LocalDateTime date) {
        this.folderId = folderId;
        this.docId = docId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
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

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Document - " +
                "folder Id: " + folderId +
                ", document Id: " + docId +
                ", title: " + title +
                ", url: " + url +
                ", date/time: " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documents documents = (Documents) o;
        return folderId == documents.folderId && docId == documents.docId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, docId);
    }

    @Override
    public int compareTo(Documents o) {
        int res = Integer.compare(folderId, o.folderId);
        return res != 0 ? res : Integer.compare(docId, o.docId);
    }
}

package hw.archive.model;

import java.time.LocalDateTime;

public class Document implements Comparable<Document> {
    //fields
    private int folderId;
    private int documentId;
    private String title;
    private String url;
    private LocalDateTime date;

    // constructor
    public Document(int folderId, int documentId, String title, String url, LocalDateTime date) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Document{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Document document = (Document) object;
        return folderId == document.folderId && documentId == document.documentId;
    }

    @Override
    public int compareTo(Document o) {
        int res = Integer.compare(folderId,o.folderId); // сортировка по папке
        return res != 0 ? res: Integer.compare(documentId,o.documentId); // сортировка по документу
    }
}


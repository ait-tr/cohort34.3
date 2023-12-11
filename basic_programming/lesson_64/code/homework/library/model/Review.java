package homework.library.model;

import java.time.LocalDate;

public class Review {
    private long id;
    private int rating;
    private Reader reader;
    private String comment;
    private Book book;
    private int likes;
    private LocalDate date;

    public Review(Reader reader, Book book, int rating,  String comment ) {
        this.reader = reader;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public Reader getReader() {
        return reader;
    }

    public String getComment() {
        return comment;
    }

    public Book getBook() {
        return book;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" + " book=" + book + " rating = " + rating + ", reviewer = " + reader + ", comment = '" + comment + ", likes = " + likes + '}';
    }

}

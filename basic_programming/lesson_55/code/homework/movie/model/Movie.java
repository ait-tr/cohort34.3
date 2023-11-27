package homework.movie.model;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
    private long imdb;
    private String title;
    private String genre;
    private String director;
    private LocalDate date;

    public Movie(long imdb, String title, String genre, String director, LocalDate date) {
        this.imdb = imdb;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.date = date;
    }

    public long getImdb() {
        return imdb;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setGenre(String genre){
        this.genre = genre;
    };

    @Override
    public String toString() {
        return "Movie{" +
                "imdb=" + imdb +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return imdb == movie.imdb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imdb);
    }
}

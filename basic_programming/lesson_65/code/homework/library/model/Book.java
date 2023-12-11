package homework.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String author;
    private String name;
    private Integer issueYear; // год выпуска
    private List<Review> reviewList; // список отзывов на книгу

    public Book(String author, String name, Integer issueYear) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.reviewList = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(issueYear, book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.getAuthor());
    }

    // рейтинг книги по оценкам в ее отзывах
    public double bookAvgRating(){
        int sum = reviewList.stream()
                .mapToInt(b -> b.getRating())
                .sum();
        return sum/reviewList.size();
    }

}

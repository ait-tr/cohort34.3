package homework.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;
    private List<Review> reviews;

    public Library(){
        init();
    }

    private void init() {
        books = new ArrayList<>();
        // добавляем книги
        books.add(new Book("George Orwell", "1984", 1949)); // 0
        books.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997)); // 1
        books.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 1954)); // 2
        books.add(new Book("Harper Lee", "To Kill a Mockingbird", 1960)); // 3
        books.add(new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925)); // 4
        books.add(new Book("Leo Tolstoy", "War and Peace", 1869)); //5

        // добавляем читателей
        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true)); // 0
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2

        // журнал выдачи книг
        readers.get(0).getBooks().add(books.get(0)); // Иванов взял книгу Джордж Оруэлл
        readers.get(1).getBooks().add(books.get(0)); // Петров взял книгу Оруэлла
        readers.get(1).getBooks().add(books.get(1)); // Петров взял книгу с индексом 1
        readers.get(1).getBooks().add(books.get(4)); // Петров взял книгу с индексом 4
        readers.get(2).getBooks().add(books.get(0)); // Сидоров взял Оруэлла
        readers.get(2).getBooks().add(books.get(2)); // Сидоров взял Tolkien

        // отзывы читателей о книгах
        reviews = new ArrayList<>();
        reviews.add(new Review(readers.get(0),books.get(0), 5, "Very good!"));
        reviews.add(new Review(readers.get(0),books.get(0), 4, ""));
        reviews.add(new Review(readers.get(0),books.get(0), 4, "Bad!"));
        reviews.add(new Review(readers.get(0),books.get(0), 4, "Awful!"));
        reviews.add(new Review(readers.get(0),books.get(0), 4, "Brilliant!"));
        reviews.add(new Review(readers.get(0),books.get(0), 3, "Good!"));
        reviews.add(new Review(readers.get(0),books.get(0), 5, "Good!"));
        reviews.add(new Review(readers.get(1),books.get(1), 3, "Excellent!")); // Петров дал отзыв нв Гарри Поттера

    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public List<Review> getReviews(){
        return reviews;
    }
 }

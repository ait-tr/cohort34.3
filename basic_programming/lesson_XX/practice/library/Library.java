package practice;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init(); // метод для заполнения данных
    }

    private void init() {
        books = new ArrayList<>();
        // добавляем книги
        books.add(new Book("Джорж Оруэлл", "1984", 2021)); // 0
        books.add(new Book("Жюль Верн", "Таинственный остров", 2019)); // 1
        books.add(new Book("Герман Гессе", "Игра в бисер", 2004)); // 2
        books.add (new Book("Лев Толстой", "Война и мир", 1990)); // 3
        //и так далее для других книг

        // добавляем читателей
        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true)); // 0
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2
        //и так далее для других читателей

        // бизнес-журнал
        readers.get(0).getBooks().add(books.get(0)); // Иванов взял Оруэлла
        readers.get(1).getBooks().add(books.get(0)); // Петров взял Оруэлла
        readers.get(1).getBooks().add(books.get(1)); // Петров взял Верна
        readers.get(1).getBooks().add(books.get(2)); // Петров взял Гессе
        readers.get(2).getBooks().add(books.get(0)); // Сидоров взял Оруэлла
        readers.get(2).getBooks().add(books.get(2)); // Сидоров взял Гессе

        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}

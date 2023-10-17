package homework.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        book[0] = new Book(1001L, "Александр Пушкин", "Евгений Онегин", 2000);
        book[1] = new Book(1002L, "Михаил Лермонтов", "Герой нашего времени", 2002);
        book[2] = new Book(1003L, "Лев Толстй", "Анна Каренина", 1990);
        book[3] = new Book(1004L, "Федор Достоевский", "Бесы", 2010);

    }

    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующую книгу
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(105, "Владимир Орлов", "Альтист Данилов", 2011); // создали новую книгу
        assertTrue(library.addBook(book1)); // добавили нового сотрудника
        assertEquals(5, library.quantity()); // теперь в библиотеке 5 книг
        // создаем еще одного нового
        Book employee2 = new Book(106, "Peter", "Dubin", 2021); // создали нового сотрудника
        assertFalse(library.addBook(employee2)); // не можем превысить capacity
    }

    @Test
    void removeBook() {
    }

    @Test
    void findBook() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printBook() {
    }
}
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
        book[0] = new Book(101L, "Александр Пушкин", "Евгений Онегин", 2000);
        book[1] = new Book(102L, "Михаил Лермонтов", "Герой нашего времени", 2002);
        book[2] = new Book(103L, "Лев Толстй", "Анна Каренина", 1990);
        book[3] = new Book(104L, "Федор Достоевский", "Бесы", 2010);

    }

    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующую книгу
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(105L, "Владимир Орлов", "Альтист Данилов", 2011); // создали новую книгу
        assertTrue(library.addBook(book1)); // добавили нового сотрудника
        assertEquals(5, library.quantity()); // теперь в библиотеке 5 книг
        // создаем еще одного нового
        Book employee2 = new Book(106L, "Peter", "Dubin", 2021); // создали нового сотрудника
        assertFalse(library.addBook(employee2)); // не можем превысить capacity
    }

    @Test
    void removeBook() {
        // удаляем книгу
        assertEquals(book[1],library.removeBook(101L));
        // проверяем книг после удаления
        assertEquals(2,library.quantity());
        // проверяем, можем ли удалить дважды
        assertNull(library.removeBook(101L));
        // проверяем повторным поиском, что не возможно найти после удаления - вернется null
        assertNull(library.removeBook(101L));
    }


    @Test
    void findBook() {
        // ищем книгу по isbn
        assertEquals(book[2], library.findBook(102L));
        // ищем несуществующую книгу
        assertNull(library.findBook(106L));
    }

    @Test
    void quantity() {

    }

    @Test
    void printBook() {
    }
}
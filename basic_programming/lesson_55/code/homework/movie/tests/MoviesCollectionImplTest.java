package homework.movie.tests;

import homework.movie.dao.MoviesCollection;
import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {

    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImpl( List.of(
                new Movie( 1, "T1", "G1", "D1", now.minusYears( 3 ) ),
                new Movie( 2, "T2", "G2", "D2", now.minusYears( 4 ) ),
                new Movie( 3, "T3", "G1", "D1", now.minusYears( 1 ) ),
                new Movie( 4, "T4", "G2", "D3", now.minusYears( 2 ) ),
                new Movie( 1, "T1", "G1", "D1", now.minusYears( 3 ) ) ) );
    }

    @Test
    void testConstructor(){
    // вызываем конструктор с двумя одинаковыми объектами
    moviesCollection = new MoviesCollectionImpl(List.of(
            new Movie(1, "T1","G1", "D1", now.minusYears(2)),
            new Movie(1, "T1","G1", "D1", now.minusYears(2))
            ));
    // проверяем, что добавился только один объект
    assertEquals(1,moviesCollection.totalQuantity());
}
    @Test
    void addMovie() {
        // Добавление null должно вернуть false.
        assertFalse( moviesCollection.addMovie( null ) );
        // Добавление уже существующего должно вернуть false
        assertFalse( moviesCollection.addMovie( new Movie( 2, "T2", "G2", "D2", now.minusYears( 4 ) ) ) );
        assertEquals( 5, moviesCollection.totalQuantity() );
        // Добавление нового элемента
        assertTrue( moviesCollection.addMovie( new Movie( 6, "T6", "G6", "D6", now.minusYears( 8 ) ) ) );
        // Проверка, что фильм добавился
        assertEquals( 6, moviesCollection.totalQuantity() );

    }

    @Test
    void removeMovie() {
        // Проверка удаления несуществующего фильма
        assertNull( moviesCollection.removeMovie( 6 ) );
        assertEquals( 5, moviesCollection.totalQuantity() );
        // Проверка удаления существующего фильма
        assertNotNull( moviesCollection.removeMovie( 5 ) );
        // Проверка количества фильмов после удаления
        assertEquals( 4, moviesCollection.totalQuantity() );
    }

    @Test
    void findById() {
        // Поиск фильма метод findByIdTest должен вернуть не-null
        Movie movie = (Movie) moviesCollection.findById( 3 );
        assertNotNull( movie ); // Проверка, что найден фильм
        assertEquals( "T3", movie.getTitle() );// Проверка по title найденного фильма
    }

    @Test
    void findByGenre() {
        // Поиск фильмов по жанру
        Iterable<Movie> movies = moviesCollection.findByGenre("G1");
        int count = 0;// счетчик
        for (Movie movie : movies) { // Перебор фильмов
            assertEquals("G1", movie.getGenre()); // Проверка жанра найденных фильмов
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(2, count); // Проверка найденных фильмов по жанру "G1"
    }

    @Test
    void findByDirector() {
        // Поиск фильмов по режиссеру
        Iterable<Movie> movies = moviesCollection.findByDirector("D1");
        int count = 0;// счетчик
        for (Movie movie : movies) { // Перебор фильмов
            assertEquals("D1", movie.getDirector()); // Проверка жанра найденных фильмов
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(2, count); // Проверка найденных фильмов по жанру "D1"
    }

    @Test
    void findMoviesCreatedBetweenDates() {
        // Определение начальной и конечной дат для поиска фильмов
        LocalDate startDate = LocalDate.now().minusYears(4);
        LocalDate endDate = LocalDate.now().minusYears(1);
        // Поиск фильмов, между указанными датами
        Iterable<Movie> movies = moviesCollection.findMoviesCreatedBetweenDates(startDate, endDate);
        int count = 0; // счетчик
        for (Movie movie : movies) { // Перебор фильмов
            // Проверка, что фильмы были созданы после начальной даты или включают эту дату
            assertTrue(movie.getDate().isAfter(startDate) || movie.getDate().isEqual(startDate));
            // Проверка, что фильмы были созданы до конечной даты или включают эту дату
            assertTrue(movie.getDate().isBefore(endDate) || movie.getDate().isEqual(endDate));
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(3, count); // Проверка найденных фильмов, созданных между указанными датами
    }

    @Test
    void totalQuantity() {
    }

    @Test
    void iterator() {
    }
}
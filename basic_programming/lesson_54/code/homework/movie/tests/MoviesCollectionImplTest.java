package homework.movie.tests;

import homework.movie.dao.MoviesCollection;
import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.citizens.dao.Citizens;
import practice.citizens.dao.CitizensImpl;
import practice.citizens.model.Person;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {

    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImpl(List.of(
                new Movie(101, "T1", "G1", "D1", now.minusYears(10)),
                new Movie(102, "T2", "G2", "D2", now.minusYears(12)),
                new Movie(103, "T3", "G3", "D1", now.minusYears(2)),
                new Movie(104, "T4", "G4", "D3", now.minusYears(5))
        ));
    }

    @Test
    void addMovie() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(102, "T2", "G2", "D2", now.minusYears(12))));
        assertEquals(4, moviesCollection.totalQuantity());
        assertTrue(moviesCollection.addMovie(new Movie(105, "T4", "G4", "D3", now.minusYears(5))));
        assertEquals(5, moviesCollection.totalQuantity());
    }

    @Test
    void removeMovie() {

    }

    @Test
    void findById() {

    }

    @Test
    void findByGenre() {
    }

    @Test
    void findByDirector() {
    }

    @Test
    void findMoviesCreatedBetweenDates() {
    }

    @Test
    void totalQuantity() {
    }

    @Test
    void iterator() {
    }
}
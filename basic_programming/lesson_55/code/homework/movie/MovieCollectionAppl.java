package homework.movie;

import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieCollectionAppl {

    static final LocalDate now = LocalDate.now();
    public static void main(String[] args) {

        // создаем новую коллекцию
        MoviesCollectionImpl moviesCollection = new MoviesCollectionImpl();
        moviesCollection.addMovie(new Movie(1,"T1", "G1", "D1", LocalDate.of(2015, 4, 1)));
        // дубликат по imdb
        moviesCollection.addMovie(new Movie(1,"T2", "G2", "D3", LocalDate.of(2010, 4, 1)));
        moviesCollection.addMovie(new Movie(3,"T3", "G3", "D3", LocalDate.of(2019, 4, 1)));
        moviesCollection.addMovie(new Movie(4,"T4", "G1", "D1", LocalDate.of(2020, 4, 1)));
        moviesCollection.addMovie(new Movie(5,"T5", "G2", "D5", LocalDate.of(2022, 4, 1)));
        System.out.println("----------------------");
        System.out.println("Movies collection: ");
        for (Movie m : moviesCollection) {
            System.out.println(m);
        }

         System.out.println("-----------------------");
        System.out.println("Movies from ... to: ");

        LocalDate fiveYearsAgo = LocalDate.now().minusYears( 5 );
        LocalDate now = LocalDate.now();

        Iterable<Movie> found = moviesCollection.findMoviesCreatedBetweenDates(fiveYearsAgo, now);
        for (Movie m : found) {
            System.out.println(m);
        }

        System.out.println("-----------------------");
        System.out.println("Movies with genre G1: ");
        Iterable<Movie> foundByGenre = moviesCollection.findByGenre("G1");
        for (Movie m : foundByGenre) {
            System.out.println(m);
        }

    }
}

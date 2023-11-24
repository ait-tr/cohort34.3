package homework.movie;

import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieCollectionAppl {

    static final LocalDate now = LocalDate.now();
    public static void main(String[] args) {

        List<Movie> listMovies = new ArrayList<>();

        Movie[] movie = new Movie[6];
        movie[0] = new Movie(101, "T1", "G1", "D1", now.minusYears(20));
        movie[1] = new Movie(101, "T2", "G2", "D2", now.minusYears(22));
        movie[2] = new Movie(102, "T3", "G1", "D1", now.minusYears(2));
        movie[3] = new Movie(103, "T4", "G3", "D2", now.minusYears(12));
        movie[4] = new Movie(104, "T5", "G4", "D3", now.minusYears(15));

        for (int i = 0; i < movie.length; i++) {
            listMovies.add(movie[i]);
        }

        MoviesCollectionImpl moviesCollection = new MoviesCollectionImpl(listMovies);

        for (Movie m : moviesCollection) {
            System.out.println(m);
        }

    }
}

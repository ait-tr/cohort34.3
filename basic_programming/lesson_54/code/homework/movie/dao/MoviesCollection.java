package homework.movie.dao;

import homework.movie.model.Movie;

import java.time.LocalDate;

public interface MoviesCollection extends Iterable<Movie>{
    boolean addMovie(Movie movie);
    Movie removeMovie(long imdb);
    Movie findById(long imdb);
    Iterable<Movie> findByGenre(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to);
    int totalQuantity();

}

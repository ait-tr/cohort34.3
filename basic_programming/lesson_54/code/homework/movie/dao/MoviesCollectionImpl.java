package homework.movie.dao;

import homework.movie.model.Movie;
import practice.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MoviesCollectionImpl implements MoviesCollection {
    // поле для хранения объекта типа List
    private List<Movie> moviesList; // список фильмов

    // конструктор
    public MoviesCollectionImpl() {
        moviesList = new ArrayList<>(); // делаем этот List уже конкретным ArrayList
    }

    // заполняем ArrayList объектами из списка фильмов List<Movie> movies, который подаем на вход
    public MoviesCollectionImpl (List<Movie> movies){
        this();
        for (Movie m : movies) {
            moviesList.add(m);
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        // null не добавляем
        if(movie == null){
            return false;
        }
        // нельзя добавить фильм с таким же imdb
        if (findById(movie.getImdb()) != null){
            return false;
        }
        // или еще можно так
        if(moviesList.contains(movie)) {
            return false;
        }
        // добавляем фильм
        moviesList.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findById(imdb);
        if (victim != null) {
            moviesList.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Movie findById(long imdb) {
        // в moviesList надо найти элемент, у которого совпадает imdb с искомым
        for (Movie m : moviesList) {
            if(m.getImdb() == imdb) {
               return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : moviesList) {
            if(m.getGenre().equals(genre)) {
                moviesList.add(m);
            }
        }
        return foundByGenre;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        // по аналогии с findByGenre
        return null;
    }


    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {

        return null;
    }

    @Override
    public int totalQuantity() {
        return moviesList.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return moviesList.iterator();
    }
}

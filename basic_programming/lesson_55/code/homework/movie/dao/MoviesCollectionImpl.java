package homework.movie.dao;

import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MoviesCollectionImpl implements MoviesCollection<Movie> {
    // поле для хранения
    private Collection<Movie> movies; // коллекция фильмов

    public MoviesCollectionImpl() {
        this.movies = new ArrayList<>();
    }

    // заполняем ArrayList объектами из списка фильмов List<Movie> movies, который подаем на вход конструктора
    public MoviesCollectionImpl (List<Movie> list){
        this();
        for (Movie m : list) {
            addMovie(m); // вызываем метод из класса
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        // null не добавляем
        if(movie == null){
            return false;
        }
        // нельзя добавить фильм, если он уже есть
        if(movies.contains(movie)) {
            return false;
        }
        // добавляем фильм
        movies.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findById(imdb);
        if (victim != null) {
            movies.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Movie findById(long imdb) {
        // в moviesList надо найти элемент, у которого совпадает imdb с искомым
        for (Movie m : movies) {
            if(m.getImdb() == imdb) {
               return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getGenre().equals(genre)) {
                foundByGenre.add(m);
            }
        }
        return foundByGenre;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        // по аналогии с findByGenre
        List<Movie> foundByDirector = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getDirector().equals(director)) {
                foundByDirector.add(m);
            }
        }
        return foundByDirector;
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        // отобрать нужные фильмы с датами большими from и меньшими to в новый список
        List<Movie> foundMoviesCreatedBetweenDates = new ArrayList<>(); // создаем новый список
        for (Movie m : movies) { // перебираем все фильмы
            if(m.getDate().isAfter(from) && m.getDate().isBefore(to) || m.getDate().isEqual(to)) { // находим с нужными датами
                foundMoviesCreatedBetweenDates.add(m); // добавляем в новый список
            }
        }
        return foundMoviesCreatedBetweenDates; // вернуть этот список
    }

    @Override
    public int totalQuantity() {
        return movies.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}

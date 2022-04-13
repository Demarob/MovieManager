package ru.Netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.Netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager movie = new MovieManager();

    private Movie movie1 = new Movie(1, "Бладшот", "боевик", false);
    private Movie movie2 = new Movie(2, "Вперёд", "мультфильм", false);
    private Movie movie3 = new Movie(3, "Отель 'Белград'", "комедия", false);
    private Movie movie4 = new Movie(4, "Джентельмены", "боевик", false);
    private Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы", false);
    private Movie movie6 = new Movie(6, "Тролли. Мировой тур", "мультфильм", true);
    private Movie movie7 = new Movie(7, "Номер один", "комедия", true);
    private Movie movie8 = new Movie(8, "Человек-невидимка", "ужасы", false);
    private Movie movie9 = new Movie(9, "Тролли. Мировой тур", "мультфильм", true);
    private Movie movie10 = new Movie(10, "Номер один", "комедия", true);
    private Movie movie11 = new Movie(11, "Номер один", "комедия", true);

    @Test
    public void shouldAddMovie() {
        movie.add(movie1);
        movie.add(movie2);

        Movie[] expected = {movie1, movie2};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        Movie[] expected = {};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {
        MovieManager movie = new MovieManager(5);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenMovie() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit5() {
        MovieManager movie = new MovieManager(5);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }
}
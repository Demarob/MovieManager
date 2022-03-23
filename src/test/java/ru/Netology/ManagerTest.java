package ru.Netology;

import org.junit.jupiter.api.Test;
import ru.Netology.domain.Movie;
import ru.Netology.manager.Manager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ManagerTest {
    Movie movie1 = new Movie(11, 1, "Bladshot", "action movie");
    Movie movie2 = new Movie(22, 2, "Forward", "cartoon");
    Movie movie3 = new Movie(33, 3, "Hotel Belgrad", "comedy");
    Movie movie4 = new Movie(44, 4, "Gentleman", "action movie");
    Movie movie5 = new Movie(55, 5, "Invisible Man", "horrors");
    Movie movie6 = new Movie(66, 6, "Trolls", "cartoon");
    Movie movie7 = new Movie(77, 7, "Number One", "comedy");
    Movie movie8 = new Movie(88, 8, "Cry", "horrors");
    Movie movie9 = new Movie(99, 9, "9/5", "action movie");
    Movie movie10 = new Movie(100, 10, "Wind", "cartoon");
    Movie movie11 = new Movie(110, 11, "Trio", "comedy");

    Manager movie = new Manager();

    @Test
    public void shouldAddMovie(){

        Movie.add(movie1);
        Movie.add(movie2);

        Movie[]expected = {movie1,movie2};
        Movie[]actual = movie.findAll();

        assertArrayEquals(expected,actual);

    }

    @Test
    public void shouldFindAllOverLimit(){

        Movie.add(movie1);
        Movie.add(movie2);
        Movie.add(movie3);
        Movie.add(movie4);
        Movie.add(movie5);
        Movie.add(movie6);
        Movie.add(movie7);
        Movie.add(movie8);
        Movie.add(movie9);
        Movie.add(movie10);
        Movie.add(movie11);

        Movie[]expected = {movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11};
        Movie[]actual = movie.findAll();

        assertArrayEquals(expected,actual);

    }

    @Test
    public void findLast(){

        Movie.add(movie1);
        Movie.add(movie2);
        Movie.add(movie3);
        Movie.add(movie4);
        Movie.add(movie5);
        Movie.add(movie6);
        Movie.add(movie7);
        Movie.add(movie8);
        Movie.add(movie9);
        Movie.add(movie10);

        Movie[]expected = {movie10,movie9,movie8,movie7,movie6,movie5,movie4,movie3,movie2,movie1};
        Movie[]actual = movie.findAll();

        assertArrayEquals(expected,actual);

    }

    @Test
    public void findLastThree(){

        Movie.add(movie1);
        Movie.add(movie2);
        Movie.add(movie3);


        Movie[]expected = {movie3,movie2,movie1};
        Movie[]actual = movie.findAll();

        assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldFindNullMovie(){

        Movie[]expected = {};
        Movie[]actual = movie.findAll();

        assertArrayEquals(expected,actual);

    }
}

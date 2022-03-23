package ru.Netology.manager;

import ru.Netology.domain.Movie;

public class Manager {

    private int countMovie = 10;
    private Movie[] movies = new Movie[0];

    public Manager(int countMovie) {
        this.countMovie = countMovie;
    }

    public Manager() {

    }

    public void add (Movie movie) {
        int lenght = movies.length + 1;
        Movie[] tmp = new Movie[lenght];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;

    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLastTen() {
        int resultLength = movies.length;
        if (resultLength >= countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;

    }

}

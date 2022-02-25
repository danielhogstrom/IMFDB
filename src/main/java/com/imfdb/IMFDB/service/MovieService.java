package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> getMovies() {
        return repository.getMovies();
    }

    public Movie findMovieById(int id) {
        for (Movie movie : getMovies()) {
            if (id == movie.getId()) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByGenre(String genre){
        List<Movie> movies = new ArrayList<>();
        for (Movie movie : repository.getMovies()){
            if (movie.getGenre().equals(genre)){
                movies.add(movie);
            }
        }
        return movies;
    }

    public boolean addMovie(Movie movie) {
        int id = repository.getMovies().size()+1;
        movie.setId(id);
        return repository.getMovies().add(movie);
    }
}
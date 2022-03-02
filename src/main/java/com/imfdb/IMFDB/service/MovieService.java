package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> getMovies() {
        return repository.findAll();
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
        for (Movie movie : repository.findAll()){
            if (movie.getGenre().equals(genre)){
                movies.add(movie);
            }
        }
        return movies;
    }

    public boolean addMovie(Movie movie) {
        int id = repository.findAll().size()+1;
        movie.setId(id);
        return repository.findAll().add(movie);
    }
}
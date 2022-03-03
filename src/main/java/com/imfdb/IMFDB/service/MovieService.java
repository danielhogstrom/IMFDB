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
      return repository.findById(id).orElse(new Movie());
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

    public Movie addMovie(Movie movie) {
        return repository.save(movie);
    }
}
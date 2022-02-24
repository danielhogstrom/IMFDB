package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;

import java.util.List;

public class MovieService {
    MovieRepository repository;

    public MovieService(){
        repository = new MovieRepository();
    }

    public List<Movie> getMovies(){
        return repository.getMovies();
    }

    public Movie getMovie(int id){return getMovies().get(id);}
}

package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> getMovies(){
        return repository.getMovies();
    }

    public Movie findMovieById(int id){
        List<Movie> movies = repository.getMovies();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id ){
                return movies.get(i);
            }
        }
        return null;
    }

    public boolean addMovie(Movie movie){
        return repository.getMovies().add(movie);
    }
}

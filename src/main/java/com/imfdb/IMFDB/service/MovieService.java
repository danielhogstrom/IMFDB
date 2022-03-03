package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        repository.save(movie);
        return repository.findAll().add(movie);
    }

    public Movie featured(){
        List<Movie> movies = repository.findMovieByYearMade(2001);
        Random random = new Random();
        int r = random.nextInt(1);
        return movies.get(r);
    }
}

//LocalDate.EPOCH.getYear()
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

    public Movie getMovie(int id){
        for (Movie movie: getMovies()) {    // för att få fram en specifik id så gjorde vi en loop här.
            if (id == movie.getId()){
                return movie;
            }
        }
        return null;
    }
}

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

    //vi behöver en metod här som heter getMovie som hjälper oss att plocka ut ett id
}

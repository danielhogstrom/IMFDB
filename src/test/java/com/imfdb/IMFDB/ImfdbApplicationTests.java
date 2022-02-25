package com.imfdb.IMFDB;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.service.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ImfdbApplicationTests {
    @Autowired
    MovieService service;

    @Test
    void contextLoads() {
    }

    @Test
    void testFindMovie() {
        Movie movie = service.findMovieById(3);
        Assertions.assertEquals(3, movie.getId());
    }

    @Test
    void testGetMovieByGenre() {
        List<Movie> movies = service.getMoviesByGenre("Comedy");

        for (Movie movie : movies) {
            Assertions.assertEquals("Comedy", movie.getGenre());
        }
    }

}



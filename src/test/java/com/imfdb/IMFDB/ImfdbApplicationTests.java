package com.imfdb.IMFDB;

import com.imfdb.IMFDB.entity.Genre;
import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.service.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
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
        List<Movie> movies = service.getMoviesByGenre("Sport");

        for (Movie movie : movies) {
            for (Genre genre : movie.getGenre()){
                if (genre.toString() != "Sport")
                    continue;
                Assertions.assertEquals("Sport", genre.toString());
            }
        }
        movies = service.getMoviesByGenre("Drama");

        for (Movie movie : movies) {
            for (Genre genre : movie.getGenre()){
                if (genre.toString() != "Drama")
                    continue;
                Assertions.assertEquals("Drama", genre.toString());
            }
        }
    }

}



package com.imfdb.IMFDB.repository;

import com.imfdb.IMFDB.entity.Movie;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private @Getter
    List<Movie> movies;

    public MovieRepository(){
        this.movies = new ArrayList<>();
        movies.add(new Movie("Lord of the ring", "Fantasy" , 2001 , "Peter Jackson", 11,  "https://tinyurl.com/4e4pe9fm", "2:58"));
        movies.add(new Movie("Titanic", "Drama", 1997, "James cameron", 11, "https://tinyurl.com/3u63mry4", "3:14"));
        movies.add(new Movie("The Gentleman", "Comedy", 2019, "Guy Ritchie", 15, "https://tinyurl.com/zc282h7u", "1.53"));
        movies.add(new Movie("American Pie", "Comedy", 1999, "Paul Weitz", 15,"https://tinyurl.com/5c3jds4c", "1:40"));
        movies.add(new Movie("Jurassic Park", "Adventure", 1993, "Steven Spielberg", 11 ,"https://tinyurl.com/2pxa4354", "2:20"));
        movies.add(new Movie("The Big Blue", "Drama", 1987, "Luc Besson", 11, "https://tinyurl.com/2p83wwpc", "2:48"));
        movies.add(new Movie("The adventures of Tintin", "Drama", 2011, "Steven Spielberg", 11, "https://tinyurl.com/mtjev39r", "1:47"));
    }

    public boolean addMovie(Movie movie){
        return movies.add(movie);
    }

}
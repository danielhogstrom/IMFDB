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
        movies.add(new Movie(1,"Lord of the ring", "Fantasy" ,"Good movie", 2001 , "Peter Jackson", 11,  "https://tinyurl.com/4e4pe9fm", "2:58"));
        movies.add(new Movie(2,"Titanic", "Drama","Good movie", 1997, "James cameron", 11, "https://tinyurl.com/3u63mry4", "3:14"));
        movies.add(new Movie(3,"The Gentleman", "Comedy","Good movie", 2019, "Guy Ritchie", 15, "https://tinyurl.com/zc282h7u", "1.53"));
        movies.add(new Movie(4,"American Pie", "Comedy","Good movie", 1999, "Paul Weitz", 15,"https://tinyurl.com/5c3jds4c", "1:40"));
        movies.add(new Movie(5,"Jurassic Park", "Adventure", "Good movie",1993, "Steven Spielberg", 11 ,"https://tinyurl.com/2p8eh9j5", "2:20"));
        movies.add(new Movie(6,"The Big Blue", "Drama","Good movie", 1987, "Luc Besson", 11, "https://tinyurl.com/2p83wwpc", "2:48"));
        movies.add(new Movie(7,"The adventures of Tintin", "Drama","Good movie", 2011, "Steven Spielberg", 11, "https://tinyurl.com/5xamvdfs", "1:47"));
    }

    public boolean addMovie(Movie movie){
        return movies.add(movie);
    }

}
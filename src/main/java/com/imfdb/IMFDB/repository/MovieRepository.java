package com.imfdb.IMFDB.repository;

import com.imfdb.IMFDB.entity.Movie;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private @Getter
    List<Movie> movies;

    public MovieRepository(){
        this.movies = new ArrayList<>();
        movies.add(new Movie(1,"The Lord of the rings", "Fantasy" ,"It's like the book about a ring, but more of a movie", 2001 , "Peter Jackson", 11,  "https://tinyurl.com/4e4pe9fm", "2:58"));
        movies.add(new Movie(2,"Titanic", "Drama","Leonardo paints like it's a french girl", 1997, "James cameron", 11, "https://tinyurl.com/3u63mry4", "3:14"));
        movies.add(new Movie(3,"The Gentleman", "Comedy","A story about not so gentle men", 2019, "Guy Ritchie", 15, "https://tinyurl.com/guyRitchman", "1.53"));
        movies.add(new Movie(4,"American Pie", "Comedy","A love story about a guy and his pie", 1999, "Paul Weitz", 15,"https://tinyurl.com/5c3jds4c", "1:40"));
        movies.add(new Movie(5,"Jurassic Park", "Adventure", "A movie about a adventure park owner that spares no expense",1993, "Steven Spielberg", 11 ,"https://tinyurl.com/2p8eh9j5", "2:20"));
        movies.add(new Movie(6,"The Big Blue", "Drama","It's about a lake or something idk..", 1987, "Luc Besson", 11, "https://tinyurl.com/2p83wwpc", "2:48"));
        movies.add(new Movie(7,"The adventures of Tintin", "Drama","Your beloved french cartoon comes to life with the direction of Speilbergo", 2011, "Steven Spielberg", 11, "https://tinyurl.com/5xamvdfs", "1:47"));
        movies.add(new Movie(8,"Resident Evil: Welcome to Raccoon City", "Horror","A movie that hit's you like a pile of steaming garbage", 2021, "Johannes Roberts", 15, "https://tinyurl.com/residenteviiiil", "1:47"));
        movies.add(new Movie(9,"Twins", "Comedy","Funny movie about one long guy and one short", 1988, "Ivan Reitman", 11, "https://tinyurl.com/twinstwin", "1:47"));
        movies.add(new Movie(10,"Lethal Weapon", "Action","Mr.Gibson shoots a lot of bad guys and Mr.Glover is to old for this sh*t", 1987, "Richard Donner", 11, "https://tinyurl.com/leathalWEaponnnn", "1:49"));
        movies.add(new Movie(11,"Uncharted", "Adventure","Wahlburger is funny and Tom takes of his shirt", 2022, "Ruben Fleischer", 11, "https://tinyurl.com/unchartedd", "1:56"));
        movies.add(new Movie(12,"The Bourne Identity", "Action","Matt Damon is Jason Bourne but remembers.... NOTHING!", 2002, "Doug Liman", 11, "https://tinyurl.com/bourneidentt", "1:59"));
        movies.add(new Movie(13,"Puss In Boots", "Adventure","Now Zorro is a cat in boots", 2011, "Chris Miller", 8, "https://tinyurl.com/pussinbootyz", "1:30"));
        movies.add(new Movie(14,"Snakes on a Plane", "Adventure","Samuel l. Jackson fights a bunch of snakes on a plane", 2006, "David R. Ellis", 15, "https://tinyurl.com/snakesonplaness", "1:45"));
        movies.add(new Movie(15,"Finding Nemo", "Adventure","A small piece of sushi is lost at sea", 2003, "Andrew Stanton", 8, "https://tinyurl.com/findingNemoz", "1:40"));
    }
}
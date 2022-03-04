package com.imfdb.IMFDB.repository;

import com.imfdb.IMFDB.entity.Movie;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {


    @Query(value = "SELECT * FROM Movies WHERE LOWER(title) LIKE %?1%", nativeQuery = true)
    List<Movie> findMovieWithQuery(String search);

    List<Movie> findMovieByTitleContainingIgnoreCase(String search);

    List<Movie> findMovieByYearMade(int yearMade);

    @Query(value = "SELECT * FROM MOVIES JOIN GENRE_MOVIES ON GENRE_MOVIES.MOVIES_ID=MOVIES.ID " +
            "JOIN GENRE ON GENRE_MOVIES.GENRE_ID=GENRE.ID " +
            "WHERE GENRE.GENRE =  ?1", nativeQuery = true)
    List<Movie> findMovieByGenre(String genre);


//    private @Getter
//    List<Movie> movies;
//
//    public MovieRepository(){
//        this.movies = new ArrayList<>();
//
//        movies.add(new Movie("Titanic", "Drama","Leonardo paints like it's a french girl", 1997, "James cameron", 11, "https://tinyurl.com/3u63mry4", "3:14"));
//        movies.add(new Movie("The Gentleman", "Comedy","A story about not so gentle men", 2019, "Guy Ritchie", 15, "https://tinyurl.com/guyRitchman", "1.53"));
//        movies.add(new Movie("American Pie", "Comedy","A love story about a guy and his pie", 1999, "Paul Weitz", 15,"https://tinyurl.com/5c3jds4c", "1:40"));
//        movies.add(new Movie("Jurassic Park", "Adventure", "A movie about a adventure park owner that spares no expense",1993, "Steven Spielberg", 11 ,"https://tinyurl.com/2p8eh9j5", "2:20"));
//        movies.add(new Movie("The Big Blue", "Drama","It's about a lake or something idk..", 1987, "Luc Besson", 11, "https://tinyurl.com/2p83wwpc", "2:48"));
//        movies.add(new Movie("The adventures of Tintin", "Drama","Your beloved french cartoon comes to life with the direction of Speilbergo", 2011, "Steven Spielberg", 11, "https://tinyurl.com/5xamvdfs", "1:47"));
//        movies.add(new Movie("Resident Evil: Welcome to Raccoon City", "Horror","A movie that hit's you like a pile of steaming garbage", 2021, "Johannes Roberts", 15, "https://tinyurl.com/residenteviiiil", "1:47"));
//        movies.add(new Movie("Twins", "Comedy","Funny movie about one long guy and one short", 1988, "Ivan Reitman", 11, "https://tinyurl.com/twinstwin", "1:47"));
//        movies.add(new Movie("Lethal Weapon", "Action","Mr.Gibson shoots a lot of bad guys and Mr.Glover is to old for this sh*t", 1987, "Richard Donner", 11, "https://tinyurl.com/leathalWEaponnnn", "1:49"));
//        movies.add(new Movie("Uncharted", "Adventure","Wahlburger is funny and Tom takes of his shirt", 2022, "Ruben Fleischer", 11, "https://tinyurl.com/unchartedd", "1:56"));
//        movies.add(new Movie("The Bourne Identity", "Action","Matt Damon is Jason Bourne but remembers.... NOTHING!", 2002, "Doug Liman", 11, "https://tinyurl.com/bourneidentt", "1:59"));

//        movies.add(new Movie("Puss In Boots", "Adventure","Now Zorro is a cat in boots", 2011, "Chris Miller", 8, "https://tinyurl.com/pussinbootyz", "1:30"));
//        movies.add(new Movie("Snakes on a Plane", "Adventure","Samuel l. Jackson fights a bunch of snakes on a plane", 2006, "David R. Ellis", 15, "https://tinyurl.com/snakesonplaness", "1:45"));
//        movies.add(new Movie("Finding Nemo", "Adventure","A small piece of sushi is lost at sea", 2003, "Andrew Stanton", 8, "https://tinyurl.com/findingNemoz", "1:40"));
//    }
}
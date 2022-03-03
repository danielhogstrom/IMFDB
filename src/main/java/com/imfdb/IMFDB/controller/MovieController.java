package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.MovieRepository;
import com.imfdb.IMFDB.service.MovieService;
import com.imfdb.IMFDB.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@SuppressWarnings("unused")
@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private MovieRepository repo;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Movie> movies = movieService.getMovies();
        Movie featured = movieService.featured();
        model.addAttribute("movies", movies);
        model.addAttribute("featured", featured);
        return "index";
    }

    @GetMapping("/search")
    public String getsearch(@RequestParam String search, Model model){
        List<Movie> movies = repo.findMovieByTitleContainingIgnoreCase(search);
        model.addAttribute("movies", movies);
        return "search";
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable int id, Model model) {
        Movie movie = movieService.findMovieById(id);
        model.addAttribute("movie", movie);
        model.addAttribute("reviews", reviewService.getReviewsByMovieId(id));
        model.addAttribute("review", new Review());
        return "movie";
    }

    @GetMapping("/addmovie")
    public String createMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "addmovie";
    }

    @PostMapping("/addmovie")
    public String addMovie(@ModelAttribute Movie movie) {
        movieService.addMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/filterby/{genre}")
    public String sortedlist(@PathVariable String genre, Model model){
        List<Movie> movies = movieService.getMoviesByGenre(genre);
        model.addAttribute("movies",movies);
        return "filterby";
    }

}

/*

INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Batman', 'Action', 'yet another Batman movie, yey!' ,2022, 'Matt Reeves', 13, 'tinyurl.com/nhz57tyj', '2:55');

INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Fantastic Beasts: The Secrets of Dumbledore', 'Adventure', 'A young sexy Dumbledore works his magic' ,2022, 'David Yates', 8, 'tinyurl.com/463p7vjr', '2:40');

INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Minions: The Rise of Gru', 'Animation', 'ITS SO FLUFFY' ,2022, 'Kyle Balda', 3, 'https://tinyurl.com/38u5px3m', '1:40');

INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Doctor Strange in the Multiverse of Madness', 'Action', 'this world is your world, this world is my world, no wait thats your world, no wait thats my world' ,2022, 'Sam Raimi', 11, 'tinyurl.com/3nbmmdr6', '2:55');


INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Snakes on a Plane', 'Adventure', 'Samuel l. Jackson fights a bunch of snakes on a plane' ,2006, 'David R. Ellis', 15, 'https://tinyurl.com/snakesonplaness', '1:45');

INSERT INTO MOVIES (title, genre, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Doctor Strange in the Multiverse of Madness', 'Adventure', 'A small piece of sushi is lost at sea' ,2003, 'Andrew Stanton', 8, 'https://tinyurl.com/findingNemoz', '1:40');
 */
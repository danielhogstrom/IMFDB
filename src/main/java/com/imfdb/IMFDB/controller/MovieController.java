package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Genre;
import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.service.MovieService;
import com.imfdb.IMFDB.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@SuppressWarnings("unused")
@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Movie> movies = movieService.getMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable int id, Model model) {
        Movie movie = movieService.findMovieById(id);
        String genre = "";

        for(Genre movie1 : movie.getGenre()) {
            genre+= movie1.toString() + "  ";
        }
        model.addAttribute("movie", movie);
        model.addAttribute("reviews", movie.getReview());
        model.addAttribute("review", new Review());
        model.addAttribute("genre", genre);
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
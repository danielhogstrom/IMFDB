package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.ReviewRepository;
import com.imfdb.IMFDB.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.AttributedString;
import java.util.List;

@SuppressWarnings("unused")
@Controller
public class MovieController {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieService service;


    @GetMapping("/")
    public String getIndex(Model model) {
        List<Movie> movies = service.getMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable int id, Model model) {
        Movie movie = service.findMovieById(id); // vi har ändrat så denna nu tar in id.
        model.addAttribute("movie", movie);
        List<Review> reviews = reviewRepository.getReviews();
        model.addAttribute("reviews", reviews);
        return "movie";
    }

    @GetMapping("/addmovie")
    public String createMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "addmovie";
    }

    @PostMapping("/addmovie")
    public String addMovie(@ModelAttribute Movie movie ) {
        if (service.addMovie(movie)) {
            return "redirect:/";
        }
        return "addmovie";
    }
}
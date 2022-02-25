package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.ReviewRepository;
import com.imfdb.IMFDB.service.MovieService;
import com.imfdb.IMFDB.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("unused")
@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie/review/{movieId}")
    public String addReview(@PathVariable int movieId, @ModelAttribute Review review) {
        Movie movie = movieService.findMovieById(movieId);
        if (movie.getReviews() != null){
            movie.getReviews().add(review);
        }
        return "redirect:/movie/" + movieId;
    }

    @GetMapping("movie/review/{movieId}")
    public String viewReviews(@PathVariable int movieId, Model model){
        Movie movie = movieService.findMovieById(movieId);
        List<Review> reviews = reviewService.getReviewsByMovieId(movieId);
        model.addAttribute("movie", movie);
        model.addAttribute("reviews", reviews);
        return "reviews";
    }
}

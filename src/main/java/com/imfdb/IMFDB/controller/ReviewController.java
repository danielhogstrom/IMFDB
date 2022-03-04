package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.service.MovieService;
import com.imfdb.IMFDB.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SuppressWarnings("unused")
@Controller
public class ReviewController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/movie/review/{movieId}")
    public String addReview(@PathVariable int movieId, @ModelAttribute Review review) {
        Movie movie = movieService.findMovieById(movieId);
        review.setMovie(movie);
        reviewService.addReview(review);
        return "redirect:/movie/" + movieId;
    }
}

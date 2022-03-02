package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class ReviewService {
    @Autowired
    MovieService movieService;

    public List<Review> getReviewsByMovieId(int id) {
        Movie movie = movieService.findMovieById(id);
        return movie.getReviews();
    }
}



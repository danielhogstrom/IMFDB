package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public Set<Review> getReviewsByMovieId(int id) {
        Set<Review> reviews = reviewRepository.findByMovieId(id);
        return reviews;
    }

    public Review addReview(Review review){
        return reviewRepository.save(review);
    }
}

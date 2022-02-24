package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping("/reviews")
    public Review addReview(@RequestBody Review review) {
        reviewRepository.addReview(review);
        return review;
    }
}

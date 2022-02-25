package com.imfdb.IMFDB.service;

import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository repository;

    public List<Review> getReviews() { return repository.getReviews();


// ska vi lägga till en liknande som under Movie Service
// public Review getReview(int id){return getReview().get(id);}
}

}

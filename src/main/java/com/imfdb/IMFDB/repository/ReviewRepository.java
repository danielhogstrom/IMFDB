package com.imfdb.IMFDB.repository;

import com.imfdb.IMFDB.entity.Review;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
//
//    private @Getter
//    List<Review>reviews;
//
//    public ReviewRepository() {
//        this.reviews = new ArrayList<>();
//    }
//
//    public boolean addReview(Review review) {
//        return reviews.add(review);
//    }
//




}

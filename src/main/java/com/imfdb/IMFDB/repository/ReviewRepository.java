package com.imfdb.IMFDB.repository;

import com.imfdb.IMFDB.entity.Review;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    public Set<Review> findByMovieId(int id);
}

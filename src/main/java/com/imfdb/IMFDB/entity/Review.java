package com.imfdb.IMFDB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String name;
    int score;
    String input;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}



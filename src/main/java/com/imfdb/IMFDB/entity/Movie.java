package com.imfdb.IMFDB.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String genre;
    private String description;
    private int yearMade;
    private String director;
    private int recommendedAge;
    private String imgUrl;
    private String length;
    private List<Review> reviews;

    public Movie(int id, String title,
                 String genre,
                 String description,
                 int yearMade,
                 String director,
                 int recommendedAge,
                 String imgUrl, String length) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.yearMade = yearMade;
        this.director = director;
        this.recommendedAge = recommendedAge;
        this.imgUrl = imgUrl;
        this.length = length;
        this.reviews = new ArrayList<>();
    }
}

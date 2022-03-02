package com.imfdb.IMFDB.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String genre;
    private String description;
    private int yearMade;
    private String director;
    private int recommendedAge;
    private String imgUrl;
    @Column(name = "movie_length")
    private String length;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Movie(String title,
                 String genre,
                 String description,
                 int yearMade,
                 String director,
                 int recommendedAge,
                 String imgUrl, String length) {
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

    public Movie() {
        this.reviews = new ArrayList<>();
    }
}

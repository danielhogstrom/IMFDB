package com.imfdb.IMFDB.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private int yearMade;
    private String director;
    private int recommendedAge;
    private String imgUrl;
    @Column(name = "movie_length")
    private String length;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Review> review = new HashSet<>();


    @ManyToMany(mappedBy = "movies", cascade = CascadeType.ALL)
    private Set<Genre> genre = new HashSet<>();

}

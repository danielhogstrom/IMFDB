package com.imfdb.IMFDB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    private Set<Movie> movies;


    private String genre;

    @Override
    public String toString() {
        return this.genre;
    }


}

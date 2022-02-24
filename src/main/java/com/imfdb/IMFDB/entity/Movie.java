package com.imfdb.IMFDB.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}

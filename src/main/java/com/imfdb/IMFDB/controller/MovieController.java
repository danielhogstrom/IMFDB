package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SuppressWarnings("unused")
@Controller
public class MovieController {

    MovieService service = new MovieService();

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Movie> movies = service.getMovies();
        model.addAttribute("movies", movies);
        return "index";
    }
}

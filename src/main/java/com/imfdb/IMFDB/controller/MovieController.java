package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.repository.MovieRepository;
import com.imfdb.IMFDB.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@SuppressWarnings("unused")
@Controller
public class MovieController {

    MovieService service = new MovieService();

    @GetMapping("/")
    public String getIndex(Model model){
        List<Movie> movies = service.getMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String getMovie(Model model, @PathVariable int id){
       Movie movie = service.getMovie(id);
        model.addAttribute("movie", movie);
        return "movie";
    }
}

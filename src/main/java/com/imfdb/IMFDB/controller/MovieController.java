package com.imfdb.IMFDB.controller;

import com.imfdb.IMFDB.entity.Genre;
import com.imfdb.IMFDB.entity.Movie;
import com.imfdb.IMFDB.entity.Review;
import com.imfdb.IMFDB.repository.MovieRepository;
import com.imfdb.IMFDB.service.MovieService;
import com.imfdb.IMFDB.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@SuppressWarnings("unused")
@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private MovieRepository repo;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Movie> movies = movieService.getMovies();
        model.addAttribute("movies", movies);
        Movie featured = movieService.featured();
        model.addAttribute("featured", featured);
        return "index";
    }

    @GetMapping("/search")
    public String getsearch(@RequestParam String search, Model model){
        List<Movie> movies = repo.findMovieByTitleContainingIgnoreCase(search);
        model.addAttribute("movies", movies);
        return "search";
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable int id, Model model) {
        Movie movie = movieService.findMovieById(id);
        String genre = "";

        for(Genre movie1 : movie.getGenre()) {
            genre+= movie1.toString() + "  ";
        }
        model.addAttribute("movie", movie);
        model.addAttribute("reviews", movie.getReview());
        model.addAttribute("review", new Review());
        model.addAttribute("genre", genre);
        return "movie";
    }

    @GetMapping("/addmovie")
    public String createMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "addmovie";
    }

    @PostMapping("/addmovie")
    public String addMovie(@ModelAttribute Movie movie, BindingResult result, Model model) {
        validate(movie, result);
        if (result.hasErrors()) {
            model.addAttribute("errorMsg", "Validation failed, please enter correct data");
            return "addmovie";
        }
        movieService.addMovie(movie);
        return "redirect:/";
    }

    private void validate(Movie movie, BindingResult result) {

        if (movie.getTitle()== null || movie.getTitle().equals("")) {
            result.rejectValue("title", "title.empty");
        }

        if (movie.getImgUrl()== null || movie.getImgUrl().equals("")) {
            result.rejectValue("imgUrl", "imgURL.empty");
        }
        if (movie.getRecommendedAge()== 0 || movie.getRecommendedAge() < 0) {
            result.rejectValue("recommendedAge", "recommendedAge.empty");
        }
        if (movie.getDirector()== null || movie.getDirector().equals("")) {
            result.rejectValue("director", "director.empty");
        }
        if (movie.getYearMade()== 0 || movie.getYearMade() < 0 || movie.getYearMade() > 2022) {
            result.rejectValue("yearMade", "yearMade.empty");
        }
        if (movie.getLength()== null || movie.getLength().equals("")) {
            result.rejectValue("length", "length.empty");
        }
        if (movie.getDescription()== null || movie.getDescription().equals("")) {
            result.rejectValue("description", "description.empty");
        }
        if (movie.getDescription()== null || movie.getDescription().length() > 200) {
            result.rejectValue("description", "description.length");
        }
    }

    @GetMapping("/filterby/{genre}")
    public String sortedlist(@PathVariable String genre, Model model){
        List<Movie> movies = movieService.getMoviesByGenre(genre);
        model.addAttribute("movies",movies);
        return "filterby";
    }
}

/*
<div class="form-group col-md-4">


           <label for="inputGenre">Genre</label>
            <select th:field="*{Genre}" id="inputGenre" class="form-control">
                <option selected th:value="Drama">Drama</option>
                <option th:value="Action">Action</option>
                <option th:value="Adventure">Adventure</option>
                <option th:value="Comedy">Comedy</option>
                <option th:value="Romance">Romance</option>
            </select>
        </div>

 */
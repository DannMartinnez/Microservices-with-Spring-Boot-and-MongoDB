package com.dh.dann.MovieService.controller;

import com.dh.dann.MovieService.model.Movie;
import com.dh.dann.MovieService.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    // Save Movie
    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        log.info("have been registered the movie {} with the genre {}", movie.getName(), movie.getGenre());
        return ResponseEntity.ok().body(movieService.save(movie));
    }

   // List Movies by genre
   @GetMapping("/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre){
       log.info("List of {} movies", genre);
       return movieService.getMoviesByGenre(genre);
   }
}


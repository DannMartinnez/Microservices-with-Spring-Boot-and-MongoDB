package com.dh.dann.MovieService.service;

import com.dh.dann.MovieService.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMoviesByGenre(String genre);

    Movie save(Movie movie);
}

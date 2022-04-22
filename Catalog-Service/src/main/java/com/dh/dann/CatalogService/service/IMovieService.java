package com.dh.dann.CatalogService.service;

import com.dh.dann.CatalogService.model.Movie;

import java.util.List;

public interface IMovieService {

    public Movie save(Movie movie);

    public List<Movie> getMoviesByGenre(String genre);
}

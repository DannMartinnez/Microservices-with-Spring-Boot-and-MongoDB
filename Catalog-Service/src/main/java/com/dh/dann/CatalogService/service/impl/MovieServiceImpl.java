package com.dh.dann.CatalogService.service.impl;

import com.dh.dann.CatalogService.model.Movie;
import com.dh.dann.CatalogService.repository.feign.IMovieFeignRepository;
import com.dh.dann.CatalogService.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements IMovieService {

    @Autowired
    IMovieFeignRepository movieFeignRepository;

    @Override
    public Movie save(Movie movie) {
        return IMovieFeignRepository.save(movie).getBody();

    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return IMovieFeignRepository.getMovieByGenre(genre);
    }
}

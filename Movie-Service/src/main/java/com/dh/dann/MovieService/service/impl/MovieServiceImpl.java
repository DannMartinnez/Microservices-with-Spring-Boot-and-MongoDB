package com.dh.dann.MovieService.service.impl;

import com.dh.dann.MovieService.model.Movie;
import com.dh.dann.MovieService.repository.MovieRepository;
import com.dh.dann.MovieService.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public  MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.getMoviesByGenre(genre);
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
}

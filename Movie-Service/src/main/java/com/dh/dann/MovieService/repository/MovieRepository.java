package com.dh.dann.MovieService.repository;

import com.dh.dann.MovieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

    public List<Movie> getMoviesByGenre(String genre);
}

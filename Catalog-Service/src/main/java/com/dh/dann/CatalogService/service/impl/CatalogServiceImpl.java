package com.dh.dann.CatalogService.service.impl;

import com.dh.dann.CatalogService.model.Catalog;
import com.dh.dann.CatalogService.model.Movie;
import com.dh.dann.CatalogService.model.Serie;
import com.dh.dann.CatalogService.repository.ICatalogRepository;
import com.dh.dann.CatalogService.repository.feign.IMovieFeignRepository;
import com.dh.dann.CatalogService.repository.feign.ISerieFeignRepository;
import com.dh.dann.CatalogService.service.ICatalogService;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.CircuitBreaker;

import java.util.List;

public class CatalogServiceImpl implements ICatalogService {

    @Autowired
    ICatalogRepository catalogRepository;

    @Autowired
    IMovieFeignRepository movieFeignRepository;

    @Autowired
    ISerieFeignRepository serieFeignRepository;


    @Override
    @CircuitBreaker(name = "catalog", fallbackMethod = "findAllEmpty")
    @Retry(name = "catalog")
    public Catalog getCatalogByGenre(String genre) {
        List<Movie> movies = movieFeignRepository.getMovieByGenre(genre);
        List<Serie> series = serieFeignRepository.getSerieByGenre(genre);
        Catalog catalogo = Catalog.builder()
                .genre(genre)
                .movies(movies)
                .series(series)
                .build();
        return catalogo;
    }
}
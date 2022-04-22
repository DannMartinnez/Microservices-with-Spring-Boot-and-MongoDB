package com.dh.dann.CatalogService.service.impl;

import com.dh.dann.CatalogService.model.Serie;
import com.dh.dann.CatalogService.repository.feign.ISerieFeignRepository;
import com.dh.dann.CatalogService.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SerieServiceImpl implements ISerieService {

    @Autowired
    ISerieFeignRepository serieFeignRepository;

    @Override
    public List<Serie> getSerieByGenre(String genre) {
        return ISerieFeignRepository.getSerieByGenre(genre);
    }

    @Override
    public Serie save(Serie serie) {
        return (Serie) ISerieFeignRepository.save(serie).getBody();
    }
}

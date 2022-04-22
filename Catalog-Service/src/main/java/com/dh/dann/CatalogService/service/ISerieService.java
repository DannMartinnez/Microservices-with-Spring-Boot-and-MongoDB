package com.dh.dann.CatalogService.service;

import com.dh.dann.CatalogService.model.Serie;

import java.util.List;

public interface ISerieService {

    public List<Serie> getSerieByGenre(String genre);

    public Serie save(Serie serie);
}

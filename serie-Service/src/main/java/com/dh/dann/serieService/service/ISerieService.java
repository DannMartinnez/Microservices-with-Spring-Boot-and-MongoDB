package com.dh.dann.serieService.service;

import com.dh.dann.serieService.model.Serie;

import java.util.List;

public interface ISerieService {

    public List<Serie> getSerieByGenre(String genre);
    public Serie save(Serie serie);
}

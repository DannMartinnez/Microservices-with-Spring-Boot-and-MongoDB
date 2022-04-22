package com.dh.dann.serieService.service.impl;

import com.dh.dann.serieService.model.Serie;
import com.dh.dann.serieService.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements ISerieService {

    @Autowired
    ISerieService serieRepository;

    @Override
    public List<Serie> getSerieByGenre(String genre) {
        return serieRepository.getSerieByGenre(genre);
    }

    @Override
    public Serie save(Serie serie) {
        return serieRepository.save(serie);
    }
}

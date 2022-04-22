package com.dh.dann.serieService.repository;

import com.dh.dann.serieService.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISerieRepository extends MongoRepository<Serie, String> {

    public List<Serie> getSerieByGenre(String genre);

}

package com.dh.dann.CatalogService.repository.feign;

import com.dh.dann.CatalogService.model.Serie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "serie-service")
public interface ISerieFeignRepository {

    @GetMapping("/series/{genre}")
    List<Serie> getSerieByGenre(@PathVariable String genre);

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Serie serie);
}

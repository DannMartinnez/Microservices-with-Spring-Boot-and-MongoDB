package com.dh.dann.serieService.controller;

import com.dh.dann.serieService.model.Serie;
import com.dh.dann.serieService.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/series")
public class SerieController {

    @Autowired
    ISerieService serieService;

    @GetMapping("/{genre}")
    public ResponseEntity<?> getSeriesByGenre(@PathVariable String genre){
        return ResponseEntity.ok().body(serieService.getSerieByGenre(genre));
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Serie serie){
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(serieService.save(serie));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\"");
        }
    }

}

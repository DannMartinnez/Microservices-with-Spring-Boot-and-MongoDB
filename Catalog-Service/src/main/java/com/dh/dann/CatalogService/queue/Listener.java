package com.dh.dann.CatalogService.queue;

import com.dh.dann.CatalogService.model.Movie;
import com.dh.dann.CatalogService.model.Serie;
import com.dh.dann.CatalogService.service.IMovieService;
import com.dh.dann.CatalogService.service.ISerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Listener {

    @Autowired
    private IMovieService movieService;

    @Autowired
    private ISerieService serieService;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload Movie movie){
        movieService.save(movie);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload Serie serie){
        serieService.save(serie);
    }
}

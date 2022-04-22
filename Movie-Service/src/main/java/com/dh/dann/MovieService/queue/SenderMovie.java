package com.dh.dann.MovieService.queue;

import com.dh.dann.MovieService.model.Movie;
import com.dh.dann.MovieService.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SenderMovie{

    private final MovieService movieServices;
    private final RabbitTemplate rabbitTemplate;
    private final Queue queueMovie;

    public Movie send(Movie movie){
        rabbitTemplate.convertAndSend(queueMovie.getName(), movieServices.save(movie));
        return movie;
    }
}

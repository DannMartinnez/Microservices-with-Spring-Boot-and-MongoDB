package com.dh.dann.CatalogService.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Catalog")
@Builder
@Getter
@Setter
public class Catalog {

    @Id
    private String id;
    private String genre;
    private List<Movie> movies;
    private List<Serie> series;

}

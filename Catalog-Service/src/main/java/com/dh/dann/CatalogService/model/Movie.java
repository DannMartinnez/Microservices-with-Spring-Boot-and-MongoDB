package com.dh.dann.CatalogService.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
@Getter
@Setter
public class Movie {

    @Id
    private Integer id;
    private String name;
    private String genre;
    private String urlSteam;

}
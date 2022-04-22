package com.dh.dann.CatalogService.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chapters")
@Getter
@Setter
public class Chapter {

    @Id
    private String id;
    private String name;
    private int number;
    private String urlStream;
}

package com.dh.dann.serieService.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "series")
@Getter
@Setter
public class Serie {

    @Id
    private String id;
    private String name;
    private String genre;
    private List<Season> season;

}

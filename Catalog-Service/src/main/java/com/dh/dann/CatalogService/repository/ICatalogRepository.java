package com.dh.dann.CatalogService.repository;

import com.dh.dann.CatalogService.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICatalogRepository extends MongoRepository<Catalog, String> {
}

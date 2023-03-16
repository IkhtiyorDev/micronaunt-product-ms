package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.ProductTag;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


public interface ProductTagRepository extends CrudRepository<ProductTag, Long> {
}

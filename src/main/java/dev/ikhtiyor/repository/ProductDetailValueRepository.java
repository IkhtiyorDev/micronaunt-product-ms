package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.ProductDetailValue;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


public interface ProductDetailValueRepository extends CrudRepository<ProductDetailValue, Long> {
}

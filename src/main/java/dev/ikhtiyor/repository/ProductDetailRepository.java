package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.ProductDetail;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


public interface ProductDetailRepository extends CrudRepository<ProductDetail, Long> {
}

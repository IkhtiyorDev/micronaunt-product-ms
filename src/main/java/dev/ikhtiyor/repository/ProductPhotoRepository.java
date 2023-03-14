package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.ProductPhoto;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProductPhotoRepository extends CrudRepository<ProductPhoto, Long> {
}

package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.Category;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}

package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.Category;
import io.micronaut.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

package dev.ikhtiyor.repository;

import dev.ikhtiyor.entity.Tag;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


public interface TagRepository extends CrudRepository<Tag, Long> {
}

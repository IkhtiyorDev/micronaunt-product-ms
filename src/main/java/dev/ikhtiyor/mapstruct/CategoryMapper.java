package dev.ikhtiyor.mapstruct;

import dev.ikhtiyor.dto.CategoryDTO;
import dev.ikhtiyor.entity.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

    Category mapToCategory(CategoryDTO categoryDTO);

    CategoryDTO mapToCategoryDTO(Category category);

}

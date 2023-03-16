package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.CategoryDTO;
import io.micronaut.http.HttpResponse;

import java.util.List;

public interface CategoryService {

    HttpResponse<CategoryDTO> createCategory(CategoryDTO categoryDTO);

    HttpResponse<CategoryDTO> editCategory(Long id, CategoryDTO categoryDTO);

    HttpResponse<List<CategoryDTO>> getALlCategory(int page, int size);

    HttpResponse<CategoryDTO> getCategory(Long id);
}

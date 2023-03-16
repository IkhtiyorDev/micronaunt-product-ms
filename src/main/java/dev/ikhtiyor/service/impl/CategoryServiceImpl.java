package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.CategoryDTO;
import dev.ikhtiyor.service.CategoryService;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CategoryServiceImpl implements CategoryService {

    @Override
    public HttpResponse<CategoryDTO> createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public HttpResponse<CategoryDTO> editCategory(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public HttpResponse<List<CategoryDTO>> getALlCategory(int page, int size) {
        return null;
    }

    @Override
    public HttpResponse<CategoryDTO> getCategory(Long id) {
        return null;
    }
}

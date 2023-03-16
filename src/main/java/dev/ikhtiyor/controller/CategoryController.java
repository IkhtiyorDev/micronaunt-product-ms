package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.CategoryDTO;
import dev.ikhtiyor.service.CategoryService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @Post
    public HttpResponse<CategoryDTO> createCategory(CategoryDTO categoryDTO) {
        return categoryService.createCategory(categoryDTO);
    }

    @Put
    public HttpResponse<CategoryDTO> editCategory(Long id, CategoryDTO categoryDTO) {
        return categoryService.editCategory(id, categoryDTO);
    }

    @Get
    public HttpResponse<List<CategoryDTO>> getALlCategory(
            @QueryValue(defaultValue = "0") Integer page,
            @QueryValue(defaultValue = "0") Integer size
    ) {
        return categoryService.getALlCategory(page, size);
    }

    @Get("/{id}")
    public HttpResponse<CategoryDTO> getCategory(Long id) {
        return categoryService.getCategory(id);
    }

}

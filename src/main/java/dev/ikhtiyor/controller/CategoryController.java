package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.CategoryDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import java.util.List;

@Controller("/api/v1/category")
public class CategoryController {

    @Post
    public HttpResponse<CategoryDTO> createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Put
    public HttpResponse<CategoryDTO> editCategory(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Get
    public HttpResponse<List<CategoryDTO>> getALlCategory() {
        return null;
    }

    @Get("/{id}")
    public HttpResponse<CategoryDTO> getCategory(Long id) {
        return null;
    }

}

package dev.ikhtiyor.controller.impl;

import dev.ikhtiyor.controller.CategoryController;
import dev.ikhtiyor.dto.CategoryDTO;
import dev.ikhtiyor.entity.Category;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.net.http.HttpResponse;

//@Controller("/api/v1/category")
//public class CategoryControllerImpl implements CategoryController {
//
//    @Post
//    @Override
//    public HttpResponse<Category> createCategory(@Body CategoryDTO categoryDTO) {
//        System.out.println(categoryDTO);
//        return null;
//    }
//}

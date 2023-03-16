package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import java.util.List;

@Controller("/api/v1/product")
public
class ProductController {

    @Post
    public HttpResponse<ProductDTO> createProduct(ProductDTO productDTO) {
        return null;
    }

    @Put
    public HttpResponse<ProductDTO> editProduct(Long id, ProductDTO productDTO) {
        return null;
    }

    @Get
    public HttpResponse<List<ProductDTO>> getALlProduct() {
        return null;
    }

    @Get("/{id}")
    public HttpResponse<ProductDTO> getProduct(Long id) {
        return null;
    }


}

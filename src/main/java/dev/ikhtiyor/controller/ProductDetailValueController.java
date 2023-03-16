package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDetailValueDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import java.util.List;

@Controller("/api/v1/product-detail-value")
public class ProductDetailValueController {

    @Post
    public HttpResponse<ProductDetailValueDTO> createProductDetailValue(ProductDetailValueDTO productDetailValueDTO) {
        return null;
    }

    @Put
    public HttpResponse<ProductDetailValueDTO> editProductDetailValue(Long id, ProductDetailValueDTO productDetailValueDTO) {
        return null;
    }

    @Get
    public HttpResponse<List<ProductDetailValueDTO>> getALlProductDetailValue() {
        return null;
    }

    @Get("/{id}")
    public HttpResponse<ProductDetailValueDTO> getProductDetailValue(Long id) {
        return null;
    }

}

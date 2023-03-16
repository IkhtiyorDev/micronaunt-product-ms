package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDetailDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import java.util.List;

@Controller("/api/v1/product-detail")
public class ProductDetailController {

    @Post
    public HttpResponse<ProductDetailDTO> createProductDetail(ProductDetailDTO productDetailDTO) {
        return null;
    }

    @Put
    public HttpResponse<ProductDetailDTO> editProductDetail(Long id, ProductDetailDTO productDetailDTO) {
        return null;
    }

    @Get
    public HttpResponse<List<ProductDetailDTO>> getALlProductDetail() {
        return null;
    }

    @Get("/{id}")
    public HttpResponse<ProductDetailDTO> getProductDetail(Long id) {
        return null;
    }

}

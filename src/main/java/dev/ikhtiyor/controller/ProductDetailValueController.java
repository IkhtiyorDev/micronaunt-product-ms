package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDetailValueDTO;

import dev.ikhtiyor.service.ProductDetailValueService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/api/v1/product-detail-value")
@RequiredArgsConstructor
public class ProductDetailValueController {

    private final ProductDetailValueService productDetailValueService;

    @Post
    public HttpResponse<ProductDetailValueDTO> createProductDetailValue(ProductDetailValueDTO productDetailValueDTO) {
        return productDetailValueService.createProductDetailValue(productDetailValueDTO);
    }

    @Put
    public HttpResponse<ProductDetailValueDTO> editProductDetailValue(Long id, ProductDetailValueDTO productDetailValueDTO) {
        return productDetailValueService.editProductDetailValue(id, productDetailValueDTO);
    }

    @Get
    public HttpResponse<List<ProductDetailValueDTO>> getALlProductDetailValue(
            @QueryValue(defaultValue = "0") Integer page,
            @QueryValue(defaultValue = "0") Integer size
    ) {
        return productDetailValueService.getALlProductDetailValue(page, size);
    }

    @Get("/{id}")
    public HttpResponse<ProductDetailValueDTO> getProductDetailValue(Long id) {
        return productDetailValueService.getProductDetailValue(id);
    }

}

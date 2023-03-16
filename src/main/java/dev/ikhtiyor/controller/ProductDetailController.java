package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDetailDTO;

import dev.ikhtiyor.service.ProductDetailService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/api/v1/product-detail")
@RequiredArgsConstructor
public class ProductDetailController {

    private final ProductDetailService productDetailService;

    @Post
    public HttpResponse<ProductDetailDTO> createProductDetail(ProductDetailDTO productDetailDTO) {
        return productDetailService.createProductDetail(productDetailDTO);
    }

    @Put
    public HttpResponse<ProductDetailDTO> editProductDetail(Long id, ProductDetailDTO productDetailDTO) {
        return productDetailService.editProductDetail(id, productDetailDTO);
    }

    @Get
    public HttpResponse<List<ProductDetailDTO>> getALlProductDetail(
            @QueryValue(defaultValue = "0") Integer page,
            @QueryValue(defaultValue = "0") Integer size
    ) {
        return productDetailService.getALlProductDetail(page, size);
    }

    @Get("/{id}")
    public HttpResponse<ProductDetailDTO> getProductDetail(Long id) {
        return productDetailService.getProductDetail(id);
    }

}

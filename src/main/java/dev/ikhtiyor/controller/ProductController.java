package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.ProductDTO;

import dev.ikhtiyor.service.ProductService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @Post
    public HttpResponse<ProductDTO> createProduct(ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @Put
    public HttpResponse<ProductDTO> editProduct(Long id, ProductDTO productDTO) {
        return productService.editProduct(id, productDTO);
    }

    @Get
    public HttpResponse<List<ProductDTO>> getALlProduct(
            @QueryValue(defaultValue = "0") Integer page,
            @QueryValue(defaultValue = "0") Integer size
    ) {
        return productService.getALlProduct(page, size);
    }

    @Get("/{id}")
    public HttpResponse<ProductDTO> getProduct(Long id) {
        return productService.getProduct(id);
    }


}

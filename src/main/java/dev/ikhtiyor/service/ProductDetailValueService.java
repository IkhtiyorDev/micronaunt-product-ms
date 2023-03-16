package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.ProductDetailValueDTO;
import io.micronaut.http.HttpResponse;

import java.util.List;

public interface ProductDetailValueService {
    HttpResponse<ProductDetailValueDTO> createProductDetailValue(ProductDetailValueDTO productDetailValueDTO);

    HttpResponse<ProductDetailValueDTO> editProductDetailValue(Long id, ProductDetailValueDTO productDetailValueDTO);

    HttpResponse<List<ProductDetailValueDTO>> getALlProductDetailValue(int page, int size);

    HttpResponse<ProductDetailValueDTO> getProductDetailValue(Long id);
}

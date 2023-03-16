package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.ProductDetailValueDTO;
import dev.ikhtiyor.service.ProductDetailValueService;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductDetailValueServiceImpl implements ProductDetailValueService {
    @Override
    public HttpResponse<ProductDetailValueDTO> createProductDetailValue(ProductDetailValueDTO productDetailValueDTO) {
        return null;
    }

    @Override
    public HttpResponse<ProductDetailValueDTO> editProductDetailValue(Long id, ProductDetailValueDTO productDetailValueDTO) {
        return null;
    }

    @Override
    public HttpResponse<List<ProductDetailValueDTO>> getALlProductDetailValue(int page, int size) {
        return null;
    }

    @Override
    public HttpResponse<ProductDetailValueDTO> getProductDetailValue(Long id) {
        return null;
    }
}

package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.ProductDTO;
import dev.ikhtiyor.service.ProductService;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductServiceImpl implements ProductService {

    @Override
    public HttpResponse<ProductDTO> createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public HttpResponse<ProductDTO> editProduct(Long id, ProductDTO productDTO) {
        return null;
    }

    @Override
    public HttpResponse<List<ProductDTO>> getALlProduct(int page, int size) {
        return null;
    }

    @Override
    public HttpResponse<ProductDTO> getProduct(Long id) {
        return null;
    }
}

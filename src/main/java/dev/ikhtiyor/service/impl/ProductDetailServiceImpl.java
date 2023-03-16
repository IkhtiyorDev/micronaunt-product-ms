package dev.ikhtiyor.service.impl;


import dev.ikhtiyor.dto.ProductDetailDTO;
import dev.ikhtiyor.service.ProductDetailService;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductDetailServiceImpl implements ProductDetailService {

    @Override
    public HttpResponse<ProductDetailDTO> createProductDetail(ProductDetailDTO productDetailDTO) {
        return null;
    }

    @Override
    public HttpResponse<ProductDetailDTO> editProductDetail(Long id, ProductDetailDTO productDetailDTO) {
        return null;
    }

    @Override
    public HttpResponse<List<ProductDetailDTO>> getALlProductDetail(int page, int size) {
        return null;
    }

    @Override
    public HttpResponse<ProductDetailDTO> getProductDetail(Long id) {
        return null;
    }
}

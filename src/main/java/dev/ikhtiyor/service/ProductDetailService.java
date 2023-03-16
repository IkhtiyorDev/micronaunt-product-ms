package dev.ikhtiyor.service;


import dev.ikhtiyor.dto.ProductDetailDTO;
import io.micronaut.http.HttpResponse;

import java.util.List;

public interface ProductDetailService {
    HttpResponse<ProductDetailDTO> createProductDetail(ProductDetailDTO productDetailDTO);
    HttpResponse<ProductDetailDTO> editProductDetail(Long id, ProductDetailDTO productDetailDTO);
    HttpResponse<List<ProductDetailDTO>> getALlProductDetail(int page, int size);
    HttpResponse<ProductDetailDTO> getProductDetail(Long id);

}

package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.ProductDTO;
import io.micronaut.http.HttpResponse;

import java.util.List;

public interface ProductService {

    HttpResponse<ProductDTO> createProduct(ProductDTO productDTO);

    HttpResponse<ProductDTO> editProduct(Long id, ProductDTO productDTO);

    HttpResponse<List<ProductDTO>> getALlProduct(int page, int size);

    HttpResponse<ProductDTO> getProduct(Long id);
}

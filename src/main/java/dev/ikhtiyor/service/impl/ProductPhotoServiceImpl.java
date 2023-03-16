package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.ProductPhotoDTO;
import dev.ikhtiyor.entity.ProductPhoto;
import dev.ikhtiyor.service.ProductPhotoService;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductPhotoServiceImpl implements ProductPhotoService {

    @Override
    public ProductPhoto createProductPhoto(ProductPhotoDTO productPhotoDTO) {
        return null;
    }

    @Override
    public ProductPhoto editProductPhoto(ProductPhoto productPhoto, ProductPhotoDTO productPhotoDTO) {
        return null;
    }

    @Override
    public List<ProductPhotoDTO> getALlProductPhotoDTO(int page, int size) {
        return null;
    }

    @Override
    public List<ProductPhoto> getALlProductPhoto(int page, int size) {
        return null;
    }

    @Override
    public ProductPhotoDTO getProductPhotoDTO(Long id) {
        return null;
    }

    @Override
    public ProductPhoto getProductPhoto(Long id) {
        return null;
    }
}

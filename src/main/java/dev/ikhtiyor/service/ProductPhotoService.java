package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.ProductPhotoDTO;
import dev.ikhtiyor.entity.ProductPhoto;

import java.util.List;

public interface ProductPhotoService {

    ProductPhoto createProductPhoto(ProductPhotoDTO productPhotoDTO);

    ProductPhoto editProductPhoto(ProductPhoto productPhoto, ProductPhotoDTO productPhotoDTO);

    List<ProductPhotoDTO> getALlProductPhotoDTO(int page, int size);

    List<ProductPhoto> getALlProductPhoto(int page, int size);

    ProductPhotoDTO getProductPhotoDTO(Long id);

    ProductPhoto getProductPhoto(Long id);

}

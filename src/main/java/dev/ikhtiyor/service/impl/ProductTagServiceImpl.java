package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.ProductTagDTO;
import dev.ikhtiyor.entity.ProductTag;
import dev.ikhtiyor.service.ProductTagService;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductTagServiceImpl implements ProductTagService {
    @Override
    public ProductTag createProductTag(ProductTagDTO productTagDTO) {
        return null;
    }

    @Override
    public ProductTag editProductTag(ProductTag productTag, ProductTagDTO productTagDTO) {
        return null;
    }

    @Override
    public List<ProductTagDTO> getALlProductTagDTO(int page, int size) {
        return null;
    }

    @Override
    public List<ProductTag> getALlProductTag(int page, int size) {
        return null;
    }

    @Override
    public ProductTagDTO getProductTagDTO(Long id) {
        return null;
    }

    @Override
    public ProductTag getProductTag(Long id) {
        return null;
    }
}

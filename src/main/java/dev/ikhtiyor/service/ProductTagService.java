package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.ProductTagDTO;
import dev.ikhtiyor.entity.ProductTag;

import java.util.List;

public interface ProductTagService {

    ProductTag createProductTag(ProductTagDTO productTagDTO);

    ProductTag editProductTag(ProductTag productTag, ProductTagDTO productTagDTO);

    List<ProductTagDTO> getALlProductTagDTO(int page, int size);

    List<ProductTag> getALlProductTag(int page, int size);

    ProductTagDTO getProductTagDTO(Long id);

    ProductTag getProductTag(Long id);
}

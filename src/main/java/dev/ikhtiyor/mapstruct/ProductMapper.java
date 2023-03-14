package dev.ikhtiyor.mapstruct;

import dev.ikhtiyor.dto.ProductDTO;
import dev.ikhtiyor.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    Product mapToProduct(ProductDTO productDTO);

    ProductDTO mapToProductDTO(Product product);

}

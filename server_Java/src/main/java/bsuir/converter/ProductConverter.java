package bsuir.converter;

import bsuir.entity.Product;
import bsuir.model.ProductDto;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Domaniewski
 */

@Component
public class ProductConverter {
    public ProductDto fromProductToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .nameProduct(product.getNameProduct())
                .price(product.getPrice())
                .productCategories(product.getProductCategories().getNameProduct())
                .code(product.getId())
                .build();
    }
}

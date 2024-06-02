package bsuir.converter;

import bsuir.entity.ProductCategories;
import bsuir.model.ProductCategoriesDto;
import org.springframework.stereotype.Component;


/**
 * Created by Vladislav Domaniewski
 */

@Component
public class ProductCategoriesConverter {
    public ProductCategoriesDto fromProductCategoriesToProductCategoriesDto(ProductCategories productCategories){
        return ProductCategoriesDto.builder()
                .id(productCategories.getId())
                .nameProduct(productCategories.getNameProduct())
                .build();
    }
}

package bsuir.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Vladislav Domaniewski
 */

@Builder
@Data
public class ProductDto {
    private Long id;
    private String nameProduct;
    private String price;
    private String productCategories;
    private Long code;
}

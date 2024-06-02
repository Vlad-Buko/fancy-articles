package bsuir.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Domaniewski
 */

@Builder
@Getter
@Setter
public class ProductCategoriesDto {
    private Integer id;
    private String nameProduct;
    private String categories;
}

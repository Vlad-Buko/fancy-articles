package bsuir.controller;

import bsuir.converter.ProductCategoriesConverter;
import bsuir.model.ProductCategoriesDto;
import bsuir.repository.ProductCategoriesRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/api/categories")
public class ProductCategoriesController {
    public ProductCategoriesController(ProductCategoriesConverter converter, ProductCategoriesRepo productCategoriesRepo) {
        this.converter = converter;
        this.productCategoriesRepo = productCategoriesRepo;
    }

    private final ProductCategoriesConverter converter;
    private final ProductCategoriesRepo productCategoriesRepo;

    @GetMapping("/list")
    public List<ProductCategoriesDto> getListCategoriesForProduct() {
        return productCategoriesRepo.findAll().stream().map(converter::fromProductCategoriesToProductCategoriesDto).toList();
    }
}

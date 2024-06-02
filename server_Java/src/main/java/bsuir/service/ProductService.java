package bsuir.service;

import bsuir.converter.ProductConverter;
import bsuir.entity.Product;
import bsuir.entity.ProductCategories;
import bsuir.model.ProductDto;
import bsuir.repository.ProductCategoriesRepo;
import bsuir.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Vladislav Domaniewski
 */

@Service
public class ProductService {
    private final ProductRepo productRepo;
    @Autowired
    private ProductCategoriesRepo productCategoriesRepo;
    private final ProductConverter converter;

    public ProductService(ProductRepo productRepo, ProductCategoriesRepo productCategoriesRepo, ProductConverter converter) {
        this.productRepo = productRepo;
        this.converter = converter;
    }


    public void addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setPrice(productDto.getPrice());
        System.out.println(productDto);
        product.setNameProduct(productDto.getNameProduct());
        Integer idProdCat = Integer.parseInt(productDto.getProductCategories());
        ProductCategories productCategories = productCategoriesRepo.getById(idProdCat);
        System.out.println(productCategories.getNameProduct());
        product.setProductCategories(productCategories);
        productRepo.save(product);
    }
    public List<ProductDto> getProd() {
        return productRepo.findAll().stream().map(converter::fromProductToProductDto).toList();
    }

    public void removeProduct(Long id) {
        productRepo.deleteById(id);
    }
}

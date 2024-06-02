package bsuir.repository;

import bsuir.entity.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoriesRepo extends JpaRepository<ProductCategories, Integer> {
}

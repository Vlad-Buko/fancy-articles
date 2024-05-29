package bsuir.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;
    private String nameProduct;

    @OneToMany(mappedBy = "productCategories")
    private List<Product> productList;
}

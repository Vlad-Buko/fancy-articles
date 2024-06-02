package bsuir.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Getter
@Setter
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String nameProduct;

    @OneToMany(mappedBy = "productCategories", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Product> productList;
}

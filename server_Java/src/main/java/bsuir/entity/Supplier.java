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
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;
    private String nameCompany;
    private String legalAddress;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "supp")
    private List<Sale> saleList;
}

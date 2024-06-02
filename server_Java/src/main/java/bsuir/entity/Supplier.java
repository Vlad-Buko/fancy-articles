package bsuir.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
@Validated
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(min = 3)
    private String nameCompany;
    private String legalAddress;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "supp", cascade = CascadeType.ALL)
    private List<Sale> saleList;
}

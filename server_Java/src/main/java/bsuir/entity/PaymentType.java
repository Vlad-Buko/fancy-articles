package bsuir.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;
    private String typePay;
    @OneToMany (mappedBy = "paymentType")
    private List<Sale> saleList;
}

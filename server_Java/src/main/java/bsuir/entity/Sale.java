package bsuir.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;
    private Date dateSales;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id")
    private Sellers seller;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String note;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pay_id")
    private PaymentType paymentType;
}

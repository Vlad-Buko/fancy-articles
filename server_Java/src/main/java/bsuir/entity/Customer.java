package bsuir.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Integer id;
    private String surname;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToMany(mappedBy = "customer")
    private List<Sale> saleList;
}

package bsuir.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
@Validated
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String surname;
    private String firstName;
    private String lastName;

    private String phoneNumber;
    @OneToMany(mappedBy = "customer")
    private List<Sale> saleList;
}

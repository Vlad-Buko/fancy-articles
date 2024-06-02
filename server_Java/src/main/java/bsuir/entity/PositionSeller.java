package bsuir.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Data
@Entity
public class PositionSeller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;
    private String position;
    @OneToMany(mappedBy = "position")
    private List<Sellers> sellersList;

}

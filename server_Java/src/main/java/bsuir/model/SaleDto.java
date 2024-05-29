package bsuir.model;

import bsuir.entity.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.Date;


/**
 * Created by Vladislav Domaniewski
 */

@Builder
@Data
public class SaleDto {
    private Long id;
    private Date dateSales;
    private String nameSupplier;
    private String nameSeller;
    private String product;
    private String nameCustomer;
    private String note;
    private String paymentType;

}

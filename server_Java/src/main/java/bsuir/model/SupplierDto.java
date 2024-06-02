package bsuir.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Vladislav Domaniewski
 */

@Data
@Builder
public class SupplierDto {
    private int id;
    private String nameCompany;
    private String legalAddress;
    private String email;
    private String phoneNumber;
}

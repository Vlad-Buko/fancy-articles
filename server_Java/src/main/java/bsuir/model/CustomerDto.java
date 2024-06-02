package bsuir.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Vladislav Domaniewski
 */

@Builder
@Data
public class CustomerDto {
    private String surname;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}

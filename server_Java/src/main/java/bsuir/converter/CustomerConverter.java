package bsuir.converter;

import bsuir.entity.Customer;
import bsuir.model.CustomerDto;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Domaniewski
 */

@Component
public class CustomerConverter {
    public CustomerDto fromCustomerToCustomerDto(Customer customer) {
        return CustomerDto.builder()
                .surname(customer.getSurname())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .phoneNumber(customer.getPhoneNumber()).
                build();
    }
}

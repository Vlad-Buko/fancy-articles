package bsuir.service;

import bsuir.converter.CustomerConverter;
import bsuir.model.CustomerDto;
import bsuir.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerConverter converter;

    public CustomerService(CustomerRepo customerRepo, CustomerConverter converter) {
        this.customerRepo = customerRepo;
        this.converter = converter;
    }

    public List<CustomerDto> getCustomerList() {
        return customerRepo.findAll().stream().map(converter::fromCustomerToCustomerDto).toList();
    }
}

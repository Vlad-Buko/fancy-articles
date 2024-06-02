package bsuir.controller;

import bsuir.entity.Customer;
import bsuir.model.CustomerDto;
import bsuir.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getListCustomer() {
        return customerService.getCustomerList();
    }
}

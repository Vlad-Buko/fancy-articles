package bsuir.controller;

import bsuir.model.SupplierDto;
import bsuir.service.SupplierService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */
// Cross-Origin что бы обойти политику CORS
@CrossOrigin
@RequestMapping("/supplier")
@RestController
public class SupplierController {
    private final SupplierService service;


    public SupplierController(SupplierService service) {
        this.service = service;
    }


    @PostMapping("/add")
    public void saveSupplier(@RequestBody SupplierDto supplierDto) {
            service.saveSupplerIntoDb(supplierDto);

    }

    @PostMapping("/delete")
    public void deleteSupplier(@RequestBody SupplierDto supplierDto) {
        service.deleteSupplier(supplierDto.getPhoneNumber());
    }
    @GetMapping("/list")
    public List<SupplierDto> getSupplier() {
        return service.getAllSupplier();
    }
}

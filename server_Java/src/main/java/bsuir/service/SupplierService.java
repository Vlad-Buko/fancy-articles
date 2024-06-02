package bsuir.service;

import bsuir.converter.SupplierConverter;
import bsuir.entity.Supplier;
import bsuir.model.SupplierDto;
import bsuir.repository.SupplierRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Service
public class SupplierService {
    private final SupplierRepo supplierRepo;
    private final SupplierConverter supplierConverter;

    public void deleteSupplier(String phoneNumber) {
        Supplier supplier = supplierRepo.findByNameCompanyContains(phoneNumber);
        supplierRepo.deleteById(supplier.getId());
    }

    public SupplierService(SupplierRepo supplierRepo, SupplierConverter supplierConverter) {
        this.supplierRepo = supplierRepo;
        this.supplierConverter = supplierConverter;
    }

    public void saveSupplerIntoDb(SupplierDto supplierDto) throws NullPointerException {
        if (supplierDto.getNameCompany() == null) {
            throw new NullPointerException("Null object");
        } else {
            supplierRepo.save(supplierConverter.fromSupplierDtoToSupplier(supplierDto));
        }
    }
    public List<SupplierDto> getAllSupplier() {
        return supplierRepo.findAll().stream().map(supplierConverter::fromSupplierToSupplierDto).toList();
    }
}

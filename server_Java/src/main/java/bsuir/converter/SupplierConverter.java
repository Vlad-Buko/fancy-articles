package bsuir.converter;

import bsuir.entity.Supplier;
import bsuir.model.SupplierDto;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Domaniewski
 */

@Component
public class SupplierConverter {
    public Supplier fromSupplierDtoToSupplier (SupplierDto supplierDto) {
        Supplier supplier = new Supplier();
        supplier.setNameCompany(supplierDto.getNameCompany());
        supplier.setLegalAddress(supplierDto.getLegalAddress());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setPhoneNumber(supplierDto.getPhoneNumber());
        return supplier;
    }
    public SupplierDto fromSupplierToSupplierDto(Supplier supplier) {
        return SupplierDto.builder()
                .id(supplier.getId())
                .nameCompany(supplier.getNameCompany())
                .legalAddress(supplier.getLegalAddress())
                .email(supplier.getEmail())
                .phoneNumber(supplier.getPhoneNumber())
                .build();
    }
}

package bsuir.repository;

import bsuir.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
     Supplier findByNameCompanyContains(String phone);
}

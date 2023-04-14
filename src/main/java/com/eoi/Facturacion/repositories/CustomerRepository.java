package com.eoi.Facturacion.repositories;

import com.eoi.Facturacion.entities.Customer;
import com.eoi.Facturacion.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


}

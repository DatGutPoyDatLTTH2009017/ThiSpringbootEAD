package com.example.thispringbootead.repository;

import com.example.thispringbootead.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class SaleRepository extends JpaRepository<Sale, String>, JpaSpecificationExecutor<Sale> {
}

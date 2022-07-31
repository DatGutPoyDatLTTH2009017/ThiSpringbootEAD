package com.example.thispringbootead.repository;

import com.example.thispringbootead.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository extends JpaRepository<Product, String> {
}

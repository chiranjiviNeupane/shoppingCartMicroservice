package com.client.catalogservice.repository;

import com.client.catalogservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
        Optional<Product> findByCode(String code);
}
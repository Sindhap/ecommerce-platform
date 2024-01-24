package com.cloudbees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cloudbees.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

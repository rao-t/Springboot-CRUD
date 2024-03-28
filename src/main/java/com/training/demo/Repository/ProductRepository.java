package com.training.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    Product findByName(String name);
}

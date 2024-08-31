package com.example.crud_prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_prod.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

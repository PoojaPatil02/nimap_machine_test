package com.example.crud_prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_prod.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

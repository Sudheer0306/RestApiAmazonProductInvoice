package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}

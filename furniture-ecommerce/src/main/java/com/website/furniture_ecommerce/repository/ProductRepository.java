package com.website.furniture_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.furniture_ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

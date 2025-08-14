package com.website.furniture_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.furniture_ecommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}

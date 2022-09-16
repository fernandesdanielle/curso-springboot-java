package com.danielle.course.repositories;

import com.danielle.course.entities.enums.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

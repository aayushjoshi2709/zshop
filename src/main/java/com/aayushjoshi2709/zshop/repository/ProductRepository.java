
package com.aayushjoshi2709.zshop.repository;

import com.aayushjoshi2709.zshop.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{}
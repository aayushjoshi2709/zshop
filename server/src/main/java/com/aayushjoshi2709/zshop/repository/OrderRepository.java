package com.aayushjoshi2709.zshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aayushjoshi2709.zshop.Entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

package com.aayushjoshi2709.zshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.aayushjoshi2709.zshop.Entity.Order;
import com.aayushjoshi2709.zshop.service.OrderService;

@RestController
public class OrderController {
    public final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    public Order createOrder() {
        return this.orderService.createOrder();
    }

    public Order updateOrder(){
        return this.orderService.createOrder();
    }
}

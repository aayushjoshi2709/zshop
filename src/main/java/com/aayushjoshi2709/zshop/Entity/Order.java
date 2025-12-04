package com.aayushjoshi2709.zshop.Entity;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Order(){}

    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public Order setProduct(Product product) {
        if(product != null){
            this.product = product;
        }
        return this;
    }
    public Order setUser(User user){
        if(user != null){
            this.user = user;
        }
        return this;
    }
}

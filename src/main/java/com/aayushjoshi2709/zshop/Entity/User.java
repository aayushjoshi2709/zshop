package com.aayushjoshi2709.zshop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public Integer getId(){
        return this.id;
    }

    public User setFirstName(String firstName){
        if (firstName != null && !firstName.isEmpty()){
           this.firstName = firstName;
        }
        return this;
    }

    public User setLastName(String lastName){
        if(lastName != null && !lastName.isEmpty()){
            this.lastName = lastName;
        }
        return this;
    }

    public User setUserName(String username){
        if(username != null && !username.isEmpty()){
            this.username = username;
        }
        return this;
    }

    public User setPassword(String password){
        if(password != null && !password.isEmpty()){
            this.password = password;
        }
        return this;
    }
}

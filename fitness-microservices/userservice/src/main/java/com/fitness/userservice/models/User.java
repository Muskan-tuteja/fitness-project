package com.fitness.userservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    private int id;
    private String email;
   private String password;
   private String firstname;
   private String lastname;
   private UserRole role = UserRole.USER;


}

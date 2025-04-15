package com.walkwise.shoestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shoe {
    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;

    // Getters and Setters
}

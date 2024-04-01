package com.nimap.test.model;


import jakarta.persistence.*;

@Entity
    @Table(name = "products")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private double price;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;

    public void setId(Long id) {
    }

    // Getters and setters
    }



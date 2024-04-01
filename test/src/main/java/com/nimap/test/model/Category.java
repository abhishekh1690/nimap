package com.nimap.test.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

    public void setId(Long id) {
    }
}

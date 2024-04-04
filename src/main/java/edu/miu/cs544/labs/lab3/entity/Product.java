package edu.miu.cs544.labs.lab3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    @Id
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
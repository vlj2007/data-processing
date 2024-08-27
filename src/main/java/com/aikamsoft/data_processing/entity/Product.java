package com.aikamsoft.data_processing.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Long price;

    @ManyToOne
    private List<Buyer> buyers;



}

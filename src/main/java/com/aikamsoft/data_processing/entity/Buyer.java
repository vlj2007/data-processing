package com.aikamsoft.data_processing.entity;

import javax.persistence.*;

@Entity
@Table(name = "BUYERS")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;



}

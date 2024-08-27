package com.aikamsoft.data_processing.entity;

import javax.persistence.*;

@Entity
@Table(name = "PURCHASES")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "PRICE")
    private Long price;


}

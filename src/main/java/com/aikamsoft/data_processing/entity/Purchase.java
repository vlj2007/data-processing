package com.aikamsoft.data_processing.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PURCHASES")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "PRICE")
    private Long price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;


    public Purchase() {
    }


    public Purchase(Long id, String title, Long price, Product product) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(id, purchase.id) && Objects.equals(title, purchase.title) && Objects.equals(price, purchase.price) && Objects.equals(product, purchase.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, product);
    }


    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", product=" + product +
                '}';
    }
}

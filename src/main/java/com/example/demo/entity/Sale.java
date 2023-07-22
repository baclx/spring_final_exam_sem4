package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    private String salesManId;

    private String salesManName;

    private Date dos;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

package com.hagh.SPDataRest05122022.POJO;


import lombok.*;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Column(name = "description",length = 2000)
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "category")
    private String category;
    @Column(name = "img_url")

    private String imgURL;
    @Column(name = "discount")

    private int discount;
    {
        discount = 0;
        imgURL = "";
        price = 1;
    }

}

package com.dave.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(IndexName = "product", type = "catalog")
public class Product {
    @Id
    private Long id;
    private String name;
    private Integer amount;

    public long getId(Long id) {
        this.id = id;
    }

    public String getName(){return name;}
    public Integer getAmount(){return amount;}

    public void setAmount(Integer amount){
        this.amount = amount;
    }



}

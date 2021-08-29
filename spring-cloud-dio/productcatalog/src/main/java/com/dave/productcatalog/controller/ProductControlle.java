package com.dave.productcatalog.controller;


import com.dave.productcatalog.model.Product;
import com.dave.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductControlle {

        @Autowired
    private ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){

        return productRepository.save(product);
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET)
    Product findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }




}

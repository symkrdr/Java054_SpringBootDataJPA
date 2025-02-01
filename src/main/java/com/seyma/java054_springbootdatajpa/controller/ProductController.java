package com.seyma.java054_springbootdatajpa.controller;

import com.seyma.java054_springbootdatajpa.entity.Product;
import com.seyma.java054_springbootdatajpa.servise.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping("/add-product")
    public ResponseEntity<Void>addProduct(String name,String model,Double price ){
        productService.addProduct(name,model,price);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-all-by-model")
    public ResponseEntity<List<Product>> getAllProductsByModel(String model){
        return ResponseEntity.ok(productService.getAllByModel(model));
    }




}

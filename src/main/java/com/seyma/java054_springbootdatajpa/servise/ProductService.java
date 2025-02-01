package com.seyma.java054_springbootdatajpa.servise;

import com.seyma.java054_springbootdatajpa.entity.Product;
import com.seyma.java054_springbootdatajpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void addProduct(String name, String model, Double price) {
        productRepository.save(Product.builder().name(name).model(model).price(price).build());

    }

    public List<Product> getAllByModel(String model) {
        return productRepository.findAllByModel(model);
    }
}

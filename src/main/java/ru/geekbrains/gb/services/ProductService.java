package ru.geekbrains.gb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.gb.models.ProductModel;
import ru.geekbrains.gb.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public ProductModel findById(Long id) {
        return productRepository.getOne(id);
    }

}

package ru.geekbrains.gb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.gb.models.Product;
import ru.geekbrains.gb.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

//    public Optional<Product> findProduct(Long id){
//        return productRepository.findById(id);
//    }

    public void deleteById(Long id) {
      productRepository.deleteById(id);
    }
}
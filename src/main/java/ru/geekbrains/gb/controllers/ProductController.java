package ru.geekbrains.gb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.gb.models.ProductModel;
import ru.geekbrains.gb.repositories.ProductRepository;


@Controller
public class ProductController {


    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("items", productRepository.findAll());
        model.addAttribute("item", new ProductModel());
        return "index";
    }

    @PostMapping
    public String newProduct(ProductModel productModel) {
        productRepository.save(productModel);
        return "redirect:/";
    }
}

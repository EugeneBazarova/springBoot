package ru.geekbrains.gb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.gb.models.ProductModel;
import ru.geekbrains.gb.repositories.ProductRepository;


@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/products")
    public String productList(Model model) {
        Iterable<ProductModel> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}

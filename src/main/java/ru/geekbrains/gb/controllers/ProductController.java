package ru.geekbrains.gb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.gb.models.ProductModel;
import ru.geekbrains.gb.repositories.ProductRepository;
import ru.geekbrains.gb.services.ProductService;

import java.util.List;


@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<ProductModel> products = productService.findAll();
        model.addAttribute("products", products);
        return "/";
    }

    @PostMapping
    public String newProduct(ProductModel productModel) {
        productService.save(productModel);
        return "redirect:/";
    }
}

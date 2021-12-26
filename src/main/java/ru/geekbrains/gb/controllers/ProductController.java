package ru.geekbrains.gb.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.gb.models.Product;
import ru.geekbrains.gb.services.ProductService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Mainpage");
        return "index";
    }

    @GetMapping("/product-list")
    public String findAll(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/product-list/product-create")
    public String newProduct(Product product) {
        return "product-create";
    }

    @PostMapping("/product-list/product-create")
    public String newProductAdd(@RequestParam String title, @RequestParam Integer cost, Model model) {
        Product product = new Product(title, cost);
        productService.save(product);
        return "redirect:/product-list";
    }

    //    не могу понять, в чем ошибка:
//    при вводе ID в полне поиска url на выходе http://localhost:8080/search/?
//    если дописываю в строке любой ID вручную - показывает таблицу с найденной позицией
    @GetMapping("search/{id}")
    public String findProductPage(@PathVariable long id, Model model) {
        model.addAttribute("product", productService.findProduct(id));
        return "search-result";
    }
}

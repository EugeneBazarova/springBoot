package ru.geekbrains.gb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Meat", 5));
        productList.add(new Product(2, "Egg", 2));
        productList.add(new Product(3, "Potato", 1));
        productList.add(new Product(4, "Lamb", 7));
        productList.add(new Product(5, "Bread", 9));
        productList.add(new Product(6, "Salt", 6));
        productList.add(new Product(7, "Sugar", 8));
        productList.add(new Product(8, "Oil", 1));
        productList.add(new Product(9, "Butter", 4));
        productList.add(new Product(10, "Garlic", 3));
    }

    private static List<Product> manageOrders(Product product) {
        if (product != null) productList.add(product);
        return productList;
    }

    @RequestMapping (value = "/products")
    public String orders(Model model) {
        model.addAttribute("products", manageOrders(null));
        model.addAttribute("product", new Product());
        return "products";
    }

    @RequestMapping (value = "/product-search")
    public String createOrder(@ModelAttribute Product product) {
        System.out.println("search result : " + product);
        manageOrders(product);
        return "redirect:/products";
    }
}

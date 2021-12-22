package ru.geekbrains.gb;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AppController {

    @GetMapping("/product-search")
    public String searchPage() {
        return "product-search";
    }
}

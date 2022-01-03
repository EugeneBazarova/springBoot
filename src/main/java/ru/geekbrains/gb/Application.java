package ru.geekbrains.gb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//TODO
//1. Добавить сущность товар
//2. Добавить сущность категории
//3. Вывести список из 5 товаров с категориями на странице.


//Урок 8. Thymeleaf
//1. Реализуйте REST контроллер для работы с сущностью Product;
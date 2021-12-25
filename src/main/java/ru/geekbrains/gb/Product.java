package ru.geekbrains.gb;


import java.util.Objects;

public class Product {

    private Integer id;
    private String title;
    private Integer cost;

    public Product() {
    }

    public Product(Integer id, String title, Integer cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(title, product.title) &&
                Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, cost);
    }

  @Override
    public String toString() {
        return "Product{" +
                "ID='" + id + '\'' +
                "title='" + title + '\'' +
                ", price=" + cost +
                '}';
    }
}
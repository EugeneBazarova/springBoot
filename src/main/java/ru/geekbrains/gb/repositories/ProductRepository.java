package ru.geekbrains.gb.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.geekbrains.gb.models.ProductModel;


public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}

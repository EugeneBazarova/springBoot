package ru.geekbrains.gb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.gb.models.ProductModel;

import java.util.List;



@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}

package ru.geekbrains.gb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.gb.models.ProductModel;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}

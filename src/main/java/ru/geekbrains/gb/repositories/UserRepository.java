package ru.geekbrains.gb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.gb.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

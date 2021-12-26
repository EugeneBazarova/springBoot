package ru.geekbrains.gb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.gb.models.User;
import ru.geekbrains.gb.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
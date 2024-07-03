package com.fabiomm.ngs_crud_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomm.ngs_crud_backend.entities.User;
import com.fabiomm.ngs_crud_backend.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    // creates a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // returns a user by id or null if it doesn't exist
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    // retrieves all users from DB
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // updates an existing user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // removes a user from the DB by id
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}

package com.example.portifolioweb.services;

import com.example.portifolioweb.entities.User;
import com.example.portifolioweb.repositories.UserRepository;
import com.example.portifolioweb.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        try{
            Optional<User> user = userRepository.findById(id);
            return user.orElseThrow(() -> new ResourceNotFoundException("User not found"));
        }
        catch (Exception e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        }
        catch (Exception e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

    public User update(Long id, User user) {
        try {
            User existingUser = this.findById(id);
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPhone(user.getPhone());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        }
        catch (Exception e) {
            throw new ResourceNotFoundException("User not found with ID: " + id);
        }
    }

}

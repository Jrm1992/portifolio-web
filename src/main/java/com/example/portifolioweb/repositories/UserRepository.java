package com.example.portifolioweb.repositories;

import com.example.portifolioweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

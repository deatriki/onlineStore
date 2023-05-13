package com.example.onlinestore.repo;

import com.example.onlinestore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Додаткові методи запитів до бази даних, якщо потрібно
}


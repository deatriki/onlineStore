package com.example.onlinestore.repo;

import com.example.onlinestore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Додаткові методи запитів до бази даних, якщо потрібно
}

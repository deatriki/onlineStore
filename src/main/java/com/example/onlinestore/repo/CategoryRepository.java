package com.example.onlinestore.repo;

import com.example.onlinestore.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Додаткові методи запитів до бази даних, якщо потрібно
}

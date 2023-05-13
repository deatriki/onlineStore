package com.example.onlinestore.repo;

import com.example.onlinestore.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Додаткові методи запитів до бази даних, якщо потрібно
}

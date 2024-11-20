package com.ey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByPortfolio(int pid);
}

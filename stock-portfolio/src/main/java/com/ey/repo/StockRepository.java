package com.ey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}

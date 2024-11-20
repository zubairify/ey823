package com.ey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {

	Portfolio findByHolderAndPassword(String holder, String password);
	
}

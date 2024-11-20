package com.ey.service;

import java.util.List;

import com.ey.entity.Portfolio;

public interface PortfolioService {

	int addPortfolio(Portfolio p);
	
	Portfolio getPortfolio(int pid);
	
	List<Portfolio> list();
	
	Portfolio validate(String holder, String password);
}

package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Portfolio;
import com.ey.repo.PortfolioRepository;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioRepository repo;
	
	@Override
	public int addPortfolio(Portfolio p) {
		repo.save(p);
		return p.getPid();
	}

	@Override
	public Portfolio getPortfolio(int pid) {
		return repo.findById(pid).get();
	}

	@Override
	public List<Portfolio> list() {
		return repo.findAll();
	}

	@Override
	public Portfolio validate(String holder, String password) {
		return repo.findByHolderAndPassword(holder, password);
	}
}

package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ey.entity.Portfolio;
import com.ey.service.PortfolioService;

@CrossOrigin
@RestController
public class PortfolioController {

	@Autowired
	private PortfolioService service;
	
	@PostMapping(value = "/portfolio", consumes = "application/json")
	public String addPortfolio(@RequestBody Portfolio p) {
		int pid = service.addPortfolio(p);
		return "Portfolio added with Id: " + pid;
	}
	
	@GetMapping(value = "/portfolio/{pid}", produces = "application/json")
	public Portfolio getPortfolio(@PathVariable int pid) {
		return service.getPortfolio(pid);
	}
	
	@GetMapping(value = "/portfolio/list", produces = "application/json")
	public List<Portfolio> listPortfolio() {
		return service.list();
	}
	
	@GetMapping(value = "/portfolio/login", produces = "application/json")
	public Portfolio authenticate(@RequestParam String holder, @RequestParam String password) {
		return service.validate(holder, password);
	}
}

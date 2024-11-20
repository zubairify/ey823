package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ey.entity.Stock;
import com.ey.service.StockService;

@CrossOrigin
@RestController
public class StockController {

	@Autowired
	private StockService service;
	
	@PostMapping(value = "/stock", consumes = "application/json")
	public String addStock(@RequestBody Stock stock) {
		int sid = service.addStock(stock);
		return "Stock added with Id: " + sid;
	}
	
	@GetMapping(value = "/stock/{sid}", produces = "application/json")
	public Stock getStock(@PathVariable int sid) {
		return service.getStock(sid);
	}
	
	@GetMapping(value = "/stock/list", produces = "application/json")
	public List<Stock> listStock() {
		return service.list();
	}
}

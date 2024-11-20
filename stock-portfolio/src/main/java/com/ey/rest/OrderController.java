package com.ey.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ey.service.OrderService;
import com.ey.vo.Input;

@CrossOrigin
@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping(value = "/order/buy", consumes = "application/json")
	public String buyStock(@RequestBody Input in) {
		service.buyStock(in);
		return "Order placed successfully";
	}
	
	@PostMapping(value = "/order/sell", consumes = "application/json")
	public String sellStock(@RequestBody Input in) {
		service.sellStock(in);
		return "Order placed successfully";
	}
}

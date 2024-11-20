package com.capstone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Cart;
import com.capstone.service.CartService;
import com.capstone.vo.CartTemplate;

@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping("/add")
	public Cart add(@RequestBody Cart c) {
		return service.add(c);
	}
	
	@GetMapping("/list/{custid}")
	public List<CartTemplate> list(@PathVariable String custid) {
		return service.listByCustid(custid);
	}
	
	@DeleteMapping("/{cid}")
	public void delete(@PathVariable int cid) {
		service.delete(cid);
	}
}

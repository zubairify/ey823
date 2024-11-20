package com.capstone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capstone.entity.Cart;
import com.capstone.repo.CartRepository;
import com.capstone.vo.CartTemplate;
import com.capstone.vo.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository repo;
	
	@Autowired
	private RestTemplate rest;
	
	@Override
	public Cart add(Cart c) {
		return repo.save(c);
	}

	@Override
	public List<CartTemplate> listByCustid(String custid) {
		ObjectMapper om = new ObjectMapper();
		
		List<Cart> carts = repo.findByCustid(custid);
		
		Object obj = rest.getForObject("http://localhost:9001/product/all", List.class);
		
		List<Product> products = om.convertValue(obj, List.class); 
		
		List<CartTemplate> items = new ArrayList<>();
		
		// Logic to filter products list based on carts product ids
		for(Cart c : carts) {
			CartTemplate ct = new CartTemplate();
			ct.setCart(c);
			
			Product pt = products.stream().filter(p -> p.getId() == c.getId()).findFirst().get();
			ct.setProduct(pt);
			
			items.add(ct);
		}
		return items;
	}

	@Override
	public void delete(int cid) {
		repo.deleteById(cid);
	}

}

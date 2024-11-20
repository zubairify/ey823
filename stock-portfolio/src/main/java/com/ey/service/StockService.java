package com.ey.service;

import java.util.List;

import com.ey.entity.Stock;

public interface StockService {

	int addStock(Stock s);
	
	Stock getStock(int sid);
	
	List<Stock> list();
}

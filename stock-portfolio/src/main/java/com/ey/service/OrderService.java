package com.ey.service;

import com.ey.vo.Input;

public interface OrderService {

	boolean buyStock(Input input);
	
	boolean sellStock(Input input);
}

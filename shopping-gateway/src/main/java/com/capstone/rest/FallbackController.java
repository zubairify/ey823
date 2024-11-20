package com.capstone.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/customerFallback")
	public ResponseEntity<String> customerServiceFallback() {
		return new ResponseEntity<String>("Customer service is taking longer than expected\nPlease try after sometime", HttpStatus.GATEWAY_TIMEOUT);
	}
	
	@GetMapping("/productFallback")
	public ResponseEntity<String> productServiceFallback() {
		return new ResponseEntity<String>("Product service is taking longer than expected\nPlease try after sometime", HttpStatus.GATEWAY_TIMEOUT);
	}
	
	@GetMapping("/cartFallback")
	public ResponseEntity<String> cartServiceFallback() {
		return new ResponseEntity<String>("Cart service is taking longer than expected\nPlease try after sometime", HttpStatus.GATEWAY_TIMEOUT);
	}
}

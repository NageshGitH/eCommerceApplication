package com.ecommerce.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.restapi.dtos.OrderHistoryDTO;
import com.ecommerce.restapi.dtos.OrderProductDTO;
import com.ecommerce.restapi.service.OrderService;

@RestController
@RequestMapping("/api/products")
public class OrderController 
{
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;

	@PostMapping("/order")
	 @ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	public ResponseEntity<String> productOrder(@RequestBody OrderProductDTO orderProDto) throws Exception
	{
		 return new ResponseEntity<String>(orderService.orderProducts(orderProDto), HttpStatus.OK);
	}
	
	@GetMapping("/orderHistory/{userId}")
	 @ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	public ResponseEntity<?> orderHistory(@PathVariable("userId") long userId) throws Exception
	{
		 return new ResponseEntity<List<OrderHistoryDTO>>(orderService.getOrderHistory(userId), HttpStatus.OK);
	}
}

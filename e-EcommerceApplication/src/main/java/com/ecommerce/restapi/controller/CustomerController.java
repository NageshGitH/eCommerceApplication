package com.ecommerce.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.restapi.model.CustomerDetails;
import com.ecommerce.restapi.repository.CustomerRepository;

@RestController
@RequestMapping("/customerAccounts")
public class CustomerController 
{
	@Autowired
	CustomerRepository custRes;

	@PostMapping("/createCustAcc")
	 @ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	public String createCustomerAcounts(@RequestBody CustomerDetails custDetails)
	{
		custRes.save(custDetails);
		return "Customer with accounts details created successfully";
	}
	
}

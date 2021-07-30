package com.ecommerce.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.restapi.model.User;
import com.ecommerce.restapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController
{
	@Autowired
	UserRepository UserRepository;
	
    @PostMapping("/createUser")
    @ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	public String createuser(@RequestBody User user)
	{
    	UserRepository.save(user);
		return "created user";
	}
	
}

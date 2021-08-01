package com.medicare.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.NewUserReg;
import com.medicare.model.Product;
import com.medicare.model.repository.NewUserRepository;

@RestController
@RequestMapping("/newuser")
public class NewUserController {
	@Autowired
	NewUserRepository  newUserRepository;
	
	@PostMapping("/new")
	public NewUserReg addProduct(@RequestBody NewUserReg newUser) {
		return newUserRepository.save(newUser);

	}
	
}

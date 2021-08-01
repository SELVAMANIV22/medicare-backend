package com.medicare.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Product;
import com.medicare.model.repository.ProductRepository;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins ="http://localhost:4200")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/all")
	public List<Product> getAll() {
		List<Product> product = (List<Product>) productRepository.findAll();
		return product;
	}

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);

	}

	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product products) {
		return productRepository.save(products);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}

	@GetMapping("/search/{id}")
	public Optional<Product> getProductid(@PathVariable int date) {
		return productRepository.findById(date);
	}

}

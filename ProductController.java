package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Product;
import com.web.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public String saveRecord(@RequestBody Product product) {
		Product product2 = service.saveRecord(product);
		String message = null;
		if (product2!=null) {
			message = "Data Inserted Successfully";
		}
		else {
			message = "Data Insertion Fail";
		}
		return message;
	}
	@GetMapping("/get/{cid}")
	public Product getRecord(@PathVariable int cid) {
		Product product = service.getOneRecord(cid);
		return product;
	}
	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		List<Product> allProducts = service.getAllRecords();
		return allProducts;
	}
	@DeleteMapping("/delete/{cid}")
	public void deleteOne(@PathVariable int cid) {
		service.deleteRecord(cid);
	}
	@PutMapping("/update/{cid}")
	public Product updateRecord(@RequestBody Product product, @PathVariable int cid) {
		Product product2 = service.updateRecord(product, cid);
		return product2;
	}
}

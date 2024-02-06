package com.web.service;

import java.util.List;

import com.web.entity.Product;

public interface ProductService {

	public Product saveRecord(Product product);
	public Product getOneRecord(int cid);
	public List<Product> getAllRecords();
	public void deleteRecord(int cid);
	public Product updateRecord(Product product, int cid);
}

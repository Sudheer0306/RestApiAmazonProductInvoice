package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Product;
import com.web.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public Product saveRecord(Product product) {
		double price = product.getPrice();
		int quantity = product.getQuantity();
		double total = 0.0;
		total = price * quantity;
		double discount = 0.0, gst = 0.0,invoiceBill = 0.0;
		if (total<2500) {
			discount = 0.1 * total;
		}
		else if (total>=2500 && total<5000) {
			discount = 0.15 * total;
		}
		else {
			discount = 0.3 * total;
		}
		gst = 0.1 * (total - discount);
		invoiceBill = total - discount + gst;
		product.setTotal(total);
		product.setGst(gst);
		product.setDiscount(discount);
		product.setInvoiceBill(invoiceBill);
		Product product2 = repo.save(product);
		
		return product2;
	}

	@Override
	public Product getOneRecord(int cid) {
		Product product = repo.findById(cid).get();
		return product;
	}

	@Override
	public List<Product> getAllRecords() {
		List<Product> allProducts = repo.findAll();
		return allProducts;
	}

	@Override
	public void deleteRecord(int cid) {
		repo.deleteById(cid);
	}

	@Override
	public Product updateRecord(Product product, int cid) {
		Product newRecord = repo.findById(cid).get();
		newRecord.setName(product.getName());
		newRecord.setMobileNo(product.getMobileNo());
		newRecord.setProductName(product.getProductName());
		newRecord.setPrice(product.getPrice());
		newRecord.setQuantity(product.getQuantity());
		
		double price = newRecord.getPrice();
		int quantity = product.getQuantity();
		double total = 0.0;
		total = price * quantity;
		double discount = 0.0, gst = 0.0,invoiceBill = 0.0;
		if (total<2500) {
			discount = 0.1 * total;
		}
		else if (total>=2500 && total<5000) {
			discount = 0.15 * total;
		}
		else {
			discount = 0.3 * total;
		}
		gst = 0.1 * (total - discount);
		invoiceBill = total - discount + gst;
		
		newRecord.setTotal(total);
		newRecord.setDiscount(discount);
		newRecord.setGst(gst);
		newRecord.setInvoiceBill(invoiceBill);
		Product product2 = repo.save(newRecord);
		
		return product2;
	}

}

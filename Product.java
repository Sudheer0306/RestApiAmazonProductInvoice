package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Amazon_Product_Details")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int cid;
	private String name;
	private long mobileNo;
	private String productName;
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double gst;
	private double invoiceBill;
	
	public Product() {
		super();
	}

	public Product(int cid, String name, long mobileNo, String productName, double price, int quantity, double total,
			double discount, double gst, double invoiceBill) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst = gst;
		this.invoiceBill = invoiceBill;
	}

	@Override
	public String toString() {
		return "Product [cid=" + cid + ", name=" + name + ", mobileNo=" + mobileNo + ", productName=" + productName
				+ ", price=" + price + ", quantity=" + quantity + ", total=" + total + ", discount=" + discount
				+ ", gst=" + gst + ", invoiceBill=" + invoiceBill + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getInvoiceBill() {
		return invoiceBill;
	}

	public void setInvoiceBill(double invoiceBill) {
		this.invoiceBill = invoiceBill;
	}
	
	
	
}

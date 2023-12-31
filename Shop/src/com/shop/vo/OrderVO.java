package com.shop.vo;

public class OrderVO {

	private int orderNo;
	private String ordeId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	//	추가필드
	private String name;
	private String prodName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getOrdeId() {
		return ordeId;
	}
	public void setOrdeId(String ordeId) {
		this.ordeId = ordeId;
	}
	
	public int getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return orderNo + ", " + name + ", " + prodName + ", " + orderCount + ", " + orderDate;
	}
	
}

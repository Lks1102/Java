package com.shop.vo;

public class ProductVO {

	private int proNo;
	private String proName;
	private int stock;
	private int price;
	private String company;
	
	public int getProNo() {
		return proNo;
	}
	public void setProNo(int proNo) {
		this.proNo = proNo;
	}
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		
			return "상품번호: " + proNo + ", 상품명: " + proName + ", 가격: " + price + "원, 재고수량: " + stock + ", 제조사명: " + company;
		
	}
	
}

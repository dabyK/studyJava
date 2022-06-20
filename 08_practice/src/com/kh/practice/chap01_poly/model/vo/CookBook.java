package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author,
			String publisher, boolean coupon) {
		super();
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		return "";
	}
	

}

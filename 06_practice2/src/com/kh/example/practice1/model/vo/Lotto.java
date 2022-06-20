package com.kh.example.practice1.model.vo;

public class Lotto {
	
	private int[] lotto;
	
	{
		lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
	}
	
	public Lotto() {
		// TODO Auto-generated constructor stub
	}
	
	public void information() {
		
		for(int v:lotto) {
			System.out.println(v);
		}
		
	}
	

}

package com.inherit.main;

import com.inherit.model.vo.Cat;
import com.inherit.model.vo.Chicken;
import com.inherit.model.vo.Lion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c=new Cat("고양이","고양이과",4);
		Lion l=new Lion("사자","고양이과",4);
		Chicken ch=new Chicken("닭","조류",2);
		
		System.out.println(c.action());
		System.out.println(l.action());
		System.out.println(ch.action());
		
		
		
	}

}

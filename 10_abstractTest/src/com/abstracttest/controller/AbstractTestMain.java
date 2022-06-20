package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplement2;
import com.abstracttest.model.vo.IncludeImplements;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;

public class AbstractTestMain {	
	public static void main(String[] args) {
		//Food f=new Food("중식","짜장면","한국",1,0);
		//System.out.println(f);
		Test t=new Test("한식","돈까스","한국",1,5);
		System.out.println(t);
		System.out.println(t.getName());
		//Food f=new Food(); 불가능
		
		//추상클래스는 참조형자료형 사용이 가능
		Food f=new Test();
		f=new Recipe();
		//Food 자료형의 변수에는 Food를 상속받는 자식객체만 들어갈 수 있다.
		((Recipe)f).cooking();
		
		
		IncludeAbstract ia=new IncludeImplements();
		System.out.println(ia.calculator(10, 20));
		ia=new IncludeImplement2();
		System.out.println(ia.calculator(10, 20));
		System.out.println(ia.getA());
		
		System.out.println(ia.combine("안녕", "하세요"));

		
	}
}

package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplement2;
import com.abstracttest.model.vo.IncludeImplements;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;

public class AbstractTestMain {	
	public static void main(String[] args) {
		//Food f=new Food("�߽�","¥���","�ѱ�",1,0);
		//System.out.println(f);
		Test t=new Test("�ѽ�","���","�ѱ�",1,5);
		System.out.println(t);
		System.out.println(t.getName());
		//Food f=new Food(); �Ұ���
		
		//�߻�Ŭ������ �������ڷ��� ����� ����
		Food f=new Test();
		f=new Recipe();
		//Food �ڷ����� �������� Food�� ��ӹ޴� �ڽİ�ü�� �� �� �ִ�.
		((Recipe)f).cooking();
		
		
		IncludeAbstract ia=new IncludeImplements();
		System.out.println(ia.calculator(10, 20));
		ia=new IncludeImplement2();
		System.out.println(ia.calculator(10, 20));
		System.out.println(ia.getA());
		
		System.out.println(ia.combine("�ȳ�", "�ϼ���"));

		
	}
}

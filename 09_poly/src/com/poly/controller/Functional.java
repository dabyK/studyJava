package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {

//	//Employee내용을 출력하는 기능
//	public void print(Employee e) {
//		System.out.println(e.getName()+" "+e.getAge()+" "+e.getAddress());
//	}
//	
//	//Singer 출력하는 기능
//	public void print(Singer s) {
//		System.out.println(s.getName()+" "+s.getAge()+" "+s.getAddress());
//		
//	}//이렇게 같지만 매개변수가 다른 메소드 만드는 것: 오버로딩

	// 다형성을 이용하여 더 쉽게 오버로딩 이용하기
	public void print(Person p) {
		if (p instanceof Employee) {// instanceof 실제 어떤 값이 들어가 있는지 확인해주는 역할
			//instanceof는 타입을 비교해주는 역할 'p타입이 Employee니?'
			//==,equals는 값 자체를 비교/instanceof는 타입을 비교(너 사실은 Employee야?)
			//들어올 수 있는 값이 Person을 상속받는 모든 객체이므로
			//이 객체가 ㅇㅇ인지 확인해주는 역할
			// Employee 모든 정보 출력
			System.out.println(
					p.getName() + " " + p.getAge() + " " + p.getAddress() + " " + ((Employee) p).getDepartment() + " "
							+ ((Employee) p).getJob() + " " + ((Employee) p).getSalary());
		} else if (p instanceof Singer) {
			// Singer 모든 정보 출력
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getAddress() + " " + ((Singer) p).getTitle()
					+ " " + ((Singer) p).getYear() + " " + ((Singer) p).getGenre());
		}
	}// person에 em과 sin이 다형성 된 상태면 이렇게 쓸 수 있다.

}

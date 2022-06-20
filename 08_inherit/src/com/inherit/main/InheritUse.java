package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {

	public static void main(String[] args) {
		//내가 관리하는 객체(student,employee,teacher)
		//이름은 두글자 이상만 들어갈 수 있게!
		
		Teacher t=new Teacher();
		t.getName();
		t.getAge();
		t.setName("한");
		Student s=new Student();
		s.setName("한");
		Employee e=new Employee();
		e.setName("한");
		//상속을 하게 되면 유지 보수가 더 쉬워진다.
		
		//관리하고 있는 전체 객체에 성별 추가하고 싶으면 Person만 수정하면 된다.
		t.setGender("여");
		System.out.println(t.getGender());
		
		s=new Student();
		System.out.println(s.information());
		
		s=new Student("유병승",19,"경기도","01036446259","남",3,1,2);
		System.out.println(s.information());
		
		//모든 객체는 Object의 후손이다!
		//Java에서 Object는 최상위객체다!
		ObjectTest test=new ObjectTest();
		//test.
		//s.
		Object obj;//최상위객체! 조상!
		
	}
	
	
	
	
}

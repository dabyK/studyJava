package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {

	public static void main(String[] args) {
		//���� �����ϴ� ��ü(student,employee,teacher)
		//�̸��� �α��� �̻� �� �� �ְ�!
		
		Teacher t=new Teacher();
		t.getName();
		t.getAge();
		t.setName("��");
		Student s=new Student();
		s.setName("��");
		Employee e=new Employee();
		e.setName("��");
		//����� �ϰ� �Ǹ� ���� ������ �� ��������.
		
		//�����ϰ� �ִ� ��ü ��ü�� ���� �߰��ϰ� ������ Person�� �����ϸ� �ȴ�.
		t.setGender("��");
		System.out.println(t.getGender());
		
		s=new Student();
		System.out.println(s.information());
		
		s=new Student("������",19,"��⵵","01036446259","��",3,1,2);
		System.out.println(s.information());
		
		//��� ��ü�� Object�� �ļ��̴�!
		//Java���� Object�� �ֻ�����ü��!
		ObjectTest test=new ObjectTest();
		//test.
		//s.
		Object obj;//�ֻ�����ü! ����!
		
	}
	
	
	
	
}

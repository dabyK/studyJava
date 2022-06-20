package com.kh.controller;

import com.kh.model.vo.Driver;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;

public class PersonController {

	public static void main(String[] args) {

		Person[] persons = new Person[10];
//		for(int i=0;i<persons.length;i++) {
//			switch(i) {
//			case 0: case 3: case 6:
//				persons[i]=new Student(); break;
//			case 1: case 4: case 7:
//				persons[i]=new Employee(); break;
//			case 2: case 5: case 8:
//				persons[i]=new Driver(); break;				
//			}
//		}
		persons[0] = new Student("��", 18, '��', 1, 1, 1);
		persons[1] = new Employee("��", 21, '��', "������", "�븮", 4000);
		persons[2] = new Driver("��", 24, '��', 5, 0);
		persons[3] = new Student("��", 19, '��', 1, 1, 1);
		persons[4] = new Employee("��", 22, '��', "������", "����", 4000);
		persons[5] = new Driver("��", 25, '��', 5, 0);
		persons[6] = new Student("��", 20, '��', 1, 1, 1);
		persons[7] = new Employee("��", 23, '��', "������", "�븮", 4000);
		persons[8] = new Driver("��", 26, '��', 5, 0);

		int count = 0, sCount = 0, eCount = 0, dCount = 0;

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				sCount++;
				count++;
			} else if (persons[i] instanceof Employee) {
				eCount++;
				count++;
			} else if (persons[i] instanceof Driver) {
				dCount++;
				count++;
			}
		}
		System.out.println("��ϵ� ��� �� : " + count + "��");
		System.out.println("�л� : " + sCount + "��");
		System.out.println("ȸ��� : " + eCount + "��");
		System.out.println("������ : " + dCount + "��");
		System.out.println("��ϵ� ȸ�� ������ ����ϱ�");
		System.out.println("====�л�====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Student) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Student) persons[j]).getGrade() + ((Student) persons[j]).getBan()
						+ ((Student) persons[j]).getNum());
			}
		}
		System.out.println("====ȸ���====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Employee) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Employee) persons[j]).getDepart() + ((Employee) persons[j]).getJob()
						+ ((Employee) persons[j]).getSalary());
			}
		}
		System.out.println("====������ ====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Driver) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Driver) persons[j]).getYear() + ((Driver) persons[j]).getAcc());
			}
		}

	}// �޼ҵ�

}

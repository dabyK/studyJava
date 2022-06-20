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
		persons[0] = new Student("가", 18, '남', 1, 1, 1);
		persons[1] = new Employee("나", 21, '여', "개발팀", "대리", 4000);
		persons[2] = new Driver("다", 24, '남', 5, 0);
		persons[3] = new Student("라", 19, '남', 1, 1, 1);
		persons[4] = new Employee("마", 22, '여', "개발팀", "과장", 4000);
		persons[5] = new Driver("바", 25, '남', 5, 0);
		persons[6] = new Student("사", 20, '남', 1, 1, 1);
		persons[7] = new Employee("아", 23, '여', "개발팀", "대리", 4000);
		persons[8] = new Driver("자", 26, '남', 5, 0);

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
		System.out.println("등록된 사람 수 : " + count + "명");
		System.out.println("학생 : " + sCount + "명");
		System.out.println("회사원 : " + eCount + "명");
		System.out.println("운전수 : " + dCount + "명");
		System.out.println("등록된 회원 직업별 출력하기");
		System.out.println("====학생====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Student) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Student) persons[j]).getGrade() + ((Student) persons[j]).getBan()
						+ ((Student) persons[j]).getNum());
			}
		}
		System.out.println("====회사원====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Employee) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Employee) persons[j]).getDepart() + ((Employee) persons[j]).getJob()
						+ ((Employee) persons[j]).getSalary());
			}
		}
		System.out.println("====운전수 ====");
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Driver) {
				System.out.println(persons[j].getName() + persons[j].getAge() + persons[j].getGender()
						+ ((Driver) persons[j]).getYear() + ((Driver) persons[j]).getAcc());
			}
		}

	}// 메소드

}

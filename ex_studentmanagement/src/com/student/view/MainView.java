package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentManager;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
	// Client에게 보여지는 화면을 담당하는 객체
	private StudentManager sm;

	// 1.main 화면
	public void mainMenu(StudentManager sm) {
		this.sm = sm;
		System.out.println("==== 학생관리 프로그램 v01====");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 전체학생 조회");
			System.out.println("3. 이름으로 조회");
			System.out.println("4. 성적 등록");
			System.out.println("5. 학년으로 조회");
			System.out.println("6. 성적조회하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				this.sm.enrollStudent();
				break;
			case 2:
				this.sm.searchAll();
				break;
			case 3:
				this.sm.searchName();
				break;
			case 4:
				this.sm.inputGrade();
				break;
			case 5:
				this.sm.searchG();
				break;
			case 6:
				this.sm.searchNG();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}// 메소드

	// 학생정보 입력받는 화면구성(메소드)
	public Student enrollStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생등록 화면=====");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int ban = sc.nextInt();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();

		Student s = new Student(name, grade, ban, number, address, phone);
		// 입력받은 값을 받아주는 Student객체 만듬
		// 값이 6개나 되고, 자료형도 다 다르다-리턴받을 수 있는 리턴값은 한개뿐
		// 그러므로 객체로 넘겨서 다양한 자료형을 객체라는 한개의 자료형으로 리턴할 수 있으니까
		return s;

	}

	// 알림 출력해주는 기능 추가
	public void printMsg(String msg) {
		System.out.println("===== 시스템 메세지 =====");
		System.out.println("알림 : " + msg);
		System.out.println();
	}

	// 이름입력받는 기능
	public String inputName() {
		System.out.println("==== 이름 조회 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		return name;
	}

	// student출력기능 만들기
	public void printStudents(Student[] students) {
		for (Student s : students) {
			if (s != null) {
				System.out.println(s.information());
				if(s.getGradePoint()!=null) {
					System.out.println("성적 : "+s.getGradePoint().printGrade());
				}
			}
		}
	}
	
	//성적 입력받는 기능
	public Grade inputGrade() {
		//성적을 입력받는 로직 구성
		Scanner sc=new Scanner(System.in); 
		System.out.println("===== 성적입력화면 =====");		
		
		System.out.print("국어 성적 : ");
		//Grade g=new Grade();
		//g.setKor(sc.nextInt()); 
		//이렇게 쓸 수도 있다!
		//그러면 마지막에 return g;
		int kor=sc.nextInt();
		System.out.print("영어 성적 : ");
		int eng=sc.nextInt();
		System.out.print("수학 성적 : ");
		int math=sc.nextInt();
		System.out.print("코딩 성적 : ");
		int coding=sc.nextInt();
		
		Grade grade = new Grade(kor,eng,math,coding);
		//같은 자료형일 때는 순서가 헷갈릴 수 있기 때문에, set으로 쓰는 게 더 나음
		
		
		return grade;	
		//return new Grade(kor,eng,math,coding); 로 써도 됨
	}
	
	//학년조회-학년 입력
	public int inputG() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====학년 조회=====");
		System.out.print("학년 : ");
		int gr=sc.nextInt();
		return gr;
	}
	
	//학년조회-학년결과 출력
	public void printgr(Student[] studentgr) {
		for(Student s:studentgr) {
			if(s!=null) {
			System.out.println(s.information());
			}
		}
	}
	

}

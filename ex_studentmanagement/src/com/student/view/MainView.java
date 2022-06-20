package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentManager;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
	// Client���� �������� ȭ���� ����ϴ� ��ü
	private StudentManager sm;

	// 1.main ȭ��
	public void mainMenu(StudentManager sm) {
		this.sm = sm;
		System.out.println("==== �л����� ���α׷� v01====");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. �л����");
			System.out.println("2. ��ü�л� ��ȸ");
			System.out.println("3. �̸����� ��ȸ");
			System.out.println("4. ���� ���");
			System.out.println("5. �г����� ��ȸ");
			System.out.println("6. ������ȸ�ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}

	}// �޼ҵ�

	// �л����� �Է¹޴� ȭ�鱸��(�޼ҵ�)
	public Student enrollStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�л���� ȭ��=====");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("�� : ");
		int ban = sc.nextInt();
		System.out.print("��ȣ : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();

		Student s = new Student(name, grade, ban, number, address, phone);
		// �Է¹��� ���� �޾��ִ� Student��ü ����
		// ���� 6���� �ǰ�, �ڷ����� �� �ٸ���-���Ϲ��� �� �ִ� ���ϰ��� �Ѱ���
		// �׷��Ƿ� ��ü�� �Ѱܼ� �پ��� �ڷ����� ��ü��� �Ѱ��� �ڷ������� ������ �� �����ϱ�
		return s;

	}

	// �˸� ������ִ� ��� �߰�
	public void printMsg(String msg) {
		System.out.println("===== �ý��� �޼��� =====");
		System.out.println("�˸� : " + msg);
		System.out.println();
	}

	// �̸��Է¹޴� ���
	public String inputName() {
		System.out.println("==== �̸� ��ȸ ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		return name;
	}

	// student��±�� �����
	public void printStudents(Student[] students) {
		for (Student s : students) {
			if (s != null) {
				System.out.println(s.information());
				if(s.getGradePoint()!=null) {
					System.out.println("���� : "+s.getGradePoint().printGrade());
				}
			}
		}
	}
	
	//���� �Է¹޴� ���
	public Grade inputGrade() {
		//������ �Է¹޴� ���� ����
		Scanner sc=new Scanner(System.in); 
		System.out.println("===== �����Է�ȭ�� =====");		
		
		System.out.print("���� ���� : ");
		//Grade g=new Grade();
		//g.setKor(sc.nextInt()); 
		//�̷��� �� ���� �ִ�!
		//�׷��� �������� return g;
		int kor=sc.nextInt();
		System.out.print("���� ���� : ");
		int eng=sc.nextInt();
		System.out.print("���� ���� : ");
		int math=sc.nextInt();
		System.out.print("�ڵ� ���� : ");
		int coding=sc.nextInt();
		
		Grade grade = new Grade(kor,eng,math,coding);
		//���� �ڷ����� ���� ������ �򰥸� �� �ֱ� ������, set���� ���� �� �� ����
		
		
		return grade;	
		//return new Grade(kor,eng,math,coding); �� �ᵵ ��
	}
	
	//�г���ȸ-�г� �Է�
	public int inputG() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====�г� ��ȸ=====");
		System.out.print("�г� : ");
		int gr=sc.nextInt();
		return gr;
	}
	
	//�г���ȸ-�г��� ���
	public void printgr(Student[] studentgr) {
		for(Student s:studentgr) {
			if(s!=null) {
			System.out.println(s.information());
			}
		}
	}
	

}

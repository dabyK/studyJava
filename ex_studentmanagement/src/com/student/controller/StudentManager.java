package com.student.controller;

import com.student.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentManager {
	private StudentDB db = new StudentDB();
	// �����ͺ��̽����� ���� �ҷ��� ��, new�� ���� �����ϰ� �Ǵµ� �׷���
	// �ʿ��� ������ �� ��ü�� �ҷ����� �ǰ�, �׷��� ���� ����� ��ü�� ���� �ҷ������� ��ü��
	// ���� �����Ǿ� �ٸ� ������ �ȴ�. �׷��� ���� �� ���� ����� ��ü�� �ҷ��� ��ü�� �ٸ� ��ü�ϱ�
	// �׷��� �����μ� �������ִ� ������ �ʿ�-������ ��ü�� �Է�/����/��� �� �� �ֵ���

	// ���񽺺� �л����, ����ȭ�� ���, ������ ���� �� ��� ����
	public void mainView() {
		// ����ȭ������ �������ִ� ���
		new MainView().mainMenu(this);// �� �ڽ��� �ּ�! Ŭ���� ��ü�� �ּ�..?
		// �̰� ���κ信 �Ѿ�� ���θ޴� �޼ҵ忡 ��
	}

	// �л� ��� ����
	public void enrollStudent() {
		// Student��ü�� ���� ����
		// Student�� �� �� ������ �Է� -> client�� �Է� -> ȭ���� ��������� ->MainView
		Student s = new MainView().enrollStudent();
		System.out.println(s.information());

		// �Է¹��� �����͸� ����ҿ� ����
		boolean result = db.saveStudent(s);// DB�� �����ϱ�
		System.out.println(result);
		// �˶� �޽��� ����
		new MainView().printMsg(result ? "�Է¼���" : "�Է½���");
	}

	// �̸����� ��ȸ ���� ����
	public void searchName() {
		// �̸����� ��ȸ
		String name = new MainView().inputName();
		Student s = db.searchName(name);
		if (s == null) {
			new MainView().printMsg("��ȸ����� �����ϴ�!");
		} else {
			System.out.println("��ȸ��� : " + s.information());
		}

	}

	// ��ü �л� ��ȸ ���� ����
	public void searchAll() {
		Student[] students = db.searchAll();
		new MainView().printStudents(students);
	}

	// ���� ��� ���� ����
	public void inputGrade() {
		// ������ ����ϴ� ���
		// �Ѹ� �л��� �����Ͽ� ������ �Է��ϴ� ����
		searchAll(); // ��üȸ�� ��ȸ!
		String name = new MainView().inputName();
		Student s = db.searchName(name); //name�� db�� �ִ� �̸����� ã���ְ� ������ �����ϴ� �޼ҵ�
		                        		//������ �� �̸��� �ٸ� �������� s ��ü�� ��
		if (s != null) {// ã�� �л��� ����(null�� �ƴ�) - �������ȭ������ �̵�
			Grade g = new MainView().inputGrade();//������ �Է¹޾� grade ��ü�� �����ϴ� �޼ҵ�
					//�Է¹޾ƾ� �ϴϱ� mainview���� ����	//(������ �����ϱ� ����grade��ü�� ���������ϱ�)
							//������ ����� ��ü�� g�� ����
			s.setGradePoint(g);//���� ������ student ��ü�� ������ �Է��ϴ� ���
			System.out.println("���� �Է� ����!");
			System.out.println("���� : "+s.getGradePoint().printGrade());
			
		} else {// ���� ����� �л��� ���� - ���ٴ� �˸��޼��� ���
			new MainView().printMsg("��ϵ� �л��� �ƴմϴ�.");

		}

	}
	
	//�г���ȸ ���� ����
	public void searchG() {
		//�г� �˻��� �� �ޱ�
		int gr=new MainView().inputG();
		Student[] studentgr = db.searchG(gr);
		if(studentgr!=null) {
		new MainView().printgr(studentgr);
		}else {
		new MainView().printMsg("��ȸ�� �л��� �����ϴ�.");
		}
		
		
	}
	
	// �������� ��ȸ ���� ����
		public void searchNG() {
			// �̸����� ��ȸ
			String name = new MainView().inputName();
			Student s = db.searchName(name);
			if (s == null) {
				new MainView().printMsg("��ȸ����� �����ϴ�!");
			} else {
				System.out.println("��ȸ��� : " );
				System.out.println(s.information()+s.getGradePoint().printGrade());
			}

		}
	
	

}

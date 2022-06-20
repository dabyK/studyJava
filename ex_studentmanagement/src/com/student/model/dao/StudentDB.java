package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDB {
	// �����͸� �����ϴ� ������ �ϴ� ��ü
	// �Էµ� �����͸� �����ϴ� ����
//	private Student s; // ��Ʃ��Ʈ s ��ü�� ���������� �޼ҵ� ������ �����. �������� �����Ϸ��� ��������
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
//	private Student s5;

	private Student[] students = new Student[6];// �� ���ٷ� ��������

	// 1. ���޹��� �����͸� ��������� �����Ͽ� �����ϱ�
	// �Ű�����=�Ķ����
	public boolean saveStudent(Student s) {
		// ���޹��� Student s�� ���������� �� ����� ����
		// �׸��� �� ����ƴ��� boolean������ �޾��ִ� ����
		boolean result = true;
//		if(this.s ==null)  this.s=s;
//		else if(this.s1==null) this.s1=s;
//		else if(this.s2==null) this.s2=s;
//		else if(this.s3==null) this.s3=s;
//		else if(this.s4==null) this.s4=s;
//		else if(this.s5==null) this.s5=s;
//		else { 
//				//System.out.println("���̻� ������ ������ �����ϴ�.");}
//				result=false;}
		int count = 0;
		for (int i = 0; i < students.length; i++, count++) {
			if (students[i] == null) {
				students[i] = s;
				break;
			}

		}
		if (count == students.length) {
			result = false;
		}
		return result;
	}

	// ���޹��� �̸����� �˻��ؼ� ��� ��ȯ�ϱ�
	public Student searchName(String name) { // �� ������ ��ü�� �޳ĸ�, �̸��� �˻����� ��
												// ��ü�� �ִ� �̸��� ������ �����鵵 �ҷ����� ���ؼ�
												// �̸��� �ʿ��ϴٸ� getName()���� �θ� �� �����ϱ�
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				return students[i];
			}
		}
		return null;
//		if (s.getName().equals(name))
//			return s;
//		else if (s1.getName().equals(name))
//			return s1;
//		else if (s2.getName().equals(name))
//			return s2;
//		else if (s3.getName().equals(name))
//			return s3;
//		else if (s4.getName().equals(name))
//			return s4;
//		else if (s5.getName().equals(name))
//			return s5;
//		else
//			return null;// ���� ��
	}

	// ������ȸ�ϱ�!
	public Student[] searchAll() { // Student[]�� ��ü�迭�� �ڷ�����
		return students;
	}

	// �г����� ��ȸ�ϱ�
	public Student[] searchG(int gr) {
		Student[] studentgr=new Student[6];		
		
		int j=0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null&&students[i].getGrade() == gr) {
				studentgr[j]=students[i];
				j++;
			}
		}
		if(j==0) {
			return null;
		}
		return studentgr;

	}

}
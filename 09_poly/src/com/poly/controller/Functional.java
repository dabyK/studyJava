package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {

//	//Employee������ ����ϴ� ���
//	public void print(Employee e) {
//		System.out.println(e.getName()+" "+e.getAge()+" "+e.getAddress());
//	}
//	
//	//Singer ����ϴ� ���
//	public void print(Singer s) {
//		System.out.println(s.getName()+" "+s.getAge()+" "+s.getAddress());
//		
//	}//�̷��� ������ �Ű������� �ٸ� �޼ҵ� ����� ��: �����ε�

	// �������� �̿��Ͽ� �� ���� �����ε� �̿��ϱ�
	public void print(Person p) {
		if (p instanceof Employee) {// instanceof ���� � ���� �� �ִ��� Ȯ�����ִ� ����
			//instanceof�� Ÿ���� �����ִ� ���� 'pŸ���� Employee��?'
			//==,equals�� �� ��ü�� ��/instanceof�� Ÿ���� ��(�� ����� Employee��?)
			//���� �� �ִ� ���� Person�� ��ӹ޴� ��� ��ü�̹Ƿ�
			//�� ��ü�� �������� Ȯ�����ִ� ����
			// Employee ��� ���� ���
			System.out.println(
					p.getName() + " " + p.getAge() + " " + p.getAddress() + " " + ((Employee) p).getDepartment() + " "
							+ ((Employee) p).getJob() + " " + ((Employee) p).getSalary());
		} else if (p instanceof Singer) {
			// Singer ��� ���� ���
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getAddress() + " " + ((Singer) p).getTitle()
					+ " " + ((Singer) p).getYear() + " " + ((Singer) p).getGenre());
		}
	}// person�� em�� sin�� ������ �� ���¸� �̷��� �� �� �ִ�.

}

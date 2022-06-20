package com.subio.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.subio.model.vo.Student;

public class StudentController {
	Scanner sc = new Scanner(System.in);

	public void saveData() {
		
		Student[] sArr = new Student[6];
		for (int i = 0; i < 6; i++) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {

				System.out.print("�̸�: ");
				String name = sc.nextLine();
				System.out.print("����: ");
				int age = sc.nextInt();
				System.out.print("�й�: ");
				int num = sc.nextInt();
				System.out.print("�а�: ");
				sc.nextLine();
				String major = sc.nextLine();
				System.out.print("�г�: ");
				int grade = sc.nextInt();
				sc.nextLine();
				sArr[i] = new Student(name, age, num, major, grade);

				oos.writeObject(sArr[i]);
//				oos.writeObject(sArr);
				//�Է°� �޴� ���� �����ϰ�, oos�� �����ϴ� �� �����Ѵٸ�
				//������ �̷��� �ص� �ȴ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void loadData() {
		Student[] sArr = new Student[6];
		for (int i = 0; i < 6; i++) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {

				sArr[i] = (Student) ois.readObject();
				
				
				//sArr=(Student[])ois.readObject();
				//���� �� �� �� �̷��� �ϸ� for�� �ȵ����� ��!
				//�迭�� ���������� �迭��
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (Student v : sArr) {
			System.out.println(v);
		}

	}

}

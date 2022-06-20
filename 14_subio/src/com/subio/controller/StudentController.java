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

				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("학번: ");
				int num = sc.nextInt();
				System.out.print("학과: ");
				sc.nextLine();
				String major = sc.nextLine();
				System.out.print("학년: ");
				int grade = sc.nextInt();
				sc.nextLine();
				sArr[i] = new Student(name, age, num, major, grade);

				oos.writeObject(sArr[i]);
//				oos.writeObject(sArr);
				//입력값 받는 로직 따로하고, oos에 대입하는 식 따로한다면
				//대입을 이렇게 해도 된다.
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
				//쌤이 한 것 → 이렇게 하면 for문 안돌려도 됨!
				//배열을 저장했으니 배열을
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

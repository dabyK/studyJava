package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.subio.model.vo.Person;

public class Practice {

	Person p = new Person();
	Person[] pArr = new Person[3];

	public void output() {
		Scanner sc = new Scanner(System.in);

		try (FileOutputStream out = new FileOutputStream("person.data");
				DataOutputStream dout = new DataOutputStream(out)) {
			for (int i = 0; i < 3; i++) {
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("���� : ");
				char gender = sc.next().charAt(0);
				sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				String phone = sc.nextLine();
				dout.writeUTF(name);
				dout.writeInt(age);
				dout.writeChar(gender);
				dout.writeUTF(phone);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void input() {

		try (DataInputStream dis = new DataInputStream(new FileInputStream("person.data"))) {
			for (int i = 0; i < 3; i++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				char gender = dis.readChar();
				String phone = dis.readUTF();
				pArr[i]=new Person(name,age,gender,phone);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Person v:pArr) {
			System.out.println(v);
		}

	}

}

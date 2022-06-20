package com.subio.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.subio.model.vo.Person;

public class ObjectInputOutput {

	public void saveObject() {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream("object.data");
			oos = new ObjectOutputStream(fos);

			// ������ ����
			oos.writeObject(new Person("������", 19, '��', "010"));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public void loadObject() {
		Person p=null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {
			
//			try {
			p=(Person)ois.readObject();
			//�ҷ��°� Person��ü�� �ƴ� Object�̱� ������  Person���� 
			//��������ȯ �������
			//PersonŬ������ �������� �����ϱ� ����ó���� �������
//			}catch(ClassNotFoundException e) {
//				e.printStackTrace();				
//			}
//			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//������ ����ó���ص��ǰ� �̷��� �ؿ��� ���൵ ok
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(p);

	}

}

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

			// 데이터 저장
			oos.writeObject(new Person("유병승", 19, '남', "010"));

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
			//불러온건 Person객체가 아닌 Object이기 때문에  Person으로 
			//강제형변환 해줘야함
			//Person클래스가 없을수도 있으니까 오류처리도 해줘야함
//			}catch(ClassNotFoundException e) {
//				e.printStackTrace();				
//			}
//			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//저위에 예외처리해도되고 이렇게 밑에서 해줘도 ok
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(p);

	}

}

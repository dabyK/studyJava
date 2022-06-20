package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.MyGeneric;
import com.generic.model.vo.Student;

public class GenericTest {
	
	public static void main(String[] args) {
		//���׸��̶�
		//Ŭ���� ����ÿ� �ڷ����� ������ �ʰ� �����ÿ� �ڷ����� Ȯ������ ���
		//�������, �޼ҵ��ȯ��, �޼ҵ�Ű�����
		//Collection���� ���� ����ȴ� ���� Collectioc������ ��������
		
		ArrayList<Student> students=new ArrayList();
		//�л���ü�� �����Ұž�! ��� ��
		
		students.add(new Student("������",3,1));
		students.add(new Student("������",2,2));
		students.add(new Student("������",2,3));
		//students.add(new Date());//�л��� �����ϰ� ������...�ٸ� �͵� ����ȴ�! ����ұ�!
		//ArrayList�ڿ� <>�� Student�� ���ִϱ� Date�� ���� �� ���� �Ǿ���.
		//���� �θ����� <>�� �־���ٸ�, �ڽİ�ü���� �� ����  �� �ִ�.
		//�ؿ�ó�� ���� ����� ���� ���ٸ�(�θ�� �־��µ� �ڽĿ��� �����´ٸ�)�� ���� ��������Ģ���� ���� ����ȯ�� ����� �Ѵ�.
		
		students.get(0).getName(); //����ȯ�߾���ϴµ� ���ص��ȴ�!!! ���׸����� Student���� �����������Ƿ�
								//����ȯ ���ص� Student���� �˰� �����Ƿ� 
							
		ArrayList<String> names=new ArrayList();
		names.add("������"); //���ڸ� �� �� �־�
		names.add("�����");
		//names.add(new Student());
		
		
		//Set���� �ش��!
//		Set<Integer> number=new HashSet<Integer>();
//		number.add(1);
//		number.add(2);
//		number.add(3);
//		number.add(4);
		
		Set<Student> s=new HashSet<Student>(students); //set���� list�� ���� �� ����
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName()); //����ȯ �����൵ �Ǵ°�! Student���� �˰� �����Ƿ�
		}
		
		
		//map���� �ش��!
		HashMap<String,Student> studensMap=new HashMap();
		studensMap.put("1", new Student("�����",3,1));
		studensMap.put("2", new Student("������",3,2));
		studensMap.put("3", new Student("�̼���",2,1));
		studensMap.put("4", new Student("������",3,1));
		
		//��ȸ�ϱ�! �̸��� ����ϱ�, �г��� 3�г��� ����� �̸���
		
		Set<String> sk=studensMap.keySet();
		Iterator<String> its=sk.iterator();
		while(its.hasNext()) {
			Student ss=studensMap.get(its.next());
			if(ss.getGrade()==3) {
			System.out.println(ss.getName());		
			}		
		}
		
		//Entry
		System.out.println("map.entry ���׸�");
		Set<Map.Entry<String, Student>> entry=studensMap.entrySet();
		Iterator<Map.Entry<String, Student>> it2=entry.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Student> e=it2.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		for(Map.Entry<String,Student>e:studensMap.entrySet()) {
			if(e.getValue().getGrade()==3) {
				System.out.println(e.getValue().getName());
			}
		}
		
		MyGeneric<String,Integer> g=new MyGeneric();
		g.setTestValue("�ȳ�"); 
		System.out.println(g.getTestValue());
		MyGeneric<ArrayList<Integer>,HashMap> arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		//arr.getTestValue().add(new Student());
		
	}

}

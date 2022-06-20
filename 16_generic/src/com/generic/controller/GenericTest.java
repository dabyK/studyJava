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
		//제네릭이란
		//클래스 설계시에 자료형을 정하지 않고 생성시에 자료형을 확정짓는 방법
		//멤버변수, 메소드반환형, 메소드매개변수
		//Collection에서 많이 적용된다 거의 Collectioc에서만 쓸수있음
		
		ArrayList<Student> students=new ArrayList();
		//학생객체만 저장할거야! 라는 뜻
		
		students.add(new Student("유병승",3,1));
		students.add(new Student("유다해",2,2));
		students.add(new Student("박현우",2,3));
		//students.add(new Date());//학생만 저장하고 싶은데...다른 것도 저장된다! 어떻게할까!
		//ArrayList뒤에 <>로 Student를 해주니까 Date를 넣을 수 없게 되었다.
		//만약 부모형을 <>로 넣어줬다면, 자식객체들은 다 넣을  수 있다.
		//밑에처럼 직접 기능을 갖다 쓴다면(부모로 넣었는데 자식에서 꺼내온다면)그 때는 다형성법칙으로 인해 형변환을 해줘야 한다.
		
		students.get(0).getName(); //형변환했어야하는데 안해도된다!!! 제네릭으로 Student임을 선언해줬으므로
								//형변환 안해도 Student임을 알고 있으므로 
							
		ArrayList<String> names=new ArrayList();
		names.add("유병승"); //문자만 들어갈 수 있엉
		names.add("김다희");
		//names.add(new Student());
		
		
		//Set에도 해당됨!
//		Set<Integer> number=new HashSet<Integer>();
//		number.add(1);
//		number.add(2);
//		number.add(3);
//		number.add(4);
		
		Set<Student> s=new HashSet<Student>(students); //set에는 list를 넣을 수 있음
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName()); //형변환 안해줘도 되는것! Student임을 알고 있으므로
		}
		
		
		//map에도 해당됨!
		HashMap<String,Student> studensMap=new HashMap();
		studensMap.put("1", new Student("김다희",3,1));
		studensMap.put("2", new Student("정로희",3,2));
		studensMap.put("3", new Student("이세현",2,1));
		studensMap.put("4", new Student("남지선",3,1));
		
		//순회하기! 이름만 출력하기, 학년이 3학년인 사람의 이름만
		
		Set<String> sk=studensMap.keySet();
		Iterator<String> its=sk.iterator();
		while(its.hasNext()) {
			Student ss=studensMap.get(its.next());
			if(ss.getGrade()==3) {
			System.out.println(ss.getName());		
			}		
		}
		
		//Entry
		System.out.println("map.entry 제네릭");
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
		g.setTestValue("안녕"); 
		System.out.println(g.getTestValue());
		MyGeneric<ArrayList<Integer>,HashMap> arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		//arr.getTestValue().add(new Student());
		
	}

}

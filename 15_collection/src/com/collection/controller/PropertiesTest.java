package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public void propertiesTest() {
		//Properties : key = value형식으로 저장하는 클래스
		//문자열 자료를 저장하는 클래스
		//key : String, value : String 둘다 String인 것을 저장
		//가장 큰 장점: 파일과 연동하여 처리할 수 있음
		//파일에 저장하고, 저장된 것을 가져올 수 있다.
		//프로그램의 주요 설정파일, 환경데이터 등을 저장하고 불러올 때 많이 사용한다
		
		//생성해서 사용함
		Properties prop=new Properties();
		//객체에 데이터를 대입하기
		//setProperty(key,value)메소드 이용해서 대입
//		prop.setProperty("name", "김다희");
//		prop.setProperty("age", "28");
		
		//파일에 간편하게 저장할 수 있음
		//store(문자저장스트림)메소드 이용
//		try {
//		prop.store(new FileWriter("prop.properties"), "properties저장 연습! 주석의 자리");//properties는 확장자명도 같은 이름으로 쓴다
//		
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		//close 안해도 된다.
		
		//refresh하면 파일이 생긴다!
		//이때 이 파일의 위치에서 파일을 메모장으로 작성,수정하고 저장한뒤 끄면 반영되어있다
		
		//파일에 저장된 내용 불러오기
		//load(문자열불러오는스트림)메소드 이용
		try {
			//prop.load(new FileReader("prop.properties"));
			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//properties에 있는 값 출력하기
		//gerProperty(키값);'
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("selectMember"));
		
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));
//		System.out.println(prop.getProperty("nickname"));
		
		
		//그냥 파일 만들어서 내용 적고 불러올 수도 있다
		//key=value =이 구분자가 되는 것 참고!
		
		
		
		
		
		
		
	}
	
	
}

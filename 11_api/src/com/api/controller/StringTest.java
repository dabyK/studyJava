package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		//String객체 이용하기
		//불변의 객체!! String에 있는 값을 수정, 삽입, 삭제가 불가능하다.
		String name="유병승";
		//hashCode() ->주소값을 의미함
		System.out.println(name+" : "+name.hashCode());
		name+="천재";
		System.out.println(name+" : "+name.hashCode());
		
		//String 객체에서 유용하게 사용하는 메소드!
		//문자열에 있는 문자 찾기 : contains();
		String test="가나다라마바사아차카";
//		for(int i=0;i<test.length();i++) {
//			if(test.charAt(i).equals("아"))
//		}
		System.out.println(test.contains("마"));
		System.out.println(test.contains("하"));
		test="설진호 화이팅! 공부 열심히 하세요 노트북이랑 그만 싸우고!";
		System.out.println(test.contains("공부"));
		System.out.println(test.contains("황진호"));
		
		
		//특정 문자의 위치를 찾아주는 메소드 : indexOf();
		//찾으면 문자의 인덱스를 반환, 못찾으면 -1 //인덱스니까 첫번째 칸은 0
		System.out.println(test.indexOf("공부"));	
		System.out.println(test.indexOf("노트북"));
		System.out.println(test.indexOf("황진호"));
		System.out.println(test.indexOf(" "));
		//중복값이 있을 때 두번째 값 찾기
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1)); //첫 공백 다음부터 시작해서 공백을 찾으라는 의미
		                              //찾으려는것, 어디서부터?(첫번째 공백칸 다음칸번호)
		test="ttt.file.txt";
		
		//lastIndexOf() : 시작을 뒤에서부터 찾음
		//뒤에서부터 찾지만 마지막칸이 0번인덱스는 아님, 인덱스는 그대로 첫글자부터 0
		System.out.println(test.lastIndexOf("."));
		
		//문자열을 변경해주는 메소드 : replace();
		test.replace("txt", "hwp"); //바꾸고싶은 문구,바꿀 문구 
		//원본 값이 변경되지 않음
		System.out.println(test);//그대로 ttt.file.txt
		System.out.println(test.replace("txt", "hwp"));//변경된 ttt.file.hwp
		//계속 이렇게 쓰고 싶으면 저장을 해줘야함
		String test2=test.replace("txt", "jpg");
		System.out.println(test2);
		
		//문자열 공백을 제거해주는 메소드: trim();
		test="     조        현     ";
		test.trim();//원본값 변경되지 않음
		System.out.println(test);
		System.out.println(test.trim());
		//글자와 글자 사이의 띄어쓰기는 trim으로 안 지워진다!!
		System.out.println(test.trim().replace(" ", ""));//replace로 공백을 공백 없는 문자로 변경해줌!
		
		test2="조현";
		//조현   과 조현은 공백때문에 다른값이지만 콘솔창에서는 비슷해 보인다. 많이 실수하는 부분이므로 조심!
		
		
		//문자열을 원하는 만큼 잘라내는 메소드 : substring();
		test="식사시간 저녁시간 저녁메뉴 디너타임";
		//substring(시작인덱스,끝인덱스) 시작인덱스부터 끝인덱스 전까지 시작인덱스<=글자<끝인덱스
		System.out.println(test.substring(0,4));
		//substring(인덱스) 인덱스뒤에것 부터 끝까지 
		System.out.println(test.substring(9));
		//substring() indexOf()연결하여 사용 인덱스값의 글자를 찾는 메소드&글자의 인덱스시작값을 찾아주는 메소드
		System.out.println(test.substring(test.indexOf("저녁메뉴"),test.indexOf("뉴")+1));
		
		//파일에 대한 확장자만 잘라내기
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
		
		//문자열을 특정구분자로 구분할 수 있으면 그 구분자를 기준으로 배열 만들기
		//split(구분자)
		test="유병승,조현,설진호,정로희,김다희,유다해";
		String[] names=test.split(",");
		System.out.println(names[3]);
		//문자열 -> 문자열배열 : split();
		//문자열배열 -> 문자열 : join();
		for(String v : names) {
			System.out.println(v);
		}
		String returnStr=String.join("^.~",names);//문자열들이 합쳐지니까 서로서로 구분해주는 구분자를 넣고싶다면 ()안에 ""안에 넣기
		System.out.println(returnStr);
		
		//StringBuffer : 문자열을 저장하는 객체
		//저장된 문자열을 변경하는 것이 가능!!!
		//객체->수정,삭제,삽입 - 메소드를 통해 가능
		StringBuffer sb=new StringBuffer("유병승");
		//StringBuffer를 출력하려면 
		System.out.println(sb+" : "+sb.hashCode());//toString();이 오버라이딩 되어있다. 참조형변수인데 찍었더니 문구가 나온다!
		//StringBuffer 값 수정하기
		//문자열 추가하기
		sb.append("선생님");//원본값이 수정된댜.
		System.out.println(sb+" : "+sb.hashCode());
		
		//원본값의 특정위치에 값을 넣을 수도 있음 : insert();
		sb.insert(3,"천재");
		System.out.println(sb);
		
		//특정 위치의 문자열을 삭제할 수도 있음 : delete();
		//시작하는 점<=  <끝나는 점
		sb.delete(1, 3);
		System.out.println(sb);
		
		//원하는 위치의 문자를 변경 : replace();
		//시작하는 점<=  <끝나는 점
		sb.replace(3,6,"천재");
		System.out.println(sb);
		
		String str=new String(sb);
		System.out.println(str); //중간에 수정하던 값을 String으로 저장할 필요가 있을때 이렇게 저장이 가능쓰
		
		sb=new StringBuffer(str);		
		
		//StringBuilder
		StringBuilder sbu=new StringBuilder("유병승");
		sbu.append("하하하");
		System.out.println(sbu);		
		
		stringTokenTest();
	}
	
	public static void stringTokenTest() {
		//StringTokenizer클래스 이용하기
		//문자열을 특정 구분자로 분리해내는 객체
		
		String str="java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		StringTokenizer st=new StringTokenizer(str,",_"); //(넣을 문자열, 구분자)
//		while(st.hasMoreTokens()) { //글자를 빼서 고층건물처럼 한층한층 토큰으로 넣음(한단어씩)
//									//밑에 토큰있어? 하고 물어보는 것, 있으면 하나씩 뺌
//			System.out.println(st.nextToken());//그래서 세로로 출력이 되는 것임
//		}
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
		//	if(temp.contains("c")) {
				System.out.println(temp);
		//	}
			
		}
		
		
		
		
		
		
		
		
	}

}

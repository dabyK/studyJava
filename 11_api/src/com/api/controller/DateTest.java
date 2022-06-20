package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {

		// 날짜를 활용하게 하는 클래스들!
		// Date Calendar GregorianCalendar
		Date today = new Date();// 현재 날짜와 시간
		System.out.println(today);
		today = new Date(12345678912349L);// long형 자료형 넣을 수 있음-날짜로 바꿔줌
		System.out.println(today);


		// Calendar객체 활용하기-Calendar는 abstract 이며 protected임
		// Calendar birthDay=new Calendar();
		Calendar birthDay = Calendar.getInstance();
		System.out.println(birthDay);

		// 따로 필드에 접근해서 출력해야함!:get()메소드 이용
		System.out.println("년 " + birthDay.get(Calendar.YEAR));// FINAL이라 대문자//Calendar의 YEAR변수에 접근하는 것
		System.out.println("월 " + (birthDay.get(Calendar.MONTH) + 1)); // MONTH는 0부터 시작됨 1월이 0월 - +1해줘야 우리가 아는 월이 됨
		System.out.println("일 " + birthDay.get(Calendar.DATE));
		System.out.println("시 " + birthDay.get(Calendar.HOUR_OF_DAY));// 24시표기법 12시간표기법은 그냥 HOUR
		System.out.println("분 " + birthDay.get(Calendar.MINUTE));
		System.out.println("초 " + birthDay.get(Calendar.SECOND));

		int year = birthDay.get(Calendar.YEAR);
		int month = birthDay.get(Calendar.MONTH) + 1;
		int date = birthDay.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + date + "일");

		// Date로 옮겨보자 요거를
		birthDay.getTimeInMillis(); // 현재시각을 long으로 받아오는 것
		System.out.println(new Date(birthDay.getTimeInMillis()));

		// 원하는 날짜 세팅하기!:set()메소드 이용
		birthDay.set(1993, 7 - 1, 8, 11, 35, 15);// 7이 들어가면 8월로 처리함 -1해줘야함...
		System.out.println(new Date(birthDay.getTimeInMillis()));

		// GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar(); // 현재날짜
		System.out.println(gc);// 주소값이 나옴
		// 날짜 정보를 출력하려면 get
		int year1 = gc.get(Calendar.YEAR);
		int month1 = gc.get(Calendar.MONTH) + 1;
		int date1 = gc.get(Calendar.DATE);
		System.out.println(year1 + "년 " + month1 + "월 " + date1 + "일");
		// Calendar객체에서는 지정날짜 대입할때 set대입
		gc = new GregorianCalendar(1993, (8 - 1), 28);
//		year1=gc.get(Calendar.YEAR);
//		month1=gc.get(Calendar.MONTH)+1;
//		date1=gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"년 "+month1+"월 "+date1+"일");

		printDate(gc);

		// 그레고리안캘린더는 각 필드의 값을 수정할 수 있다.
		gc.set(Calendar.YEAR, 2021);
		gc.set(1, 2020); // YEAR에 마우스를 대보면 1이라고 나옴, Calendar.YEAR대신에 1을 사용할 수 있는 것
		gc.set(Calendar.MONTH, (9 - 1));
		printDate(gc);

		// GregorianCalendar 도 Date형으로 바꿀 수 있다.
		Date birth2 = new Date(gc.getTimeInMillis());
		System.out.println(birth2);

		// 날짜를 형식에 맞게 포맷팅해주기!
		// 00년 00월 00일 형식 등으로 나오게 할 수 있다는 것 /0000년 00월 00일/00.00.00/00-00-00
		// SimpleDateFormat 객체 이용(Text패키지에 있는 클래스)
		// Date객체를 형식에 맞게 문자열로 출력해주는 객체
		// SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");//년 y 월 M 일 d
		// SimpleDateFormat sdf=new SimpleDateFormat("yy.MM.dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 E요일 a hh:mm:ss");
		// 요일 E 시hh(12) HH(24) 분mm 초ss 오전오후a
		String strDate = sdf.format(birth2);
		// Date만 가능! Calendar나 GregorianCalendar는 못 넣어 - TimeInMillis 사용하면 가능
		// Calendar랑 GregorianCalendar는 상속관계임
		strDate = sdf.format(gc.getTimeInMillis());
		System.out.println(strDate);

	}

	private static void printDate(Calendar c) {
		// 매번 바꾸기도 번거로우니 메소드로 만들어버릴 수도 있다.
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH) + 1;
		int date1 = c.get(Calendar.DATE);
		System.out.println(year1 + "년 " + month1 + "월 " + date1 + "일");
	}

}

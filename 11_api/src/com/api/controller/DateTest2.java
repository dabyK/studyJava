package com.api.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
//		Date date=new Date();
//		System.out.println(date);
//		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(cal.getTime()));
		cal.add(Calendar.DATE,7);
		System.out.println(df.format(cal.getTime()));
		String date2=df.format(cal.getTime());
		
		
		
		
//		cal.add(Calendar.DATE, 20);
//		
//
//		//date.add(Calendar.DATE, 1);
//		System.out.println(df.format(date.getTime()));
		
//		int year=date.get(Calendar.YEAR);
//		int month=date.get(Calendar.MONTH)+1;
//		int date1=date.get(Calendar.DATE);
//		String rentDate= year+"-"+month+"-"+date1;
//		System.out.println(rentDate);
//		
//		int date2=date.get(Calendar.DATE)+20;
//		
//		String backDate= year+"-"+month+"-"+date2;
//		System.out.println(backDate);
		
	}
	
	
}



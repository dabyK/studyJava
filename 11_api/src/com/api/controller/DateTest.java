package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {

		// ��¥�� Ȱ���ϰ� �ϴ� Ŭ������!
		// Date Calendar GregorianCalendar
		Date today = new Date();// ���� ��¥�� �ð�
		System.out.println(today);
		today = new Date(12345678912349L);// long�� �ڷ��� ���� �� ����-��¥�� �ٲ���
		System.out.println(today);


		// Calendar��ü Ȱ���ϱ�-Calendar�� abstract �̸� protected��
		// Calendar birthDay=new Calendar();
		Calendar birthDay = Calendar.getInstance();
		System.out.println(birthDay);

		// ���� �ʵ忡 �����ؼ� ����ؾ���!:get()�޼ҵ� �̿�
		System.out.println("�� " + birthDay.get(Calendar.YEAR));// FINAL�̶� �빮��//Calendar�� YEAR������ �����ϴ� ��
		System.out.println("�� " + (birthDay.get(Calendar.MONTH) + 1)); // MONTH�� 0���� ���۵� 1���� 0�� - +1����� �츮�� �ƴ� ���� ��
		System.out.println("�� " + birthDay.get(Calendar.DATE));
		System.out.println("�� " + birthDay.get(Calendar.HOUR_OF_DAY));// 24��ǥ��� 12�ð�ǥ����� �׳� HOUR
		System.out.println("�� " + birthDay.get(Calendar.MINUTE));
		System.out.println("�� " + birthDay.get(Calendar.SECOND));

		int year = birthDay.get(Calendar.YEAR);
		int month = birthDay.get(Calendar.MONTH) + 1;
		int date = birthDay.get(Calendar.DATE);
		System.out.println(year + "�� " + month + "�� " + date + "��");

		// Date�� �Űܺ��� ��Ÿ�
		birthDay.getTimeInMillis(); // ����ð��� long���� �޾ƿ��� ��
		System.out.println(new Date(birthDay.getTimeInMillis()));

		// ���ϴ� ��¥ �����ϱ�!:set()�޼ҵ� �̿�
		birthDay.set(1993, 7 - 1, 8, 11, 35, 15);// 7�� ���� 8���� ó���� -1�������...
		System.out.println(new Date(birthDay.getTimeInMillis()));

		// GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar(); // ���糯¥
		System.out.println(gc);// �ּҰ��� ����
		// ��¥ ������ ����Ϸ��� get
		int year1 = gc.get(Calendar.YEAR);
		int month1 = gc.get(Calendar.MONTH) + 1;
		int date1 = gc.get(Calendar.DATE);
		System.out.println(year1 + "�� " + month1 + "�� " + date1 + "��");
		// Calendar��ü������ ������¥ �����Ҷ� set����
		gc = new GregorianCalendar(1993, (8 - 1), 28);
//		year1=gc.get(Calendar.YEAR);
//		month1=gc.get(Calendar.MONTH)+1;
//		date1=gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"�� "+month1+"�� "+date1+"��");

		printDate(gc);

		// �׷�����Ķ������ �� �ʵ��� ���� ������ �� �ִ�.
		gc.set(Calendar.YEAR, 2021);
		gc.set(1, 2020); // YEAR�� ���콺�� �뺸�� 1�̶�� ����, Calendar.YEAR��ſ� 1�� ����� �� �ִ� ��
		gc.set(Calendar.MONTH, (9 - 1));
		printDate(gc);

		// GregorianCalendar �� Date������ �ٲ� �� �ִ�.
		Date birth2 = new Date(gc.getTimeInMillis());
		System.out.println(birth2);

		// ��¥�� ���Ŀ� �°� ���������ֱ�!
		// 00�� 00�� 00�� ���� ������ ������ �� �� �ִٴ� �� /0000�� 00�� 00��/00.00.00/00-00-00
		// SimpleDateFormat ��ü �̿�(Text��Ű���� �ִ� Ŭ����)
		// Date��ü�� ���Ŀ� �°� ���ڿ��� ������ִ� ��ü
		// SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd��");//�� y �� M �� d
		// SimpleDateFormat sdf=new SimpleDateFormat("yy.MM.dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yy�� MM�� dd�� E���� a hh:mm:ss");
		// ���� E ��hh(12) HH(24) ��mm ��ss ��������a
		String strDate = sdf.format(birth2);
		// Date�� ����! Calendar�� GregorianCalendar�� �� �־� - TimeInMillis ����ϸ� ����
		// Calendar�� GregorianCalendar�� ��Ӱ�����
		strDate = sdf.format(gc.getTimeInMillis());
		System.out.println(strDate);

	}

	private static void printDate(Calendar c) {
		// �Ź� �ٲٱ⵵ ���ŷο�� �޼ҵ�� �������� ���� �ִ�.
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH) + 1;
		int date1 = c.get(Calendar.DATE);
		System.out.println(year1 + "�� " + month1 + "�� " + date1 + "��");
	}

}

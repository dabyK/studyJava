package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// �ڹٿ��� ������ �ٷﺸ��
		File f = new File("test.txt");// ()�ȿ� ���ϸ��� ������� ��!

		// ���� ��ü�� ���� �� ��α��� �߰��ؼ� ������ �� ����!
		// f = new File("C:/Users/82103/test.txt");

		f = new File("test.txt");// ������ ũ�� ��� ���� f�� test.txt �־���

		// �ڹٿ��� ������ ������ �� ���� ������ �� �� ����
		// ���� ���� : mkdir(�� ���� ����� ��), mkdirs(a���� ���� b����ó�� �� ���� ���� ���� �� ���ÿ� ���� �� �ֿ�/1����
		// ���� �� ����-�׷��� �� ���� ��)
//		File dir=new File("c:\\Users\\82103\\test");
//		System.out.println(dir.mkdir());

		File dir = new File("c:\\Users\\82103\\test\\a\\b\\c");
		if (!dir.exists())// dir�� ����? ������ �� exists�� �ִ��� ã���ִ� ���
			System.out.println(dir.mkdirs());

		try {
			if (!f.exists()) {
				f.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // workspace�� ���� io������ ���� test.txt������ ����� Ȯ���� �� �ִ�! �ű��ϳ�~~

		// ������Ʈ �����ʹ�ư-refresh�ϸ� �ڹ� â���� txt������ ����� Ȯ���� �� �ִ�.

		System.out.println("������ ũ�� : " + f.length());
		System.out.println("��� Ȯ�� : " + f.getAbsolutePath());
		
		dir = new File("c:\\Users\\82103\\");
		for (String file : dir.list()) {
			System.out.println("���ϵ� Ȯ���ϱ� : " + file);
		}
		
		//���Ͽ� �����͸� �����ϱ� ���� ���� �� Stream

	}

}

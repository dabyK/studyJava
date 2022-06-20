package com.streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest {
	// ������ �������Ϸ� ���(����)�ϱ�(�ڹٿ��� �������� �����̹Ƿ� �ƿ�ǲ)
	public void outputStream(String data) { // Ư�� ���Ͽ� ������ �����ϴ� �����͸� �ű�� �� ���� �ִ� ������� ������ϱ� ���Ӽ��ְ� �����Ϸ���
		// ���� �ִ°� �ű���� Stream�� �ʿ���! ��->���� �̸� Output (��:�ڹ� / ���Ϸ� �������� �Ŵϱ�)

		// RAM -> file �̵���Ű��
		// 1. �����͸� �ű� ��ġ(file) -> File��ü ����!
		// 2. file�� Stream�� ���� -> OutputStream��ü ����! //��Ʈ�� ���� �ڵ����� �����̶� ���̶� �����
		// 3. �޼ҵ带 ���� data �����ֱ� -> write();
		// 4. OutputStream��ȯ -> close();

		File saveFile = new File("data.js"); // Ȯ���ڴ� ��� ����

		// byte���� ����� �ϴ� FileOutputStream���
		FileOutputStream fos = null;// checkedException���� �ݵ�� ����ó�� ����� ��
		try {
			fos = new FileOutputStream(saveFile);
			// Stream�� ���鼭 �Ű������� ���� ���ϰ�ü�� �����ϰ� ����
			// fos.write("123456".getBytes()); //���Ͽ� �� �Է�, String�� ����Ʈ���� �����Ͱ� �ƴϹǷ� ����Ʈȭ �������
			// �Ѵ�.

			fos.write(data.getBytes());
			// �ܺο��� ���� ���� ���� file�� ������ ���� �ִ� �̷���!(�Ű����� �ִ� �޼ҵ�� ����)

			// fos.write("function test(){alert('����');}".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();// consoleâ�� �������� ����ϴ� �޼ҵ���
				}
			}
		}

	}

	public void inputStreamTest() {
		// file�� ����� ���� �о����
		// InputStream�� ����ϰ� ��
		// 1. file�� ���� -> File ��ü
		// 2. FileInputStream�� �����ϱ�
		// 3. read()�޼ҵ�� �����͸� �о��.
		// 4. Stream�� �ݾ���

		File load = new File("data.js");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(load);

			// ������ �о�ö��� read ���
			// byte������ data�� �о���Ƿ� ��ü ������ ��������
			// data ���� ���������� �ݺ����� ����ؾ��Ѵ�.
			int value = 0;
			StringBuffer sb = new StringBuffer();
			while ((value = fis.read()) != -1) {
				// -1�� ���ذ��� file�� ���̻� �о�� �����Ͱ� ���� ��� -1�� ��ȯ�ϴ� ��=�����͸� �� ������! �� �Ǵ� ��
				// System.out.print((char)value);
				sb.append((char) value);
			}
			System.out.println(sb);
		} catch (IOException e) {// �������� ���� �����
			e.printStackTrace();

		} finally {// �ݾ��ֱ�
			if (fis != null) {// ��ü�� �����Ǵٰ� ������ ���� fis�� null�� �̹Ƿ� �ƴҶ���� ���ִ� ��
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// ���ڿ� ���� ��Ʈ��!!
	// Writer / Reader
	public void writerTest() {
		// 1. File ����
		// 2. Stream ����
		// 3. ������ ���� -> write();
		// 4. Stream��ȯ
		File f = new File("strData.bs");
		try (FileWriter fw = new FileWriter(f);) {
			String msg = "������� ���� ����Ͱ� ����� �Ф�";
			fw.write(msg);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ���Ͽ� ����� ���ڿ� ������ �ҷ�����
	public void readerTest() {
		// 1. ���� ���� -> File
		// 2. ��Ʈ�� ����-> FileReader
		// 3. ���Ϻҷ����� -> read();
		// 4. Stream��ȯ

		File f = new File("strData.bs");
		try (FileReader fr = new FileReader(f)) {
			int value = 0;//����Ʈ�� ���ڰ���! ����Ʈ�� ����ǹǷ� �ҷ��� �� �⺻�� int�� �����ϴ� ��
			String msg="";
			while ((value = fr.read()) != -1) {
				//System.out.print((char) value);
				msg+=(char)value;
			}System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	
}

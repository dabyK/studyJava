package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// client �����ϱ�
		// ���� ��û�� ������ ��Ʈ
		int port = 8888;

		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		try {
			// ������ ������ �ּҿ� ��Ʈ ������ ���� �����ϱ�
			socket = new Socket("192.168.120.27", port);

			if (socket != null) {// ���ּҿ� ������ �ִٸ� = ������ ���  �� �ּҰ� �ִ� ��ǻ�Ϳ� ��û, �����־�? �����ص���?
				//������ null ����. null �ƴϸ� ������ �ִٴ� ��
				// ���� ��Ʈ�� ����
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());

				// ������ ���� ���� �Է� ��� ����
				Scanner sc = new Scanner(System.in);
				System.out.println("��ȭ�Է�");
				do {// ������ ������ ����
					String msg = sc.nextLine();
					pw.println(msg);
					pw.flush();// ���ۺ����� �Ѿ

					if (msg.equals("exit")) {
						break;
					}
				} while (true);

				// �������� �� ������ Ȯ��
				System.out.println(br.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				br.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// client 구성하기
		// 연결 요청할 서버의 포트
		int port = 8888;

		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		try {
			// 연결할 서버의 주소와 포트 가지고 소켓 생성하기
			socket = new Socket("192.168.120.27", port);

			if (socket != null) {// 이주소에 서버가 있다면 = 소켓을 열어서  이 주소가 있는 컴퓨터에 요청, 소켓있어? 연결해도돼?
				//없으면 null 나옴. null 아니면 서버가 있다는 것
				// 연결 스트림 열기
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());

				// 서버에 보낼 문구 입력 기능 구성
				Scanner sc = new Scanner(System.in);
				System.out.println("대화입력");
				do {// 서버에 데이터 전송
					String msg = sc.nextLine();
					pw.println(msg);
					pw.flush();// 버퍼비워줘야 넘어감

					if (msg.equals("exit")) {
						break;
					}
				} while (true);

				// 서버에서 온 데이터 확인
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

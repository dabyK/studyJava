package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.omg.CORBA.portable.UnknownException;

public class UDPServer {

	public static void main(String[] args) throws UnknownHostException{
		
		//Client와 똑같고 port 번호와 28번 라인의 포트번호만 서로 바꿔준다 (서로 통신해야하니까)
		//int port의 숫자는 자신의 포트번호, packet에 적는 포트번호는 보낼 곳의 포트번호임
		//UDP는 포트를 기준으로 서로 왔다갔다 한다! 그래서 서로 포트번호를 적어주는 것임
		//던지고 받는 구조~ 포트가 전화번호인셈
		int port = 8888;

		InetAddress address = InetAddress.getLocalHost();
		DatagramSocket socket = null;
		Scanner sc = new Scanner(System.in);

		try {

			socket = new DatagramSocket(port);
			System.out.print("전송할 데이터 입력 :");
			String msg = sc.nextLine();
			DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 9999);// 보낼데이터,데이터길이,원격기주소,원격기주소의 포트번호
			// 패킷은 일종의 박스
			socket.send(packet);

			// 데이터 받기
			byte[] data = new byte[512];
			packet = new DatagramPacket(data, data.length); // 데이터, 데이터길이
			socket.receive(packet);

			System.out.println(new String(packet.getData()));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}

	}

}

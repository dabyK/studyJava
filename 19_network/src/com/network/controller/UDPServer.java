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
		
		//Client�� �Ȱ��� port ��ȣ�� 28�� ������ ��Ʈ��ȣ�� ���� �ٲ��ش� (���� ����ؾ��ϴϱ�)
		//int port�� ���ڴ� �ڽ��� ��Ʈ��ȣ, packet�� ���� ��Ʈ��ȣ�� ���� ���� ��Ʈ��ȣ��
		//UDP�� ��Ʈ�� �������� ���� �Դٰ��� �Ѵ�! �׷��� ���� ��Ʈ��ȣ�� �����ִ� ����
		//������ �޴� ����~ ��Ʈ�� ��ȭ��ȣ�μ�
		int port = 8888;

		InetAddress address = InetAddress.getLocalHost();
		DatagramSocket socket = null;
		Scanner sc = new Scanner(System.in);

		try {

			socket = new DatagramSocket(port);
			System.out.print("������ ������ �Է� :");
			String msg = sc.nextLine();
			DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 9999);// ����������,�����ͱ���,���ݱ��ּ�,���ݱ��ּ��� ��Ʈ��ȣ
			// ��Ŷ�� ������ �ڽ�
			socket.send(packet);

			// ������ �ޱ�
			byte[] data = new byte[512];
			packet = new DatagramPacket(data, data.length); // ������, �����ͱ���
			socket.receive(packet);

			System.out.println(new String(packet.getData()));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}

	}

}

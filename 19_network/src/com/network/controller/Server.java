package com.network.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException{
		// ���� �����ϱ�
		//������ �����Ѵ�.
		//1.port��ȣ�� �����ϱ�
		int port=8888;//0~65535���� ��κ� ��Ʈ�� �������ִ� ��찡 ����.
		
		//2.ServerSocket�����ϱ�
		ServerSocket server=new ServerSocket(port);
		
		//3. server���� �����ϱ�
		
		while(true) {//��� ���ư�����-���ѹݺ�
			//3-1 client ��û���
			Socket client=server.accept();
			
			//����� ������ �̿��Ͽ� ��Ʈ�� ����
			InputStream clientInput=client.getInputStream(); //Ŭ���̾�Ʈ�� ������ �ޱ�
			OutputStream clientOutput=client.getOutputStream(); //������ Ŭ���̾�Ʈ���� ������
			
			//��������� ���� ������Ʈ�� ����ϱ� //����Ʈ������ ������ �����ɸ��ϱ� (���ڿ� �����Ŵϱ�) ������Ʈ�� ���
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput)); //��Ʈ�� - ���ڿ�ȭ - �����Է½�Ʈ���� ����
			PrintWriter pw=new PrintWriter(clientOutput); 
			
			//Ŭ���̾�Ʈ�� ���� ������ �ޱ�
			while(true) {
				//������� �� �ȸ� �츮�� �����ϴ� �� ���� �׳� �ڵ����� ġ�°��μ�
				String msg=br.readLine();//������� ���� ����
				
				if(!msg.equals("exit")) { 
					System.out.println(client.getInetAddress().getHostAddress()+" : "+msg);//������ �ּ�
					pw.println("���� �޼��� ���ż���!"); //�� �߹޾Ҵٰ� �������ִ� ��
					pw.flush();//���� ����
				}else {
					System.out.println("��������");
					break;
				}
			}
			//���� ��Ʈ���� �ݱ�
			br.close();
			pw.close();
			client.close();
			
			
		}
		
		
		

	}

}

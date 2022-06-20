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
		// 서버 생성하기
		//절차가 존재한다.
		//1.port번호를 선정하기
		int port=8888;//0~65535까진 대부분 포트가 정해져있는 경우가 많다.
		
		//2.ServerSocket생성하기
		ServerSocket server=new ServerSocket(port);
		
		//3. server동작 구성하기
		
		while(true) {//계속 돌아가야함-무한반복
			//3-1 client 요청대기
			Socket client=server.accept();
			
			//연결된 소켓을 이용하여 스트림 열기
			InputStream clientInput=client.getInputStream(); //클라이언트가 보낸거 받기
			OutputStream clientOutput=client.getOutputStream(); //내꺼를 클라이언트한테 보내기
			
			//성능향상을 위해 보조스트림 사용하기 //바이트단위로 보내면 오래걸리니까 (문자열 보낼거니까) 보조스트림 고고
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput)); //스트림 - 문자열화 - 문자입력스트림의 로직
			PrintWriter pw=new PrintWriter(clientOutput); 
			
			//클라이언트가 보낸 데이터 받기
			while(true) {
				//여기부터 이 안만 우리가 구성하는 것 위는 그냥 자동으로 치는것인셈
				String msg=br.readLine();//리드라인 쓰는 법임
				
				if(!msg.equals("exit")) { 
					System.out.println(client.getInetAddress().getHostAddress()+" : "+msg);//보내는 주소
					pw.println("보낸 메세지 수신성공!"); //나 잘받았다고 응답해주는 거
					pw.flush();//버퍼 비우기
				}else {
					System.out.println("접속종료");
					break;
				}
			}
			//열린 스트림들 닫기
			br.close();
			pw.close();
			client.close();
			
			
		}
		
		
		

	}

}

package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetwork {

	public static void main(String[] args) throws UnknownHostException{
		
		//InetAddress이용해보자!
		InetAddress localIp=InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());//내아이피주소
		System.out.println(localIp.getHostName());//내컴퓨터이름
		
		InetAddress naver=InetAddress.getByName("www.naver.com");//네이버의 아이피주소
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		
		
	}

}

package com.oop.main;

import com.oop.model.vo.Client;
import com.oop.model.vo.Practice1;
import com.oop.model.vo.Practice2;

public class Run {
	
	public static void main(String[] args) {
		//Practice1 pp=new Practice1();
		
		Practice1 p11=new Practice1("�����","aa","a1",28);
		Practice1 p12=new Practice1("������","bb","b1",29);
		Practice1 p13=new Practice1("��ö��","cc","c1",27);
		System.out.println(p11.getName()+" "+p11.getId()+" "
					+p11.getPw()+" "+p11.getAge());
		System.out.println(p12.getName()+" "+p12.getId()+" "
				+p12.getPw()+" "+p12.getAge());
		System.out.println(p13.getName()+" "+p13.getId()+" "
				+p13.getPw()+" "+p13.getAge());
			
		
		//�ι�° ����	
		Practice2 p21=new Practice2("��������","����","���",0);
		Practice2 p22=new Practice2("����","���","��ȸ���̻�",10);
		Practice2 p23=new Practice2("�����û","��޺���","��ȸ����",5);
		System.out.println(p21.getName()+" "+p21.getType()+" "
				+p21.getMembertype()+" "+p21.getPoint());
		System.out.println(p22.getName()+" "+p22.getType()+" "
				+p22.getMembertype()+" "+p22.getPoint());
		System.out.println(p23.getName()+" "+p23.getType()+" "
				+p23.getMembertype()+" "+p23.getPoint());
	
	
	
		//ù���� ���� Ǫ�� ��
		//ȸ�� ������ ������ �����ϴ� ��ü�� ����� ������ ����ض�
		Client c=new Client();
		c.setId("user01");
		c.setPw("1234");
		c.setEmail("qwe@cnkd.com");
		c.setPoint(10000);
		Client c1=new Client("user02","4567","uwewe@dskd.com");
		Client c2=new Client("user02","4567","uwewe@dskd.com",10.5);
		System.out.println(c.getId()+" "+c.getPw()+" "+c.getEmail()+" "+c.getPoint());
	}
}

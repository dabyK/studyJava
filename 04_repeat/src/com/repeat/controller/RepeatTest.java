package com.repeat.controller;

import java.util.Scanner;
import java.util.*;

public class RepeatTest {

	Scanner sc=new Scanner(System.in);
	public void basicrepeat() {
		//�⺻ for�� �ۼ��ϱ�
		//�ȳ��ϼ��� 10�� �ݺ�����ϱ�
		for(int i=0;i<10;i++) {
			System.out.print(i);
			System.out.println(" �ȳ��ϼ���!");
		}//0���� 9���� ���ڸ� Ű������ �ݺ���
		
		//1���� 100���� �� ����ϱ�
		for(int i=0;i<100;i++) {
			System.out.println(i+1);
		}/*���� System.out.println(i++);�� �����Ű�� 
		  for�������� ++,���๮������ ++�� �Ͼ i�� ��ü�� �ٲ�� ������
		  0,2,4,6...�� ������ ��µȴ�. */
		
		//100���� 1���� ����ϱ�
		for(int i=100;i>0;i--) {
			System.out.println(i);
		}//���� Ǭ��
		
		/*int su=100;
		for(int i=0;i<100;i++) {
			System.out.println(su--);
		}���� Ǭ�� (�̷��Ե� ����!)*/
		
		//1���� 100���� Ȧ�� �������
		for(int i=0;i<100;i++) {
			System.out.println(i+1);
			i++;
		}
		
		/*int su1=1;
		for(int i=0;i<50;i++) {
			System.out.println(su1+=2);
		}���2*/
		
		/*for(int i=0;i<100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}���3*/
		
		/*for(int i=0;i<100;i+=2) {
			System.out.println(i);
		}���4*/
		
		//1���� 100������ ��ü ���� ���ϼ���
		int sum=0;
		for(int i=1;i<=100;i++) {
				sum+=i;//sum=sum+i
		}System.out.println(sum);
		
		//1���� 100���� ¦���� ���� ���ض�
		int sum1=0;
		for(int i=0;i<=100;i+=2) { //i=i+2
			sum1+=i;//sum1=sum1+i
		}System.out.println(sum1);
		
		/* int sum3=0;
		 for(int i=1;i<=100;i++){
			 if(i%2==0){
				 sum3+=i;
			 	}//if��ȣ
		 }//for��ȣ
		 System.out.println(sum3);
		 ���� �� ��*/
		 
		 //����ڰ� �Է��� ����ŭ ���� �ݺ��ϱ�
		 System.out.print("���� �Է� : ");
		 int su1=sc.nextInt();
		 for(int i=0;i<su1;i++) {//������ 0���� �����ϱ� <�� ����� �ϴ°�!****
			 System.out.println("�ȳ�");
		 }
		 
		 //���� ���� �Է¹ް� ������ �հ� ����ϱ�
		 //�հ�� �ѹ��� ���
		 int total=0; 
		 for(int i=0;i<3;i++) {
		 System.out.print("���� �Է� : ");
		 int a=sc.nextInt(); //a�� �Է¹��� ����
		 total+=a;//total=total+a
		 		  //�հ躯��=������ �հ躯�� ��+�Է¹��� ������ �����
		 }System.out.println("�հ� : "+total);
			 
		 /*int total=0; 
		 for(int i=0;i<3;i++) {         //���� 3�� �ݺ�
		 System.out.print("���� �Է� : ");  
		 total+=sc.nextInt();		
		 }System.out.println("�հ� : "+total);*/
	
		 
		 //for���� �ٸ� ����
		 //for(�ʱ��;���ǽ�;������){����}
		/* for(;;) { //���� ����! ���Ѵ�� �ݺ���
			 System.out.println("=== �޴��� ===");
			 System.out.println("1. ĳ���");
			 System.out.println("2. ��â");
			 System.out.println("3. �۷ι���");
			 System.out.println("0. ���α׷� ����");
			 System.out.print("�Է� : ");
			 int choice=sc.nextInt();
			 switch(choice) {
			 	case 1: System.out.println("��� ĳ���");break;
			 	case 2: System.out.println("��â�� ���ֿ�!");break;
			 	case 3: System.out.println("�۷ι���..?");break;
			 	case 0: System.out.println("���α׷��� �����մϴ�.");return;
			 }
		 }*/
		 
		 //for���� ���ǽ��� ����??
		 for(int i=0;;i++) {//���ѷ���(���ǽ�= for���� �����ų�� �ִ� ����!)
			 System.out.println(i);
			 if(i==1000) {
				 break; //�߰�ȣ�� �ִ� �� �����Ű�� ����!
			 }
		 }
		 //�ʱ���� ���� 
		 int a=0;
		 for(;a<10;a++) {
			 System.out.println(a);
		 }
		 //���ǽĸ� ������
		 for(;a<20;) {
			 System.out.println(a);//a���� ���� ���� ���ѹݺ�
			 					   //a++�� ������ 20���� �����Ǹ� �ݺ�
		 }
		 
		 //�ʱ��, ������, �������� ����/�����ų �� �ִ�.
		 for(int i=0,j=10;i<10;i++,j+=20) {
			 System.out.println(i+" "+j);
		 }
		 
		 
		
	}//�޼ҵ�
	
	//�л����� �Է¹ް�,
	//�л��� ����, ����, ���� ������ �Է¹ް�,
	//�� �հ�� ��� ���ϴ� ���α׷�
	//������ 100 100 100 �հ� 300 ��� 100 
	//�� �� 90 90 90 �հ� 270 ��� 90
	public void studentGrade() {
		System.out.print("�л� ����?");
		int su=sc.nextInt();		
		String aa="";
		sc.nextLine();
		
		for(int i=0;i<su;i++) {
		System.out.print("�л��� �̸���?");
		String name=sc.nextLine();
		System.out.print("���� ������?");
		int eng=sc.nextInt(); 
		System.out.print("���� ������?");
		int math=sc.nextInt();
		System.out.print("���� ������?");
		int kr=sc.nextInt();
		sc.nextLine();
		int total=eng+math+kr;
		double avg=(total/3.0);		
		System.out.println(name+" "+eng+" "+math+" "+kr+" �հ� : "+total+" ��� : "+avg);
		aa+=name+" "+eng+" "+math+" "+kr+" �հ� : "+total+" ��� : "+avg+"\n";
		} System.out.println(aa);
	}
	
	public void whileTest() {
		//while��
		/*���� �� ���� �� ���� ����ϱ�*/
		int i=0;//�ʱ��
		while(i<3) {//���ǽ�
			System.out.println("���� �� ���� ��");
			i++;//������
		}
		
		//1~30 ����ϱ�
		int a=0;
		while(a<30) {
			System.out.println(a+1);
			a++;
		}
		
		//�Է��ϴ� 3���� ���ڿ��� �ѹ��� ����ϴ� ���α׷�
		int b=0;
		String bb="";
		while(b<3) {
			System.out.print("���ڿ� �Է�: ");
			bb+=sc.nextLine()+"\n";
			b++;
		}System.out.println(bb);
		
		
		//do ~ while��
		// do{���� ����}while(���ǽ�);
		do { 
			System.out.println("do while��!");	
			b++;
		}while(b<3);//b<3�� false����! do~while���� ���ǽ��� Ʋ���� 
					//�ѹ��� ������ ������!!
		
		while(b<3) {
			System.out.println("while��!");
		}//while�� ���ǽ��� false�� ����X �ο��ϰ��� ����
		
		do { 
			System.out.println("do while��!");	
			b++;
		}while(b<5);
		
		//while���� ���ѷ���(���� �ϰ� �Ѿ��)
		/*Set<String> test=new HashSet();
		test.add("�ϳ�");
		test.add("��");
		test.add("��");
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		
	}
	
}//Ŭ����

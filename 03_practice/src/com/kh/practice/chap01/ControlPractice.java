package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("�Է� �޴��Դϴ�."); break;
		case 2: System.out.println("���� �޴��Դϴ�."); break;
		case 3: System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4: System.out.println("���� �޴��Դϴ�."); break;
		case 7: System.out.println("���� �޴��Դϴ�."); break;
		default : System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		}
	}
	public void practice2() {
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num=sc.nextInt();
		if(num>0&&num%2==0) {
			System.out.println("¦����.");
		}else if(num>0&&num%2==1) {
			System.out.println("Ȧ����.");
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	public void practice3() {
		System.out.print("�������� : ");
		int num1=sc.nextInt();
		System.out.print("�������� : ");
		int num2=sc.nextInt();
		System.out.print("�������� : ");
		int num3=sc.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		
		if(num1>=40&&num2>=40&&num3>=40&&avg>=60) {
			System.out.println("�������� : "+num1);
			System.out.println("�������� : "+num2);
			System.out.println("�������� : "+num3);
			System.out.println("�հ� : "+total);
			System.out.println("��� : "+avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	public void practice4() {
		System.out.print("1~12 ������ ���� �Է� : ");
		int month=sc.nextInt();
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month+"���� �ܿ��Դϴ�."); break;
		case 3: case 4: case 5:
			System.out.println(month+"���� ���Դϴ�."); break;
		case 6: case 7: case 8:
			System.out.println(month+"���� �����Դϴ�."); break;
		case 9: case 10: case 11:
			System.out.println(month+"���� �����Դϴ�."); break;
		default : System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	public void practice5() {
		String id="myId";
		String pw="myPassword12";
		
		System.out.print("���̵� : ");
		String id1=sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw1=sc.nextLine();
		if(id1.equals(id)&&pw1.equals(pw)) {
			System.out.println("�α��� ����");			
		}else if(id1.equals(id)&&!pw1.equals(pw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
		
	}
	public void practice6() {
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str=sc.nextLine();
		switch(str) {
		case "������": System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		break;
		case "ȸ��": System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		break;
		case "��ȸ��": System.out.println("�Խñ� ��ȸ");
		break;
		default : System.out.println("�´� ����� �Է��ϼ���.");
			
		}
		
		
	}
	public void practice7() {
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height=sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight=sc.nextDouble();
		double bmi=weight/(height*height);
		System.out.println("BMI ���� : "+bmi);
		if(bmi<18.5) {
			System.out.println("��ü��");
		}else if(bmi<23) {
			System.out.println("����ü��");
		}else if(bmi<25) {
			System.out.println("��ü��");
		}else if(bmi<30) {
			System.out.println("��");
		}else {
			System.out.println("�� ��");
		}
		
		
	}
	public void practice8() {
		System.out.print("�ǿ�����1 �Է� : ");
		int n1=sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int n2=sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String str=sc.next();
		switch(str) {
		case "+": 
			System.out.println(n1+str+n2+"="+(n1+n2)); break;
		case "-": 
			System.out.println(n1+str+n2+"="+(n1-n2)); break;
		case "*": 
			System.out.println(n1+str+n2+"="+(n1*n2)); break;
		case "/": 
			System.out.println(n1+str+n2+"="+((double)n1/n2)); break;
			/* ����ó�� �ϰ������ �̸� double result=0; ������ �ڿ�
			      ����ġ ���̽� �Ŀ��� result=n1/n2; �ϰ� 
			   System.out.prinf(.."%.6f"...�� �ؼ� ����ϸ� 3.750000���� ����*/
		case "%": 
			System.out.println(n1+str+n2+"="+(n1%n2)); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
	}
	public void practice9() {
		System.out.print("�߰���� ���� : ");
		int n1=sc.nextInt();
		System.out.print("�⸻��� ���� : ");
		int n2=sc.nextInt();
		System.out.print("���� ���� : ");
		int n3=sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		int n4=sc.nextInt();
		double n11=n1*0.2;
		double n22=n2*0.3;
		double n33=n3*0.3;
		double n44=n4*5*0.2;
		double total=n11+n22+n33+n44;
		System.out.println("======== ��� =======");
		System.out.println("�߰� ��� ����(20) : "+n11);
		System.out.println("�⸻ ��� ����(30) : "+n22);
		System.out.println("���� ����(30) : "+n33);
		System.out.println("�⼮ ����(20) : "+n44);
		System.out.println("���� : "+total);
		if(n4<14) {
			System.out.println("Fail [�⼮ ȸ�� ���� ("+n4+"/20)]");			
		}else if(total<70) {
			System.out.println("Fail [���� �̴�]");
		}
		else {System.out.println("Pass");
		}
	}
	public void practice10() {
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1.�޴� ���");
		System.out.println("2.¦��/Ȧ��");
		System.out.println("3.�հ�/���հ�");
		System.out.println("4.����");
		System.out.println("5.�α���");
		System.out.println("6.���� Ȯ��");
		System.out.println("7.BMI");
		System.out.println("8.����");
		System.out.println("9.P/F");
		System.out.print("����(����) : ");
		int num=sc.nextInt();
		switch(num) {
		case 1 : new ControlPractice().practice1(); break;
		case 2 : new ControlPractice().practice2(); break;
		case 3 : new ControlPractice().practice3(); break;
		case 4 : new ControlPractice().practice4(); break;
		case 5 : new ControlPractice().practice5(); break;
		case 6 : new ControlPractice().practice6(); break;
		case 7 : new ControlPractice().practice7(); break;
		case 8 : new ControlPractice().practice8(); break;
		case 9 : new ControlPractice().practice9(); break;
		default : System.out.println("�˸��� ��ȣ�� �����ϼ���.");
		}//����ġ
	}//�޼ҵ�
	
	
}//Ŭ����

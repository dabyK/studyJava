package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;

//��������� Ŭ����
//�޼ҵ� �ټ� ����
public class Functional {

	// ���ϱ� ���� �����
	// 1. �Ű������� ���� ��ȯ���� ���� ���� �޼ҵ�
	// void=��ȯ���� ���ٴ� ��
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� ���α׷�=====");
		System.out.print("���� : ");
		int su = sc.nextInt();
		System.out.print("���� : ");
		int su2 = sc.nextInt();
		System.out.println(su+"+"+su2+"="+(su+su2));		
	}
	
	// 2. ��ȯ���� ���� �Ű������� �ִ� �޼ҵ�� �����ϱ�
	//����ϴ� ��� ���� ���׿��� �ΰ� ���� ����
	//�����ڵ� �Ű������� ������ ����, �ʿ��� ������ �ܺο��� ������! �̰� �Ű�����
	public void calculator2(int su,int su2,String[] operation) {
		System.out.println("=====���� ���α׷�=====");
		System.out.println("���� : "+su);//su�� su2�� ������ ���߿� �Էµɰž�
		System.out.println("���� : "+su2);//���ο����� �޼ҵ� ȣ���Ҷ� �Ű������� �Է��Ͽ� �Ҵ�
		double result=0;
		for(String op : operation) {
			//������ �迭�� ���⶧���� for each���� ���� �迭 ���� �޾ƿ����� ���� ��
			switch(op) {
			case "+": result=su+su2;break;
			case "-": result=su-su2;break;
			case "*": result=su*su2;break;
			case "/": result=(double)su/su2;break;
			}		
		System.out.println(su+op+su2+"="+(result));
		}				
	}
	
	// 3. ��ȯ���� �ְ� �Ű������� ���� �޼ҵ� ����
	//�ΰ��� ���� ���ϰ� �� ����� ��ȯ�ϴ� ���
	public int calculator3() { //��ȯ�Ǵ°��� �ڷ����� ���������
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� ���α׷�=====");
		System.out.print("���� : ");
		int su = sc.nextInt();
		System.out.print("���� : ");
		int su2 = sc.nextInt();
		return su+su2;//��ȯ���� �����Ƿ� return�� ���� ��ȯ���� ��������� ��
		//�� �޼ҵ忡�� return���� �� �Ѱ��� ���� ���� �� �ִ�. ,��� �ٸ� �� �Է��� �� ����
		//int �� ���� ���� �����ϴ� ���̱� ������ ->������ �ϰ� ������ �迭�̳� ��ü�� �ڷ������� �̿�
		//return�� �� �Ѱ��� �ڷ����� ���� �� �ִ�.
		
	}
	
	// 4. ��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ� ����
	//�ΰ��� ���� ���ϰ� ����� ��ȯ�ϴ� ���
	public int calculrator4(int su, int su2) {		
		return su+su2;
	}
	
	// p1. ���ڿ� �ΰ� ���޹ް� �� ���� �����ϰ� �������ִ� �޼ҵ�
	public String p1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String t1=sc.nextLine();
		System.out.print("���� : ");
		String t2=sc.nextLine();
		return t1+t2;		
	}
	
	// p2. ���� �ΰ� �ް� �μ� ���� ���� �������ִ� �޼ҵ�, ù��° ���� �� ������� ���� ���
	public int p2(int su,int su2) {
		int count=0;
			if(su<su2) {
				System.out.println("����");			
			}else {
				for(int i=su2;i<=su;i++) {
					count+=i;
			}				
		} return count;
	}
		
		//String���� ���ϰ� �޴� ��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� : ");
//		int su = sc.nextInt();
//		System.out.print("���� : ");
//		int su2 = sc.nextInt();
//		int result=su+su2;
//		if(su>su2) {
//		return ""+result;
//		}else {
//		return "��� ����";
//		}
	//���ϰ��� �޴� ���-1.int 2.String 3.��ü
	
		
	// p3. ���� �Ѱ��� ���޹޾� ���������� Ȯ���� ����� �������ִ� �޼ҵ�(true,false)
//	public String p3() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� : ");
//		char t1=sc.next().charAt(0);
//		//a�� char(97) z�� char(122)
//		int a=(int) t1;
//		if(a>96&&a<123) {
//			return "true";
//		}else {
//			return "false";
//		}
//		
//		
//	}
	public boolean p3(char check) {
		return ('a'<=check&&check<='z')
				||('A'<=check&&check<='Z');
	}
	
	//�迭�� �Ű������� �޴� �޼ҵ� ����
	public void updateArray(int[] nums) {
		//�迭 �Է¹޴� ������ �ʱ�ȭ�ϱ�
		Scanner sc=new Scanner(System.in);
		System.out.println("===�迭 �����ϱ�===");
		for(int i=0;i<nums.length;i++) {
			System.out.print("������ : ");
			nums[i]=sc.nextInt();		
		}
	}
	
	//�⺻�ڷ����� �Ű������� �ް� �����ϱ�
//	public void basicUpdate(int su) {
//		su=200;
//	}
	public int basicUpdate() {
		return 200;
	}
	
	//student��ü ����� �̸�,�г�,��,��ȣ,Ű,������ �⺻���� ���� ����
	//studentUpdate�޼ҵ� ����� �Է¹��� ������ ������ �� ����ϱ�
	//->��ü�� �޾Ƽ� �� ���� ���� �����ϴ� �޼ҵ���
	
	//1. ù��° ���
	public void studentUpdate(Student st) {//Student st�� ���� �����϶�� �ǹ̷�
											//��ȣ�� ���� ��
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== �л��������� ====");
		System.out.print("�̸� :");
		String name=sc.nextLine();
		System.out.print("�г� :");
		int a=sc.nextInt();
		System.out.print("�� :");
		int b=sc.nextInt();
		System.out.print("��ȣ :");
		int num=sc.nextInt();
		System.out.print("Ű :");
		double he=sc.nextDouble();
		System.out.print("������ :");
		double we=sc.nextDouble();
	
		//���޵� �Ű����� ���� ����
		//������ �Է¹��� �Ű����� ������ student��ü�� ������� ������ �־���
		st.setName(name);
		st.setA(a);
		st.setB(b);
		st.setNum(num);
		st.setHe(he);
		st.setWe(we);
		
	}//student Ŭ������ ��ü�� �Ǵ� Ŭ������, main�� ������ �Ǵ� Ŭ�����ϱ�
	//����� �������� ���� �� �ٸ� Ŭ������ �ۼ��ϴ� �� main���� �� ����� �ҷ��;��ϴϱ�
	
	//2. ��ȯ�� �ִ� �Ű����� ���� �޼ҵ�
	public Student studentUpdate() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== �л��������� ====");
		System.out.print("�̸� :");
		String name=sc.nextLine();
		System.out.print("�г� :");
		int a=sc.nextInt();
		System.out.print("�� :");
		int b=sc.nextInt();
		System.out.print("��ȣ :");
		int num=sc.nextInt();
		System.out.print("Ű :");
		double he=sc.nextDouble();
		System.out.print("������ :");
		double we=sc.nextDouble();
		Student st=new Student(name,a,b,num,he,we);
		return st;
		//��ȯ���� ��ü�ϱ� ���ϰ��� ��ü��
	}
	
	public String clientUpdate() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸� :");
		String name=sc.nextLine();
		System.out.print("���� :");
		int age=sc.nextInt();
		System.out.print("��ȭ��ȣ :");
		int phone=sc.nextInt();
		String re="�̸�:"+name+" ����:"+age+" ��ȭ��ȣ:"+phone;
		return re;
		
	}
	
	public void clientUpdate2(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵� : ");
		String id=sc.nextLine();
		System.out.print("��� : ");
		String pw=sc.nextLine();
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�̸��� : ");
		String email=sc.nextLine();
		System.out.print("�ּ� : ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setAddress(address);
		
		
	}
	
	
}



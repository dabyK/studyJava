package com.oop.method;

//������ ������ Ŭ����
public class Student {

	//student��ü ����� �̸�,�г�,��,��ȣ,Ű,������ �⺻���� ���� ����
		//studentUpdate�޼ҵ� ����� �Է¹��� ������ ������ �� ����ϱ�
		private String name;
		private int a;
		private int b;
		private int num;
		private double he;
		private double we;
		
		public Student() {}
		
		public Student(String name,int a,int b,int num,
						double he,double we) {
			this.name=name;
			this.a=a;
			this.b=b;
			this.num=num;
			this.he=he;
			this.we=we;				
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setA(int a) {
			this.a=a;
		}
		public int getA() {
			return a;
		}
		public void setB(int b) {
			this.b=b;
		}
		public int getB() {
			return b;
		}
		public void setNum(int num) {
			this.num=num;
		}
		public int getNum() {
			return num;
		}
		public void setHe(double he) {
			this.he=he;
		}
		public double getHe() {
			return he;
		}
		public void setWe(double we) {
			this.we=we;
		}
		public double getWe() {
			return we;
		}

	
	
}

package com.oop.method;

//데이터 보관용 클래스
public class Student {

	//student객체 만들고 이름,학년,반,번호,키,몸무게 기본으로 정보 세팅
		//studentUpdate메소드 만들어 입력받은 값으로 수정한 뒤 출력하기
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

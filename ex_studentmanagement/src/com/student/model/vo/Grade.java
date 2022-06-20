package com.student.model.vo;

public class Grade {
	
	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	public Grade() {}
	
	public Grade(int kor,int eng,int math,int coding) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.coding=coding;
		
	}

	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getrMath() {
		return math;
	}
	public void setCoding(int coding) {
		this.coding=coding;
	}
	public int getrCoding() {
		return coding;
	}
	
	public String printGrade() {
		return " 국어 : "+kor+" 영어 : "+eng+" 수학 : "+math+" 코딩 : "+coding
		+" 합계 : "+(kor+eng+math+coding)+" 평균 : "+(kor+eng+math+coding)/4.0;
	}
	
	
}

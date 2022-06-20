package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDB {
	// 데이터를 저장하는 역할을 하는 객체
	// 입력된 데이터를 관리하는 역할
//	private Student s; // 스튜던트 s 객체가 지역변수라 메소드 끝나면 사라짐. 힙영역에 저장하려고 변수선언
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
//	private Student s5;

	private Student[] students = new Student[6];// 이 한줄로 가능해짐

	// 1. 전달받은 데이터를 멤버변수에 저장하여 관리하기
	// 매개변수=파라미터
	public boolean saveStudent(Student s) {
		// 전달받은 Student s를 멤버저장공간 중 빈곳에 저장
		// 그리고 잘 저장됐는지 boolean값으로 받아주는 로직
		boolean result = true;
//		if(this.s ==null)  this.s=s;
//		else if(this.s1==null) this.s1=s;
//		else if(this.s2==null) this.s2=s;
//		else if(this.s3==null) this.s3=s;
//		else if(this.s4==null) this.s4=s;
//		else if(this.s5==null) this.s5=s;
//		else { 
//				//System.out.println("더이상 저장할 공간이 없습니다.");}
//				result=false;}
		int count = 0;
		for (int i = 0; i < students.length; i++, count++) {
			if (students[i] == null) {
				students[i] = s;
				break;
			}

		}
		if (count == students.length) {
			result = false;
		}
		return result;
	}

	// 전달받은 이름으로 검색해서 결과 반환하기
	public Student searchName(String name) { // 왜 리턴을 객체로 받냐면, 이름을 검색했을 때
												// 객체에 있는 이름과 나머지 정보들도 불러오기 위해서
												// 이름만 필요하다면 getName()으로 부를 수 있으니까
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				return students[i];
			}
		}
		return null;
//		if (s.getName().equals(name))
//			return s;
//		else if (s1.getName().equals(name))
//			return s1;
//		else if (s2.getName().equals(name))
//			return s2;
//		else if (s3.getName().equals(name))
//			return s3;
//		else if (s4.getName().equals(name))
//			return s4;
//		else if (s5.getName().equals(name))
//			return s5;
//		else
//			return null;// 없을 때
	}

	// 전제조회하기!
	public Student[] searchAll() { // Student[]는 객체배열의 자료형임
		return students;
	}

	// 학년으로 조회하기
	public Student[] searchG(int gr) {
		Student[] studentgr=new Student[6];		
		
		int j=0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null&&students[i].getGrade() == gr) {
				studentgr[j]=students[i];
				j++;
			}
		}
		if(j==0) {
			return null;
		}
		return studentgr;

	}

}

package com.student.controller;

import com.student.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentManager {
	private StudentDB db = new StudentDB();
	// 데이터베이스에서 값을 불러올 때, new를 통해 생성하게 되는데 그러면
	// 필요할 때마다 새 객체를 불러오게 되고, 그러면 값이 저장된 객체와 값을 불러오려는 객체가
	// 각각 생성되어 다른 영역이 된다. 그러면 비교할 수 없음 저장된 객체와 불러온 객체는 다른 개체니까
	// 그래서 변수로서 생성해주는 과정이 필요-동일한 객체에 입력/수정/출력 할 수 있도록

	// 서비스별 학생등록, 시작화면 출력, 데이터 저장 등 기능 통제
	public void mainView() {
		// 시작화면으로 연결해주는 기능
		new MainView().mainMenu(this);// 나 자신의 주소! 클래스 객체의 주소..?
		// 이게 메인뷰에 넘어가서 메인메뉴 메소드에 들어감
	}

	// 학생 등록 서비스
	public void enrollStudent() {
		// Student객체를 만들어서 저장
		// Student에 들어갈 각 정보를 입력 -> client가 입력 -> 화면을 보여줘야함 ->MainView
		Student s = new MainView().enrollStudent();
		System.out.println(s.information());

		// 입력받은 데이터를 저장소에 저장
		boolean result = db.saveStudent(s);// DB에 저장하기
		System.out.println(result);
		// 알람 메시지 띄우기
		new MainView().printMsg(result ? "입력성공" : "입력실패");
	}

	// 이름으로 조회 서비스 구현
	public void searchName() {
		// 이름으로 조회
		String name = new MainView().inputName();
		Student s = db.searchName(name);
		if (s == null) {
			new MainView().printMsg("조회결과가 없습니다!");
		} else {
			System.out.println("조회결과 : " + s.information());
		}

	}

	// 전체 학생 조회 서비스 구현
	public void searchAll() {
		Student[] students = db.searchAll();
		new MainView().printStudents(students);
	}

	// 성적 등록 서비스 구현
	public void inputGrade() {
		// 성적을 등록하는 기능
		// 한명 학생을 선택하여 성적을 입력하는 서비스
		searchAll(); // 전체회원 조회!
		String name = new MainView().inputName();
		Student s = db.searchName(name); //name이 db에 있는 이름인지 찾아주고 있으면 리턴하는 메소드
		                        		//있으면 그 이름과 다른 정보들이 s 객체로 들어감
		if (s != null) {// 찾은 학생이 있음(null이 아님) - 성적등록화면으로 이동
			Grade g = new MainView().inputGrade();//성적을 입력받아 grade 객체에 저장하는 메소드
					//입력받아야 하니까 mainview에서 구현	//(성적을 저장하기 위한grade객체를 만들어놨으니까)
							//성적이 저장된 객체를 g로 설정
			s.setGradePoint(g);//받은 내용을 student 객체의 성적에 입력하는 기능
			System.out.println("성적 입력 성공!");
			System.out.println("성적 : "+s.getGradePoint().printGrade());
			
		} else {// 성적 등록할 학생이 없음 - 없다는 알림메세지 출력
			new MainView().printMsg("등록된 학생이 아닙니다.");

		}

	}
	
	//학년조회 서비스 구현
	public void searchG() {
		//학년 검색한 것 받기
		int gr=new MainView().inputG();
		Student[] studentgr = db.searchG(gr);
		if(studentgr!=null) {
		new MainView().printgr(studentgr);
		}else {
		new MainView().printMsg("조회된 학생이 없습니다.");
		}
		
		
	}
	
	// 성적으로 조회 서비스 구현
		public void searchNG() {
			// 이름으로 조회
			String name = new MainView().inputName();
			Student s = db.searchName(name);
			if (s == null) {
				new MainView().printMsg("조회결과가 없습니다!");
			} else {
				System.out.println("조회결과 : " );
				System.out.println(s.information()+s.getGradePoint().printGrade());
			}

		}
	
	

}

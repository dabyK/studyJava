package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sport;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {

	public void arrayListTest() {
		// list에 대해 알아보자. = 인터페이스
		// 특징 : 배열과 유사한 자료 구조를 가진다.
		// -> 인덱스 값을 갖고 있다. 순서가 있다. 중복값을 가질 수 있다.
		// 종류: ArrayList, LinkedList, Vector

		// ArrayList
		// 객체를 보관하는 데이터 보관용 클래스==Object[] 방식으로
		// 클래스를 생성(인스턴스화)하여 활용함
		ArrayList list = new ArrayList();

		// 활용 방식:배열과 거의 비슷하다
		// 배열은 출력, 대입[]를 이용
		// list객체이기 때문에 메소드를 이용해 처리
		// list에 값을 넣는 방법
		// add(객체) 메소드 이용
		list.add("유병승"); // add메소드를 값을 넣으면 순차적으로 0번 인덱스부터 값이 대입됨.
		list.add("조현크아앙"); // 1번 인덱스에 들어감
		// list는 다양한 객체를 보관할 수 있다.
		list.add(new GregorianCalendar());// 2번 인덱스
		list.add(new Scanner(System.in));// 3번 인덱스
		// 자료형 상관없이 마구잡이로 들어갈 수 있다.

		// list에 저장된 객체 출력하기
		// get(인덱스)메소드 이용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// list.get(00) -> 이거 자체가 변수명 -> 객체의 주소가 들어가 있음
		// Object형으로 저장하기 때문에 형변환하여 사용해야한다!!
		System.out.println(((String) list.get(0)).charAt(0)); // String을 집어넣었지만 Object로 취급됨

		// 반복문을 활용해서 데이터에 접근하여 처리할 수 있다.
		int[] a = new int[10]; // a.length
		// list의 길이는?? list.size();
		System.out.println(list.size());// list에 대입되어있는 객체의 수!
		// 데이터가 들어가 있는 것만 갯수를 센다!!! null은 안 셈
//		list=new ArrayList();
//		System.out.println(list.size());->0

		// list데이터 중 GregorianCalendar객체면 년도 출력!
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof GregorianCalendar) {
				GregorianCalendar gc = (GregorianCalendar) list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
			} else {
				System.out.println(list.get(i));
			}

		}

		// List인터페이스를 구현->ArrayList(상속받았음!)
		// import도 인터페이스로 해줘야함
		List sports = new ArrayList();

		// 좋아하는 스포츠 4개 대입하기
		// 규칙빼고

		sports.add(new Sport("구기", "축구", 11, new String[5])); // 마지막값이 배열이기때문에 할당만 해주는 것
		sports.add(new Sport("구기", "야구", 9, null));
		sports.add(new Sport("기구", "헬스", 1, null));
		sports.add(new Sport("물", "수영", 9, null));

		// for문을 이용해서 전체출력하기
//		for(int i=0; i<sports.size();i++) {
//			System.out.println(sports.get(i));		
//		}

		for (Object o : sports) {
			System.out.println(o);
		}

		// 종목이 구기 종목인 스포츠만 출력하기
//		for (int i = 0; i < sports.size(); i++) {
//			if (sports.get(i) instanceof Sport) {

//				if (((Sport) sports.get(i)).getType().equals("구기")) {
//					System.out.println(sports.get(i));
//				}
//			}
//		}

		for (Object o : sports) {
			if (o instanceof Sport) {

				Sport s = (Sport) o;

				if (s.getType().equals("구기")) {
					System.out.println(s);

				}
			}
		}

		// list는 원하는 위치에 손쉽게 데이터를 넣을 수 있다.
		// add(index,data); index위치에 data를 대입!
		System.out.println("==== 원하는 위치에 값 넣기 ====");
		System.out.println(sports.get(2));
		sports.add(2, new Sport("구기", "농구", 5, null));
		System.out.println(sports.get(2));
		System.out.println(sports.get(3));// 추가했더니 자동으로 로직이 밀렸음!! 자동으로 사이즈도 늘어남

		// list의 특정위치 값을 변경할 수도 있음
		// set(index,data); 특정 위치의 값을 변경!
		System.out.println("==== 원하는 위치의 값 변경 ====");
		System.out.println(sports.get(sports.size() - 2));
		// sports.size는 5(5개니까) 하지만 마지막 칸의 index는 4 그러므로 -1 해줘야함
		// 3번째 칸을 원하면 -2
		sports.set(sports.size() - 2, "오늘 비와요??");
		System.out.println(sports.get(sports.size() - 2));
		System.out.println(sports.get(sports.size() - 1));
		System.out.println(sports);

		// list에 데이터가 있는지 없는지 어떻게 확인할까??
		if (sports.size() > 0) {
			System.out.println("데이터있다");
		} else {
			System.out.println("데이터없다");
		}

		if (!sports.isEmpty()) {
			System.out.println("데이터있다");
		} else {
			System.out.println("데이터없다");
		}

		// 데이터 한번에 지우기 list명.clear();
//		sports.clear(); 

		// 원하는 데이터 삭제하기
		// remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));

		// remove(객체)도 가능
		System.out.println("지우기 전 갯수");
		System.out.println(sports.size());
		sports.remove(new Sport("구기", "축구", 11, new String[5]));

		// @Override equals() 해줘야 지워진다 -> new때문에 새로운 객체로 인식하므로
		// sport.get(1).equals(new ...); 이렇게 해주는 과정이 있어야 하는데, remove가 알아서 해주는 것!
		// 해주고나면 실행 OK
		System.out.println("지운 후 갯수");
		System.out.println(sports.size());
		System.out.println(sports.get(0));// 0번이 지워지고 1번이 다시 0번이 되었음

		// list내부에서 특정 객체를 찾는 메소드
		// contains() ->t/f
		System.out.println(sports.contains(new Sport("물", "수영", 9, null))); // true
		System.out.println(sports.contains(new Sport("구기", "축구", 11, new String[5]))); // false

		// list는 중복값 저장이 가능함
		list = new ArrayList();
		for (int i = 0; i < 3; i++) {
			list.add("유병승");
		}
		for (Object n : list) {
			System.out.println(n);
		}

	}

	// list에는 인덱스를 기준으로 순서가 존재한다!
	// 그렇담 정렬??
	public void listSort() {
		// list자료 정렬해보기
		List nums = new ArrayList();
		for (int i = 0; i < 10; i++) {
			nums.add((int) (Math.random() * 30) + 1);
		}
//		for (Object o : nums) {
//			System.out.println(o);
//		}
		printList(nums);
		
		//오름차순으로 정렬하기
		Collections.sort(nums);
		System.out.println("=== 오름차순 정렳 후 ===");
		printList(nums);
		
		//내림차순으로 정렬하기
		//1.내림차순을 위한 객체를 생성하는 방법 -> Comparator인터페이스 구현
		
		//2.객체 내부에서 정렬순서를 정하는 방법 -> Comparable인터페이스 구현
		//compare()/compareTo()메소드를 구현
		
		//1번 방법
		Collections.sort(nums,new NumberSort());
		System.out.println("=== 내림차순 정렬 후 ===");
		printList(nums);
		
		//문자열 정렬하기
		nums.clear();
		nums.add("남지선");
		nums.add("강수정");
		nums.add("황진호");
		nums.add("설진호");
		nums.add("김다희");
		nums.add("유병승");
		System.out.println("====문자열 정렬하기====");
		printList(nums);
		System.out.println("====오름차순 정렬====");
		Collections.sort(nums);
		printList(nums);
		System.out.println("====내림차순 정렬====");
		Collections.sort(nums,new StringSort());
		printList(nums);
		
		//객체가 들어가 있는 list 정렬하기
		//방법 2
		nums.clear();
		nums.add(new Sport("구기","축구",11,null));
		nums.add(new Sport("구기","농구",5,null));
		nums.add(new Sport("헬스","헬스",1,null));
		nums.add(new Sport("구기","테니스",2,null));
		nums.add(new Sport("구기","골프",2,null));
		System.out.println("==== 정렬전 ====");
		printList(nums);
		System.out.println("==== 오름차 ====");
		Collections.sort(nums,new SportPlayerSort(true));
		System.out.println("==== 내림차 ====");
		Collections.sort(nums,new SportPlayerSort(false));
		//해당객체 ->Sport 에 Comparable 인터페이스 상속시키고, compareTo 메소드 오버라이딩하기!
		printList(nums);
		
		//정렬 익명클래스를 이용해서 정렬하기!!
		Collections.sort(nums,new Comparator() { //Comparator는 인터페이스
			@Override							//한번 쓰고 말 임시클래스 일회용 = 익명클래스
			public int compare(Object o,Object o2) {
				return ((Sport)o).getPlayer()-((Sport)o2).getPlayer(); //오름차순
			}
		});
		printList(nums);
		
		//람다식을 이용해서 정렬하기
		Collections.sort(nums,(o,o2)->(((Sport)o2).getPlayer()-((Sport)o).getPlayer()));
		printList(nums);
	

	}

	public void printList(List list) {
		for(Object o : list) {
			System.out.print(o+" ");
		}System.out.println();
	}
	
	public void linkedList() {
		//LinkedList ArrayList와 비슷(저장 방식에 차이가 있다)
		LinkedList list=new LinkedList();
		
		//값 대입
		list.add("유병승");
		list.add("설진호");
		list.add("이세현");
		list.add("김다희");
		
		
		//값 출력
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		
//		list.add(1,"박현우"); //유병승과 설진호 사이에 추가됐음
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.getLast());
//		list.remove(1);
		//추가삭제가 빈번할때는 linkedList가 더 편하고 빠르다.
		System.out.println("추가 전");
		printList(list);
		
		System.out.println("추가 후");
		list.add(1,"박현우");
		printList(list);
		
		System.out.println("삭제 후");
		list.remove(2);
		printList(list);
		
		
		
		
		
		
	}
	
}

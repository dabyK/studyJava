package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {
	
	public void setTest() {
		//Set에 대해 알아보자 -> 랜덤박스임
		//특징 : 순서가 없다, 데이터를 구분할 수 있는 구분자가 없다, 그래서 데이터를 원하는 값을 따로 호출 불가능하다,
		// 	중복값 저장이 불가능하다.
		//종류 : HashSet, TreeSet
		//객체방식으로 메소드를 호출해서 저장, 호출
		HashSet set=new HashSet();
		//데이터 대입
		//add(값)메소드를 사용한다.
		set.add("설진호");
		set.add("조현");
		set.add("강경록");
		set.add("이세현");
		set.add("황진호");
		
		//set에 저장된 데이터는 데이터를 구분할 수 있는 구분자가 없어서
		//모든 자료를 불러올 수 있는 객체(Iterator)를 이용해서 출력한다
		Iterator it=set.iterator();
		while(it.hasNext()) {//밑에칸있어?? 라는 뜻 - 이게 반복되는거 
			System.out.println(it.next());
		}
		//랜덤 주머니에 들어있던 set의 값들을 선반구조에 한칸씩 넣는다고 생각!
		//값도 무작위로 출력됨-한번 출력된 후로는 고정됨
		//만약 System.out.println(it.next());를 두번쓰면 홀수갯수만큼 있는 경우 에러남
		//왜냐면 두칸출력하고 밑에 또 있나?보고 있음 두칸 출력인데 홀수일경우 아래가 한칸이니까
		//두칸뽑아야하는데 한칸이라서! 그래서 짝수면 에러는 안남
		//그치만 잘못된 로직이니까 두번호출하는 건 쓰지말기
		//두번쓰고 싶으면 
		//Object o=it.next();
		//System.out.println(o); 이렇게 하셈
		
		//set 저장된 이세현 찾기
//		Iterator it2=set.iterator();
//		while(it2.hasNext()) {
//			if(it2.next().equals("이세현")) {
//				System.out.println(it2.next());
//			}
//		}//->설진호가 나옴 이세현이 아닌 넥스트사람, 다음사람이 나옴
		//next를 쓸때마다 밑에칸을 부르게 됨
		//그래서 it2.next().equals("이세현")에서 이미 next로 이세현으 써버려서
		//System.out.println(it2.next());이거의 next는 그 밑칸인 설진호가 된다.
		
//		Iterator it2=set.iterator();
//		while(it2.hasNext()) {
//			Object o=it2.next();
//			if(o.equals("이세현")) {
//				System.out.println(o);
//			}
//		}//이렇게 해야 이세현나옴
		
		//set에 있는 전체객체 조회할때는
		//forEach문 사용 가능
//		System.out.println("====forEach문====");
//		for(Object o :set) {
//			System.out.println(o);
//		}
		
		//set 중복값 저장이 될까요?
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		
		//전체출력하기
		Iterator it3=set.iterator();
		while(it3.hasNext()) {//밑에 칸에 값 있니?
			System.out.println(it3.next());
		}//중복값 저장 안됨
		
		//Lotto중복값
		HashSet lotto=new HashSet();
//		for(int i=0;i<7;i++) {
//			lotto.add((int)(Math.random()*44)+1); //중복값을 알아서 지움
//			
//		}
		while(true) {
			lotto.add((int)(Math.random()*44)+1);
			if(lotto.size()==7) {
				break;
			}
		}//이렇게해야 중복이 있어도 7개가 됨
		
		
		for(Object o : lotto) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//set에 있는 데이터를 확인할 수 있음
		//size() 메소드 이용
		if(lotto.size()==0) {
			System.out.println("데이터가 없습니다.");
		}
		
		//set에 내가 만든 객체를 넣어보자
		//Member클래스를 만들고, id, pw, name, age
		//id가 같으면 들어가지 않게!(중복x)
		//1. admin,1234,관리자,19
		//2. user01,1111,유저1,20
		//3. user02,2222,유저2,21
		//4. user03,3333,유저3,22
		//5. admin,1234,관리자,19
		
		Set m=new HashSet();//파란부분이 Set이든 HashSet이든 상관없음!! Set이 상위니까
		m.add(new Member("admin","1234","관리자",19));
		m.add(new Member("user01","1111","유저1",20));
		m.add(new Member("user02","2222","유저2",21));
		m.add(new Member("user03","3333","유저3",22));
		m.add(new Member("admin","1234","관리자",19));
		
		for(Object o : m) {
			System.out.println(o+" ");
		} //객체의 경우 equals와 hashCode까지 해줘야, 객체의 주소를 비교해서 같은 것(중복)으로 인식해줌
		
		//set
		//삭제가 가능
		//전체삭제와 일부삭제 모두 가능~
		//m.clear(); 전체삭제!!
		
		//원하는 값을 불러올 수가 없는데 어떻게 일부삭제가??
		//remove(객체); 를 통해 삭제가능!! 객체의 동등성 여부는 비교할 수 있기 때문에
		//equals와 hashCode를 이용해서!
		m.remove(m.add(new Member("user01","1111","유저1",20)));
		System.out.println("===삭제후===");
		
//		for(Object o : m) {
//			System.out.println(o+" ");
//		}//현재는 equals와 hashCode에 아이디만 일치하면 같은걸로 보게 해놨기 때문에 아이디만 같으면 걍 지워진다.
		
		System.out.println("===iterator는 재활용이 불가능===");
		//Iterator를 다시활용하려면 재할당해줘야한다.
		//System.out.println(it.next());
		//NoSuchElementException 나옴. 다음 트레이(밑에 층)에 값이 없을 때
		//한번 모든층 읽고나면 쓸모가 없는것! 재활용불가
		it=m.iterator();
		System.out.println(it.next());
		//이렇게 재할당해주면 쓸수 있음
		
		//출력방식은 iterator 랑 forEach문 두개가 있음~~
		
		//Set, List는 둘 다 Collection의 자식
		//Set <--> List 서로 호환이 가능하다!!!
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		//list는 중복값이 가능! 만약 중복을 지우고 싶다면, 원래는 이중포문 돌려서 지워야함
		//근데 set을 이용해서 지울수 있다
//		HashSet temp=new HashSet(list);
//		list=new ArrayList(temp);
		list=new ArrayList(new HashSet(list));
		System.out.println(list);
		//set에 넣었다가, 다시 list로 받아주면 중복값이 지워진다!!
		
		
		
		
	}

}

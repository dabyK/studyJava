package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {

	public static void main(String[] args) {
		//다형성 활용하기
		//부모타입으로 설정되어있는 변수에 자식 타입의 객체가 대입될 수 있는 것
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		ani=new Cat(); //둘이 다른 이름의 자료형인데 들어간다!=다형성
		System.out.println(ani);
		ani=new Duck();
		System.out.println(ani);
		ani=new Lion(); 
		System.out.println(ani);
		//상속관계가 전제조건이 됨! 상속관계가 아니면 넣었을 때 에러남!
		
		//부모는 자식변수에 들어갈 수 있나?
		//tom=new Animal(); //부모타입은 자식타입에 대입될 수 없다.
		
		//다형성에 의해 자식객체가 부모타입으로 대입되면,
		//부모객체의 내용만 볼 수 있게 설정됨!(=업캐스팅)
		Person p=new Employee("설진호",48,"포천","개발팀","연구원",100);
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDepartment());
		//다형성으로 대입되면 Employee가 Person인 척 한다!
		//그렇기 때문에 Person에 없고 Employee만 가진 것은 가져올 수 없어
		//부모가 가지고 있는 데이터(멤버변수,메소드 등)만 볼 수 있음
		//자식의 내용은 볼 수 없게 됨
		Employee e=(Employee)p;
		//위에 설진호..자료를 넣은 다형성 Person p를 다시 Employee에 형변환해서 넣어준 것
		
		//부모타입으로 대입된 자식객체의 데이터에 접근하려면 '강제 형변환'을 해야한다.
		//(=다운캐스팅)
		((Employee)p).getDepartment();
		//연산자 우선순위가 .이 (자료형)보다 빠르므로 먼저 하기 위해 묶어줘야 한다.
		System.out.println(((Employee)p).getDepartment());
		
		p=new Singer("김세민",32,"남양주","너만보인단말이야~",2,"밴드");
		Singer s=(Singer)p;
		//singer정보가 들어간 다형성 Person객체를 다시 Singer에 형변환해서 넣어준것
		//그냥 이미 입력한 데이터 쓰려고 이렇게 만든 것
		//Employee e = new Employee("설진호",48,"포천","개발팀","연구원",100);
		//Singer s=new Singer("김세민",32,"남양주","너만보인단말이야~",2,"밴드");
		//원래는 그냥 이렇게 쓰면 됨!
		
		//functional 객체에서 지원하는 출력 메소드이용
		new Functional().print(e);// 객체생성하자마자 메소드갖다쓰기(굳이 변수로 저장 안하고)
		new Functional().print(s);
		
		//p에는 Singer가 있음 Singer가 대입된 상태
		//사실 p는 Person인데 실제 들어가있는 객체는 Singer 
		//instanceof는 실제로 들어가 있는 객체를 확인하는 것
		System.out.println(p instanceof Employee);//false
		System.out.println(p instanceof Singer);//true
		
		//부모객체를 이용한 여러 자식객체 보관하기
		//객체배열로 보관하기
		Person[] persons=new Person[5];
		//본인 Person을 포함한 자식객체가 모두 들어갈 수 있음
		//각각을 하나하나 보관하고 변경해서 새로 보관하는 것보다 객체 배열로 넣으면 한 번에 넣을 수 있음
		persons[0]=new Singer("김세민",27,"경기도 남양주","너만 보인단 말이야",4,"가요");
		persons[1]=new Employee("유다해",22,"서울","개발팀","연구원",100);
		persons[2]=new Person("설진호",32,"지역차별");
		persons[3]=new Singer("조현",28,"서울","깡",10,"힙합");
		persons[4]=new Employee("이세현",27,"서울","연구팀","연구원",20);
		
		//프로그램에 현재 등록되어 있는 가수의 수는?
		//프로그램에 현재 등록되어 있는 가수와 사원의 수는?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}			
		}System.out.println("가수 : "+singerCount+"명, 사원 : "+empCount+"명");
		
		//Object -> 모든 클래스의 부모 객체, 최상위 객체
		Object obj=new Person();
		System.out.println(obj);
		obj=new Employee();//밑에 obj출력에서 (그냥 출력하면 주소가 나온다. 하지만 toString을 오버라이딩하면 입력 값을 찾아줌)
						//부모는 자식것에 접근할 수 없는데, 재정의(오버라이딩)한 메소드에는 접근할 수 있다 = 동적바인딩
		                   //재정의(오버라이딩)된 것이 없으면 그 부모의 것까지 올라가서 있는지 찾는다.
							//Employee에 오버라이딩된 toString이 없으면 위로 올라가서 Person에서 찾는다.
		                   //있으면 Employee의 toString을 불러옴 둘다 없으면 그냥 obj값(주소)
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//모든 클래스는 Object가 갖고 있는 메소드를 사용할 수 있다.
		System.out.println(obj);//Employee객체가 들어가 있음
		
		System.out.println(persons[0]);//Singer가 들어가 있는데, Singer에는 오버라이딩된 메소드가 없기 때문에 Person으로 출력
		//toString은 객체를 부르면 자동으로 호출되게 되어있는 기능의 메소드! 그래서 지금 toString으로 입력한 메소드가 맘대로 튀어나오는 것
		//오버라이딩 된 상태니까 자식객체에서도 마음껏 튀어나갈 수 있어서
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Employee) {
				Employee ee=(Employee)persons[i];//다형성 다운캐스팅 해준것
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()+
						ee.getDepartment()+ee.getJob()+ee.getSalary());		
			}else if(persons[i] instanceof Singer) {
				Singer ss=(Singer)persons[i];//다형성 다운캐스팅 해준것
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			}else if(persons[i] instanceof Person) {
				Person pp = persons[i];
			System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
			}
		}
		System.out.println("===동적 바인딩을 이용한 출력===");
		//동적바인딩을 이용하면 알아서 변수에 들어가 있는(대입된) 오버라이딩된 메소드를 호출
		//*형변환 없이* 변수에 대입된 자식 객체의 메소드를 이용 가능
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object에 있는 toString메소드를 호출하게 됨 
										   //-> Object를 상속한 자식객체들이 toString을 오버라이딩(재정의함)
										   //->자식객체 속 재정의된 메소드에 먼저 찾아감			
		}
		System.out.println("====동적바인딩 재설명====");
		Person person=new Person("이순신",44,"거북선");
		System.out.println(person.getName());
		person=new Employee("유병승",19,"시흥시","자바학부","강사",100);
		System.out.println(person.getName());//호출할 때 대입되어있는 (자식)객체가 가지고 있는 오버라이딩된 메소드를 우선하는 것:동적 바인딩
		
		//toString() -> 참조 변수를 sout에 매개변수로 넣으면
		//참조형 변수를 출력해야하는데 주소가 들어가 있으니 그대로 주소를 출력하는게 아니고
		//보기 쉽게 출력하기 위해 자동으로 toString()메소드를 호출하여 출력
		//모든 객체에 반영되기 위해 Object객체에 선언
		Date d=new Date();
		System.out.println(d);
		
		String str=new String("안녕");
		System.out.println(str);
		
		Animal ani1=new Animal();
		System.out.println(ani1);//얘는 Object의 toString이 실행되기때문에 주소가 나오는 것임
		System.out.println(ani1.toString());//이거도 똑같음 toString이 Object니깐
		//만약 Animal에 toString을 오버라이딩하면 그 값으로 나오게 된다.
		Object obj2=ani1;
		System.out.println(obj2.toString());//이렇게 되면 animal의 오버라이딩된 toString메소드가 실행됨-동적바인딩
											//obj2에 animal이 들어가있으니까 대입된 자식것 먼저 살펴
		
		//객체의 동등비교
		Person jo=new Person("조현",28,"개발자");
		Person jo2=new Person("조현",28,"개발자");
		System.out.println(jo==jo2);//둘의 주소를 비교하는 것:당연히 false
		//객체를 비교할 때? 어떻게 할까? equals! (String도 객체임)
		System.out.println(jo.equals(jo2));//그냥쓰면 false가 나옴 
		//객체의 동등성을 비교할 때는 Object에 있는 equals()메소드를 Override하여 사용한다.
		System.out.println(jo.equals("하하하하"));//그냥하면 에러뜸
		
		//객체복사 clone() Override하기
		Employee emp=new Employee("강경록",30,"수원","개발팀","팀장",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
	}

}

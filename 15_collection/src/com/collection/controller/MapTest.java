package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	
	public void mapTest() {
		//Map : 객체데이터를 보관하는 클래스
		//저장방식 - key : value 가 한 쌍으로 이루어져 있음
		//key의 자료형 : Object; -> 찾기 쉽게 주로 String,Integer 형으로 많이 사용함
		//value의 자료형 : Object; -> 모든 객체 사용!
		//종류 : HashMap, TreeMap, LinkedHashMap;
		//주머니에 객체들이 들어있되, key값을 각자 가지고 있는 저장 방식
		
		//클래스이기 때문에 메소드를 이용해서 데이터를 처리한다
		
		//생성하기
		HashMap map=new HashMap();
		//Map자료형에 값 넣기
		//add가 아닌 put으로 넣어준다!!! 
		//put(key,value);
		map.put(1,"유병승");
		map.put(2,"김세민");
		map.put(3,"김다희");
		//key,value에는 모든 객체가 들어갈 수 있다.
		map.put("펭수","남지선");
		map.put("admin",new Member("admin","1234","관리자",19));
		map.put(new Member("user01","1111","유저1",20),1);
		
		//map에 들어가 있는 값 출력하기
		//get(key); -> value 값을가져올 수 있음!!
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","유저1",20)));
		//key가 인덱스고 value가 내용이라고 이해하면 조금 더 편함
		
		//web 프론트단에서 보내는 값을 key:value형식으로 가져오게 됨!!
		//request.getParameter("userId"); -> key:value 형식
		
		//map -> List의 특성과 Set의 특성을 둘다 가진다.
		//key 는 중복이 불가능!!! 
		//Key를 Set방식으로 저장함 
		
		//map에 보관하고 있는 key 전체를 출력하려면 set으로 받아와서 출력해야한다.
		System.out.println("==== key값 출력 ====");
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		//value값 출력하기
		System.out.println("==== key : value 출력 ====");
		Set keys2=map.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			System.out.println(key+" : "+map.get(key));			
		}
		
		//전체출력방법2
		//Map.Entry 객체를 이용하여 한번에 key와 value값을 출력!
		System.out.println("====MapEntry객체로 출력====");
		Set mapEntry=map.entrySet();
		Iterator it3=mapEntry.iterator();
		while(it3.hasNext()) {
			Map.Entry entry=(Map.Entry)it3.next();
			//Map.Entry 객체 안에는 key와 value값을 동시에 보관한다.
			//key값 뽑기 : Map.Entry.getkey();
			//value값 뽑기 : Map.Entry.getValue();
			//System.out.println(it3.next());
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());			
		}
		
		
		//key값 가져오기
		System.out.println("====for each문으로 출력====");
		for(Object o : map.keySet()) {
			System.out.println(o); //key값
			System.out.println(map.get(o)); //value값
		}
		
		System.out.println("===for each+map.entry===");
		for(Object a:map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//map 객체 저장하고 활용하기!
		HashMap members=new HashMap();
		//member객체 3개만 넣으세요!
		members.put(1,new Member("admin","1111","관리자",30));
		members.put(2,new Member("user01","1234","유저1",20));
		members.put(3,new Member("user02","2345","유저2",25));
		
		//저장된 멤버의 id만 출력하기
		//Set k=members.keySet();
		System.out.println("====아이디만 뽑아내기====");
		for(Object o : members.keySet()) {
			Member m=(Member)members.get(o);
			System.out.println(m.getId());		
			//System.out.println(((Member)members.get(o)).getId());
		}
		
		//iterator로 해보기
		System.out.println("===아이디만 뽑기2:iterator===");
		Set k=members.keySet();//키들을 다 Set으로 넣어줌
		Iterator it4=k.iterator();//키의 모음인 Set을 Iterator해줌(뽑을 수 있게 아파트화)
		while(it4.hasNext()) {//다음 칸에 값 있니?-옥상에서 출발
			//if(members.get(it4.next()) instanceof Member) {
			Member m=(Member)(members.get(it4.next()));//그 값(키)에 해당하는 value(객체)를 Member객체에 저장해
			System.out.println(m.getId());//그 객체의 Id를 가져와
			
			//쌤이 한 것
			//Object o=members.get(it4.next());
			//System.out.println(((Member)o).getId());
			//}
		}
		
		System.out.println("===아이디만 뽑기3:mapEntry===");
		Set memEntry=members.entrySet();
		it4=memEntry.iterator();
		while(it4.hasNext()) {
			Map.Entry en=(Map.Entry)it4.next();
			Member m=(Member)en.getValue();
			System.out.println(m.getId());			
		}
		
		//map은 key값이 중복이 안된다!!
		System.out.println(members.get(1));
		members.put(1,"이거는 어떻게 되니??");
		System.out.println();
		
		//value값은 중복이 된다!
		members.put(4,new Member("user02","2345","유저2",25));
		members.put(5,new Member("user02","2345","유저2",25));
		members.put(6,new Member("user02","2345","유저2",25));
		
				
		//map 객체개수 확인가능
		System.out.println(members.size());
		
		//key값이 있는지, value가 있는지 확인하는 것
		//containsKey()/containsValue()
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsKey(new Member("user02","2345","유저2",25)));
		
		//map에 있는 데이터 지우기
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("user02","2345","유저2",25));
		System.out.println(members);
		members.clear();//다 지우기
		
		
		
	}

}

package com.practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Controller {
	
	
	public void p1() {
		
		ArrayList list=new ArrayList();
		list.add(new Member("홍길동",29,"대리",300));
		list.add(new Member("이순신",30,"과장",500));
		list.add(new Member("유병승",18,"사장",1000));
		list.add(new Member("장길산",85,"고문",10));
		list.add(new Member("용석",26,"인턴",1));
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		
	}
	
	public void p2() {
		Set set=new HashSet();
		set.add(new Member("홍길동",29,"대리",300));
		set.add(new Member("이순신",30,"과장",500));
		set.add(new Member("유병승",18,"사장",1000));
		set.add(new Member("장길산",85,"고문",10));
		set.add(new Member("용석",26,"인턴",1));
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		set.add(new Member("유병승",18,"사장",1000));
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

	public void p3() {
		HashMap map=new HashMap();	
		map.put(1, new Member("홍길동",29,"대리",300));
		map.put(2, new Member("이순신",30,"과장",500));
		map.put(3, new Member("유병승",18,"사장",1000));
		map.put(4, new Member("장길산",85,"고문",10));
		map.put(5, new Member("용석",26,"인턴",1));
		
		Set key=map.keySet();
		Iterator it=key.iterator();
		while(it.hasNext()) {		
			System.out.println(map.get(it.next()));
		}
		
		
		
		
		
	}
}

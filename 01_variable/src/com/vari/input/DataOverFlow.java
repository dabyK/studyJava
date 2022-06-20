package com.vari.input;

public class DataOverFlow {
	
	public static void main(String[] args) {
		//데이터 오버플로우 확인하기
		byte bnum=127; //bnum이라는 변수값은 127이다
		
		for(int i=0;i<300;i++) { 
			System.out.println(bnum++);	
			//i는 0이고 300보다 작을때 값을 1씩 올려라
		} //중괄호 안에 있는 걸 300번 반복해라
		
		//128으로 넘어가지 못하므로 127 다음 -128로 찍힘
		//그 이상으로 넘어가지 못하기 떄문에 나올 수 있는 값인 최소값으로 돌아가서 다시 하는 것!=오버플로우
		//계산했을 때 +가 안나오고 -로 넘어가서 돈다면, 자료형을 더 큰 범위로 바꿔야하는 것
			
	}
	

}

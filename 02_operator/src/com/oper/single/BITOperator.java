package com.oper.single;

public class BITOperator {

	public static void main(String[] args) {
		//비트연산 확인하기
		//비트연산- 비트의 같은 칸끼리 계산
		//&,|,^ 연산자 
		//& 00=0 01=0 11=1 둘 다 1이어야 1(같은 자리의 비트를 비교했을 때)
		//00000000 이렇게 될 때 같은 자리!(세로로 비교)
		//00000000
		//| 00=0 01=1 10=1 11=1 둘 중 하나 1이면 1
		//^ 01=1 10=1 11=0 00=0 둘이 다를때만 트루
		
		//쉬프트 연산 곱하기(*2), 나누기(/2) ->2진수기때문에 숫자(1,0)가 한칸씩 옆으로 밀리는 효과가 남
		
		int a=10,b=22;
		String basic="00000000000000000000000000000000"; //32비트
		//a비트값
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//b비트값
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a&b 연산
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a|b
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a^b(Xor이라고 부름)
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//~a보수(0과 1을 반대로)
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a<<1 (=*2한셈) 왼쪽으로 1이 한칸씩 밀림!
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a>>1 (/2한셈) 오른쪽으로 1이 한칸씩 밀림!
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
	}
	
}

package com.oper.single;

public class BITOperator {

	public static void main(String[] args) {
		//��Ʈ���� Ȯ���ϱ�
		//��Ʈ����- ��Ʈ�� ���� ĭ���� ���
		//&,|,^ ������ 
		//& 00=0 01=0 11=1 �� �� 1�̾�� 1(���� �ڸ��� ��Ʈ�� ������ ��)
		//00000000 �̷��� �� �� ���� �ڸ�!(���η� ��)
		//00000000
		//| 00=0 01=1 10=1 11=1 �� �� �ϳ� 1�̸� 1
		//^ 01=1 10=1 11=0 00=0 ���� �ٸ����� Ʈ��
		
		//����Ʈ ���� ���ϱ�(*2), ������(/2) ->2�����⶧���� ����(1,0)�� ��ĭ�� ������ �и��� ȿ���� ��
		
		int a=10,b=22;
		String basic="00000000000000000000000000000000"; //32��Ʈ
		//a��Ʈ��
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//b��Ʈ��
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a&b ����
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a|b
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a^b(Xor�̶�� �θ�)
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//~a����(0�� 1�� �ݴ��)
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a<<1 (=*2�Ѽ�) �������� 1�� ��ĭ�� �и�!
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		//a>>1 (/2�Ѽ�) ���������� 1�� ��ĭ�� �и�!
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
	}
	
}

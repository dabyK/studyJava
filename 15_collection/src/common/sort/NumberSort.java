package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator {

	@Override
	public int compare(Object o, Object o1) { // list�� ĭ���� ���鼭 ��� ���� 0��1��/1��2��...
		// ��ȯ�� �������ִ�
		// ���, 0, ���� -> 1, 0 ,-1
		// return�� ���(1)�� �� �� ���� ��ü��! 
		// return ����(-1)�� �� �� ���� �������� �ʴ´�. 
		// return 0�̸� �� �� ���� �������� �ʴ´�.
		if (o instanceof Integer && o1 instanceof Integer) {
			Integer su = (Integer) o; // �� ���� ���ϱ����� ��ü�� intȭ ���� ��
			Integer su2 = (Integer) o1; //if(o>o1)
//			if (su > su2) return -1;
//			else if (su < su2) return 1;
//			else return 0;
			return su2-su;

		}
		return 0;
	}

}

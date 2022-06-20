package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator {

	@Override
	public int compare(Object o, Object o1) { // list의 칸들이 돌면서 계쏙 들어옴 0번1번/1번2번...
		// 반환값 정해져있다
		// 양수, 0, 음수 -> 1, 0 ,-1
		// return이 양수(1)면 두 개 값을 교체함! 
		// return 음수(-1)면 두 개 값을 변경하지 않는다. 
		// return 0이면 두 개 값을 변경하지 않는다.
		if (o instanceof Integer && o1 instanceof Integer) {
			Integer su = (Integer) o; // 두 값을 비교하기위해 객체를 int화 해준 것
			Integer su2 = (Integer) o1; //if(o>o1)
//			if (su > su2) return -1;
//			else if (su < su2) return 1;
//			else return 0;
			return su2-su;

		}
		return 0;
	}

}

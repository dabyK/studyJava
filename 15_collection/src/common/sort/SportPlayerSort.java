package common.sort;

import java.util.Comparator;

import com.collection.model.vo.Sport;

public class SportPlayerSort implements Comparator<Sport> { // <자료형>

	private boolean flag;

	public SportPlayerSort(boolean flag) {
		// true -> 오름차순
		// false -> 내림차순
		this.flag = flag;
	} 

	@Override
	public int compare(Sport o1, Sport o2) {
		// TODO Auto-generated method stub
		return flag ? o1.getPlayer() - o2.getPlayer() : o2.getPlayer() - o1.getPlayer();
	}   //이렇게 하면 flag값의 t/f에 따라 오름차순, 내림차순 설정이 가능! 둘 다 병행 가능한 것

}

package shopping;

public class MaxCounter {
	
	private int count = 0;	//내부에서 사용하는 숫자
	int max;	//최대값
	int increment;
	
	/*
	 * public void counter(int max) { this.max = max; increment++; }
	 */
	
	public MaxCounter(int max) {
		this.max = max;
	}
	
	//생성자는 객체를 초기화 하는 작업을 수행할때 쓰는거니까 증감시키는 작업은 메소드로 수행해야한다
	public void increment() {
		if(count < max) {
			count++;
		}
	}

	/*
	 * public int getCount() { increment++; return increment; }
	 */
	//현재 카운트를 반환하는 메소드
	public int getCount() {
		return count;
	}

}

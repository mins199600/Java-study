package shoppingex;

import shopping.MaxCounter;

public class MaxCounterMain {
	
	public static void main(String[] args) {
		MaxCounter maxCounter = new MaxCounter(3);
		
		//카운터 증가시키기
		maxCounter.increment();	//1
		maxCounter.increment();	//2
		maxCounter.increment();	//3
		maxCounter.increment();	//증가하지 않음(최대값 도달)
		
		System.out.println("현재 카운트 : " + maxCounter.getCount());	//결과 출력
	}

}

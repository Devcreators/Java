package chap08.Sample03;

public class Data {
	
	int value;
	
	void setValue(int value) {
		// 매개 변수명이 동일하게 될 경우 메서드 내에서는 매개변수가 우선순위가 됨.
		// 결국 매개변수 값에 매개변수 값을 넣기 때문에 
		// 변숫값에 대한 할당은 영향을 미치지 않게 됨.
		// value = value;	
		this.value = value; // 매개변수 value을 멤버 변수 value에 대입
		// The assignment to variable value has no effect
	}
	
	int getValue() {
		return value;
	}
}

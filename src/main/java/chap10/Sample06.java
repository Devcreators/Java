package chap10;

/*
public class Sample06<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setA(T t) {
		this.t = t;
	}
}
*/

public class Sample06<String> {	// T가 String 으로 처리
	private String t;	// T가 String 으로 처리

	public String getT() {	// 반환 될 자료형이 String 으로 처리
		return t;
	}

	public void setT(String t) {	// 인자 T가 String 으로 처리
		this.t = t;
	}
}
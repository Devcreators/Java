package chap02;

public class Sample15 {
	public static void main(String[] args) {
		final float PI1; // 정의하지 않고 PI를 상수로 선언했다.
		PI1 = 3.14f;
		
//		final var PI2; // Cannot use 'var' on variable without
		final var PI3 = 3.14f;
	}
}

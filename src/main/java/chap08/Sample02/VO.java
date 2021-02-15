package chap08.Sample02;

public class VO {

	String name;
	int age;

//	static final int ONE = 1;
//	static final int TWO = 2;
//	static final int THREE = 3;

	static final int ONE;
	static final int TWO;
	static final int THREE;

	static {
		System.out.println("static block 호출");
		ONE = 1;
		TWO = 2;
		THREE = 3;
	}
}

package chap02;

public class Sample13 {
	public static void main(String[] args) {
		// var name; // 자료형을 추론할 때 리터럴이 없으면 추론할 수 없어서 에러가 발생
		var name = "홍길동";
		var age = 28;
		var height = 159.9f;
		
		System.out.println("name : " + name);
		System.out.println("age : "+ age);
		System.out.println("height : "+ height);
	}
}

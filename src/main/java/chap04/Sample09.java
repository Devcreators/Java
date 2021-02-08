package chap04;

public class Sample09 {

	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		
		System.out.println("* OR");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a), a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b), b);
		System.out.println("=========================================");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a | b), a | b);
	}

}

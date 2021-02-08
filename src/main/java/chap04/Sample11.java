package chap04;

public class Sample11 {

	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		
		System.out.println("* NOT");
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(~a), a, ~a);
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d\n", 
				Integer.toBinaryString(b), Integer.toBinaryString(~b), b, ~b);
	}

}

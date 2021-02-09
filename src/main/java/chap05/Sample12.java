package chap05;

import java.util.Arrays;

public class Sample12 {

	public static void main(String[] args) {
		String[] hun1 = new String[] { "라면", "미역국", "떡볶이", "수제비", "갈비탕", "순대국" };

		String[] hun2 = Arrays.copyOf(hun1, hun1.length - 1);
		String[] hun3 = Arrays.copyOf(hun1, hun1.length - 2);
		String[] hun4 = Arrays.copyOf(hun1, hun1.length - 3);
		String[] hun5 = Arrays.copyOf(hun1, hun1.length - 4);
		String[] hun6 = Arrays.copyOf(hun1, hun1.length - 5);

		System.out.println(Arrays.toString(hun1));
		System.out.println(Arrays.toString(hun2));
		System.out.println(Arrays.toString(hun3));
		System.out.println(Arrays.toString(hun4));
		System.out.println(Arrays.toString(hun5));
		System.out.println(Arrays.toString(hun6));

		System.out.println("\n첫 번째와 마지막 요소를 제거하고 복사하여 출력 ==");
		String[] cp = Arrays.copyOfRange(hun1, 1, hun1.length - 1);
		System.out.println(Arrays.toString(cp));
	}

}

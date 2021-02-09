package chap05;

import java.util.Arrays;

public class Sample13 {

	public static void main(String[] args) {
		String[] hun1 = new String[] { "라면", "미역국", "떡볶이", "수제비", "갈비탕", "순대국" };
		
		System.out.println("정렬 전 : " + Arrays.toString(hun1));
		
		// 정렬할 배열을 복사합니다.
		String[] hun2 = Arrays.copyOf(hun1, hun1.length); // 전체정렬 배열
		String[] hun3 = Arrays.copyOf(hun1, hun1.length); // 범위정렬 배열
		
		Arrays.sort(hun2);
		Arrays.sort(hun3, 2, 5);
		System.out.println("전체정렬 후 : " + Arrays.toString(hun2));
		System.out.println("범위정렬 후 : " + Arrays.toString(hun3)); // 1, 2번은 고정, 3번째부터 정렬
	}

}

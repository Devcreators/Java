package chap03;

import java.util.Random;

/**
 * @author promaster
 * 난수를 학습합니다.
 */
public class Sample16 {	
	/**
	 * 난수를 생성해서 출력하는 예제입니다.
	 * @param args 배열
	 * @since 1.0
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3) + 1; // 1~3 출력
		System.out.println("난수 : " + num);
	}
}

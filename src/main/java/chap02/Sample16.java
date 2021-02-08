package chap02;

import java.util.Random;

public class Sample16 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3) + 1; // 1~3 출력
		System.out.println("난수 : " + num);
	}

}

package chap09;

import java.util.UUID;

public class Sample10 {

	public static void main(String[] args) {
		String legacyKey = LagacyUtill.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s입니다.\n\n", legacyKey);

		// 5개의 임의의 키값을 가져와서 데이터를 처리한다.
		for (int i = 0; i < 5; i++) {
			String key = NewUtill.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s입니다.%n", key);
		}
	}
}

class LagacyUtill {
	public static String getRandom() {
		return "" + (int) (Math.random() * 10 + 1); // 1~10까지 출력
	}
}

class NewUtill extends Util {
	public static String getRandom() {
		return "" + UUID.randomUUID(); // 1~10까지 출력
	}
}
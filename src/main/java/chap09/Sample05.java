package chap09;

public class Sample05 {

	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(30); // 30평
		System.out.printf("아파트의 면적은 %f 제곱미터입니다.", area);

	}

}

class Apartment implements ICompute {
	@Override
	public float compute(int area) {
//		pyung++; 			// error!! The final fleld ICompute.pyung cannot be assigned
		return area * pyung;
	}
}

// 인터페이스임을 구분하기 위해 앞에 'I'를 붙였고, 'abstract'는 생략가능
abstract interface ICompute {
	// 인터페이스의 멤버 변수는 'static final;로 컴파일 된다.
	float pyung = 3.3f;
	// abstract int compute(int area); 추상 메서드로 처리된다.
	float compute(int area);
}
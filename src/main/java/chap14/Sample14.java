package chap14;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <p>14장의 Sample14입니다.</p>
 * <p>Sample14 클래스에 Documented 에너테이션이 사용된 에너테이션 정보를 보여줍니다.</p>
 * @author KImMinho
 */
@Sample14Anno1
@Sample14Anno2
public class Sample14 {
	
	public static void main(String[] args) {
		char J = 74;
		char a = 97;
		char v = 118;

		System.out.printf("%c%c%c%c", J, a, v, a);
	}
	
	/**
	 * <p>생성자의 설명을 적습니다.</p>
	 * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다.</p>
	 */
	public Sample14() {}
	
	/**
	 * <p>원가를 처리합니다.</p>
	 * <p>반환값은 없습니다.</p>
	 * @since 1.0
	 */
	public void doSomething() {}
	
}

@Documented
@Target(ElementType.TYPE)
@interface Sample14Anno1 { }

@Target(ElementType.TYPE)
@interface Sample14Anno2 { }

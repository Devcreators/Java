package chap16;

import java.util.function.Function;

public class Sample23 {

	public static void main(String[] args) {
		Function<String, String> helloLambda = (name) -> HelloTo.helloTo(name);
		Function<String, String> helloStatic = HelloTo::helloTo;
		
		System.out.println(helloLambda.apply("빵형"));
		System.out.println(helloLambda.apply("파티쉐"));
	}
}

class HelloTo {
	public static String helloTo(String name) {
		return "Hello~" + name;
	}
}
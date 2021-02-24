package chap16;

import java.util.function.Supplier;

import lombok.Getter;

public class Sample27 {

	public static void main(String[] args) {
		Supplier<Name> suplier1 = () -> new Name();
		Name name1 = suplier1.get();
		System.out.println("람다식 - " + name1.getName());

		Supplier<Name> suplier2 = Name::new;
		Name name2 = suplier2.get();
		System.out.println("생성자 참조 - " + name2.getName());

	}
}

@Getter
class Name {
	private String name;

	public Name() {
		this.name = "빵형";
	}
}
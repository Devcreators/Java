package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import lombok.Getter;
import lombok.Setter;

public class Sample12 {}

@Getter
@Setter
class Person<@NullTest T> {
	private T t;
}

@Target(ElementType.TYPE_PARAMETER)
@interface NullTest { }
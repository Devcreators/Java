package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample10 {
	
	public static void main(String[] args) { }
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Sample10AnnoAnnotationType { }

@Sample10AnnoAnnotationType
@interface Sample10Anno { }
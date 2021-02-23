package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample11 { }

@Target(ElementType.PACKAGE)
@interface DontUseIt { }
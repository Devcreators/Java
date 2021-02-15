package chap08.Sample23;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
	private String color;		 // 차량 색상
	private int doors;			 // 문 수
	private String manufacturer; // 제조사
}

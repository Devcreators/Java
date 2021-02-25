package chap17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample22 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(100, 100, 61, 85, 91);
		System.out.println("평군 : " + list1.stream().collect(Collectors.averagingInt(i -> i)));
		
		List<Double> list2 = Arrays.asList(100.0, 100.8, 61.7, 85.5, 91.9);
		System.out.println("평군 : " + list2.stream().collect(Collectors.averagingDouble(i -> i)));
		
		List<Long> list3 = Arrays.asList(100L, 100L, 61L, 85L, 91L);
		System.out.println("평군 : " + list3.stream().collect(Collectors.averagingLong(i -> i)));
		
	}
}

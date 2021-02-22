package chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Sample09 {

	public static void main(String[] args) {
		int users = 14638;
		int views = 1500;
		
		System.out.println("=== Language : ko, Country : KR");
		Locale lo = new Locale("ko", "KR"); // Language : ko, Country : KR
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(lo, NumberFormat.Style.SHORT);
		System.out.println("YouTube 구독자 " + nf.format(users));
		System.out.println("Java 영상 조회수 " + nf.format(views));

		System.out.println("\n=== Locale.KOREA");
		lo = Locale.KOREA; // Language : ko, Country : KR
		nf = CompactNumberFormat.getCompactNumberInstance(lo, NumberFormat.Style.SHORT);
		System.out.println("YouTube 구독자 " + nf.format(users));
		System.out.println("Java 영상 조회수 " + nf.format(views));

		System.out.println("\n=== Language : en, Country : US");
		lo = new Locale("en", "US"); // Language : en, Country : US
		nf = CompactNumberFormat.getCompactNumberInstance(lo, NumberFormat.Style.SHORT);
		System.out.println("YouTube 구독자 " + nf.format(users));
		System.out.println("Java 영상 조회수 " + nf.format(views));
		
		System.out.println("\n=== Locale.US");
		lo = Locale.US; // Language : en, Country : US
		nf = CompactNumberFormat.getCompactNumberInstance(lo, NumberFormat.Style.SHORT);
		System.out.println("YouTube 구독자 " + nf.format(users));
		System.out.println("Java 영상 조회수 " + nf.format(views));
		
	}

}

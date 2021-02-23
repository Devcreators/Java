package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample09 {

	public static void main(String[] args) {
		String str = "닭아 닭아 우지 마라 네가 울면 날이 새고 날이 새면 나 죽는다.";
		String ret = "";
		int startInd = 0;
		
		Pattern pattern = Pattern.compile("새");
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			ret += str.substring(startInd, matcher.start())
					+ "[" + matcher.group() + "]";
			startInd = matcher.end();	// 마지막 문자열 위치를 기억한다.
		}
		
		// 마지막 검색 이후의 문자열을 더한다.
		if(startInd < str.length()) {
			ret += str.substring(startInd);
		}
		
		System.out.println(str);
		System.out.println(ret);
	}
}

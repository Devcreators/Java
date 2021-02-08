package chap02;

public class Sample10 {
	public static void main(String[] args) {
		String a1 = "1234";
		char[] a2 = a1.toCharArray(); // 문자열을 문자배열로 변환
		
		char b1 = 'a';
		String b2 = String.valueOf(b1);
		String b3 = "" + b1;
		
		System.out.println("String to CharArray :: " + a2);
	}

}

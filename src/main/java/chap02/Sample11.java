package chap02;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println("입력한 값 : " + in.toUpperCase().trim());
		System.out.println("입력한 값 : " + in.toUpperCase().trim().length());
		sc.close();
	}
}

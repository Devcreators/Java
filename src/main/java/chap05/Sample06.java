package chap05;

import java.util.Arrays;

public class Sample06 {

	public static void main(String[] args) {
		String names = " 빵형 | 상도 | 타노스 | 인호 | 학건 ";
		String[] array = names.split("\\|");
		System.out.println("| " + Arrays.toString(array));

		String names1 = " 빵형 & 상도 & 타노스 & 인호 & 학건 ";
		String[] array1 = names1.split("\\&");
		System.out.println("& " + Arrays.toString(array1));

		String names2 = " 빵형 * 상도 * 타노스 * 인호 * 학건 ";
		String[] array2 = names2.split("\\*");
		System.out.println("* " + Arrays.toString(array2));

		String names3 = " 빵형 = 상도 = 타노스 = 인호 = 학건 ";
		String[] array3 = names3.split("\\=");
		System.out.println("= " + Arrays.toString(array3));

		String names4 = " 빵형 + 상도 + 타노스 + 인호 + 학건 ";
		String[] array4 = names4.split("\\+");
		System.out.println("+ " + Arrays.toString(array4));

		String names5 = " 빵형 ^ 상도 ^ 타노스 ^ 인호 ^ 학건 ";
		String[] array5 = names5.split("\\^");
		System.out.println("^ " + Arrays.toString(array5));

		String names6 = " 빵형 - 상도 - 타노스 - 인호 - 학건 ";
		String[] array6 = names6.split("\\-");
		System.out.println("- " + Arrays.toString(array6));
	}

}

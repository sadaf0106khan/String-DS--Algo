package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string ");
		String str1 = sc.next();
		System.out.println("Enter a second string ");
		String str2 = sc.next();
		System.out.println(isAnagram(str1, str2));

	}

	public static boolean isAnagram(String s1, String s2) {
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (!Arrays.equals(a, b))
			return false;

		return true;
	}
}

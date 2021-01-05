package string;

import java.util.Scanner;

public class CountGivenCharacterFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.next();
		System.out.println("Enter a character that you want to count ");
		char ch = sc.next().charAt(0);
		countGivenChar(str, ch);
	}

	public static void countGivenChar(String str, char ch) {
		int i = 0, count = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (ch == c) {
				count++;
			}
			i++;
		}
		System.out.println("frequency of given character '" + ch + "' in string is " + count);
	}
}

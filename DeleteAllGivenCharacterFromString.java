package string;

import java.io.IOException;
import java.util.Scanner;

public class DeleteAllGivenCharacterFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.next();
		System.out.println("Enter a character that you want to remove ");
		char ch = sc.next().charAt(0);
		String ans = deleteAll(str, ch);
		System.out.println(ans);
	}

	public static String deleteAll(String str, char ch) {
		String ans = "";
		int i = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (ch != c) {
				ans += str.charAt(i);
				i++;
			} else {
				i++;
			}
		}
		return ans;
	}
}

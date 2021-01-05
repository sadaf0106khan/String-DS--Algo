package string;

import java.util.Scanner;

public class CountHighestFrequencyCharInString {
	public static char ch;

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string ");
//		String str = sc.next();
		String str = "cagacaaacaccccdfgggvggh";
		highestFrequencyChar(str);
	}

	public static void highestFrequencyChar(String str1) {
		String str = str1.toLowerCase();
		int highvalue = 0, count = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			int j = 0;
			// for(int j=0;j<str.length();j++)
			while (j < str.length()) {
				if (str.charAt(j) == i) {
					count++;
				}
				j++;
			}
			if (count > highvalue) {
				highvalue = count;
				ch = i;
			}
			count = 0;
		}
		System.out.print(ch + " " + highvalue);
	}
}

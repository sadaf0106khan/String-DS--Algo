package string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramWithoutUsingSort {

	static int[] c = new int[256];
	// Arrays.fill(c,0);
	static int[] d = new int[256];

	// Arrays.fill(d,0);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string ");
		char[] str1 = sc.next().toCharArray();
		System.out.println("Enter a second string ");
		char[] str2 = sc.next().toCharArray();
		System.out.println(isAnagram(str1, str2));
	}

	public static boolean isAnagram(char[] s1, char[] s2) {
		// int[] c = new int[256];
		// Arrays.fill(c,0);
		// int[] d = new int[256];

		// Arrays.fill(d,0);
		for (int i = 0; i < s1.length && i < s2.length; i++) {
			c[s1[i]]++;
			d[s2[i]]++;
		}
		if (s1.length != s2.length)
			return false;
		else {
			for (int i = 0; i < c.length; i++) {
				if (c[i] != d[i])
					return false;
			}
		}

		return true;
	}
}

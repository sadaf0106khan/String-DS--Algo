package string;

public class ReverseStringByWord {

	public static void main(String[] args) {
		String str = "   i             uday      veer   singh                 ";
		// String str2=reversedStringByWord(str);
		// reversedStringByWord(str);
		System.out.println();
		System.out.println("******************");
		System.out.println("2nd method without using library functions");
		String ans = reverseWord(str);
		System.out.println(ans);
	}

	// input ->> uday veer singh

	// out put->> singh veer uday

	/*
	 * constraint->> 1->>> if string having leading and ending multiple spaces 2->>>
	 * if string having multiple spaces between words
	 */
	/*
	 * ************************************* when constraint not giving 1--method
	 * using inbuilt functions like split() is used for breaking a string into
	 * string array if string having single space between words and trim() method is
	 * used for removing leading and ending multiple spaces
	 */
	public static void reversedStringByWord(String str) {
		String[] string = str.trim().split(" ");
		String[] string2 = new String[string.length];
		int k = 0;
		for (int i = string.length - 1; i >= 0; i--) {
			string2[k] = string[i];
			k++;
		}
		for (int i = 0; i < string2.length; i++) {
			System.out.print(string2[i] + " ");
		}
	}

	public static String reverseWord(String str) {
		// having multiple space b/w words
		// with
		// uday veer singh
		String ans = "";
		int i = str.length() - 1;
		while (i >= 0) {
			while (i >= 0 && str.charAt(i) == ' ') {
				i--;
			}
			int j = i;
			while (i >= 0 && str.charAt(i) != ' ') {
				i--;
			}
			if (ans.length() == 0) {
				ans += str.substring(i + 1, j + 1);
			} else {
				ans += " " + str.substring(i + 1, j + 1);
			}
		}
		return ans;

	}
}

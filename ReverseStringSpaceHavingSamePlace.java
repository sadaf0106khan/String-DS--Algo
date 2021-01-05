package string;

public class ReverseStringSpaceHavingSamePlace {
	public static void main(String[] args) {
		String str = "uday veer singh";
		String str2 = reversedString(str);
		System.out.println(str2);
	}

	// uday veer singh
	public static String reversedString(String str) {
		String str2 = "", str3 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ')
				str2 += str.charAt(i);
		}
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str3 += ' ';
			} else {
				str3 += str2.charAt(j);
				j++;
			}

		}

		return str3;
	}
}

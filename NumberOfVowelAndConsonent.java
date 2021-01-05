package string;

public class NumberOfVowelAndConsonent {

	public static void main(String[] args) {
		String str = "!Uday@veer   &$singh";
		vowelAndConsonent(str);
	}

	public static void vowelAndConsonent(String str1) {
		String str = str1.toLowerCase();
		int i = 0, con = 0, vow = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (c >= 96 && c <= 122) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vow++;
				} else
					con++;
			}
			i++;
		}
		System.out.println("number of vowels in given string is :" + vow);
		System.out.println("number of consonents in given string is :" + con);
	}

}

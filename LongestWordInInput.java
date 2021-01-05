package string;

public class LongestWordInInput {
	public static void main(String[] args) {
		String str = "i love java programming";
		System.out.println(longestWord(str));
	}

	public static String longestWord(String str) {
		String ans = "";
		String word = "";
		str += ' ';
		int i = 0;
		int longest = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			word += c;
			if (str.charAt(i + 1) == ' ') {
				if (word.length() > longest) {
					ans = new String(word);
					longest = word.length();
				}
				word = "";
				i++;
			}
			i++;
		}
		return ans;
	}
}

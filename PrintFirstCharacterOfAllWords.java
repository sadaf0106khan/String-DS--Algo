package string;

public class PrintFirstCharacterOfAllWords {
	public static void main(String[] args) {
		String str = "uday veer singh";
		System.out.println(firstCharacter(str));
	}

	public static String firstCharacter(String str) {
		String ans = "";
		int i = 0;
		while (i < str.length() - 1) {
			while (i < str.length() - 1 && str.charAt(i) == ' ') {
				i++;
			}
			int j = i;
			while (i < str.length() - 1 && str.charAt(i) != ' ') {
				i++;
			}
			ans += str.charAt(j);
		}
		return ans;
	}
}

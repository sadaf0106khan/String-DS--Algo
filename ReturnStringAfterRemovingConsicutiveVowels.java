package string;

public class ReturnStringAfterRemovingConsicutiveVowels {
	public static void main(String[] args) {
		//String str = "your article is in queue";
		String str="your hatei and waar";
		String ans = removingConsicutiveVowels(str);
		System.out.println(ans);
}
	public static String removingConsicutiveVowels(String str) {
		String ans = "";
		int i = 0, count = 0;
		while (i < str.length()) {
			// your article is in queue
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' 
					|| str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				int j = i;
				count++;
				if (count == 1) {
					ans += str.charAt(j);
				}
				i++;

			} else {

				ans += str.charAt(i);
				i++;
				count = 0;
			}
		}
		return ans;
	}
}

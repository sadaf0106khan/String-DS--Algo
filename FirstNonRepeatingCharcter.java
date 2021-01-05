package string;

public class FirstNonRepeatingCharcter {
	public static void main(String[] args) {
		String str = "aabcixxcbznip";
		firstNonRepeating(str);
	}

	public static void firstNonRepeating(String str1) {
		String str = str1.toLowerCase();
		int len=str.length();
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			int j;
			for(j=0;j<len;j++) {
				char d=str.charAt(j);
				if(c==d&&i!=j) {
					break;
				}
			}
			if(j==len) {
				System.out.println(c);
				break;
			}
		}
	}
}

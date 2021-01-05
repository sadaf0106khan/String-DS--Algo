package string;

public class LongestPlaindromicString {

	
	
	public static String longestPlaindromic(String str) {
		String ans="";
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			char c=str.charAt(i);
			char d=str.charAt(j);
			if(c!=d) {
				j--;
			}else {
				i++;j--;
			}
				
		}
		
		
		return ans;
	}
}

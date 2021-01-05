package string;

public class ReverseEachWordAtPlace {

	public static void main(String[] args) {
		String str="    uday       veer singh     ";
		System.out.println(reverseEachWordAtPlace(str));
	}
	
	public static String reverseEachWordAtPlace(String str) {
		int i=0;
		String ans="";
		while(i<str.length()) {
		while(i<str.length()&&str.charAt(i)==' ')
			i++;
		int j=i;
		while(i<str.length()&&str.charAt(i)!=' ')
			i++;
		
			for( int k=i-1;k>=j;k--) {
				ans+=str.charAt(k);
			}
			ans+=" ";
		}
		return ans;
	}
}

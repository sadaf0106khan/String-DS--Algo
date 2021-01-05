package string;
//put @ at all spaces in given string
public class PutSpecialCharacterAtAllSpacesInGivenString {
public static void main(String[] args) {
	String str=" uday veer singh ";
	String ans=putAtSpaces(str);
	System.out.println(ans);
}
	public static String putAtSpaces(String str) {
		String ans="";
		char i=0;
		while(i<str.length()) {
			char c=str.charAt(i);
			if(c!=' ') {
				ans+=c;
				
			}else {
				ans+='@';
			}
			i++;
		}
		return ans;
	}
}

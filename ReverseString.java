package string;

public class ReverseString {
public static void main(String[] args) {
	String str="uday veer singh";
	String str2=reverseString(str);
	String str3=reverseStringHavingNoSpace(str);
	System.out.println(str2);
	System.out.println("**************************");
	System.out.println("reversed string having no space between words :");
	System.out.println(str3);
}
	public static String reverseString(String str) {
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		return str2;
	}
	
	public static String reverseStringHavingNoSpace(String str) {
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
			str2+=str.charAt(i);
			}
		}
		return str2;
	}
}
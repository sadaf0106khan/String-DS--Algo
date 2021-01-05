package string;

public class ReverseStringhUsingRecurrsion {
public static void main(String[] args) {
	String str="udayveersingh";
	System.out.println(reversedString(str));
}
	
	public static String reversedString(String str) {
		if(str.length()==0) {
			return str;
		}
		return reversedString(str.substring(1))+str.charAt(0);
	}
}

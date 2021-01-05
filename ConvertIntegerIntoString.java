package string;

public class ConvertIntegerIntoString {
public static void main(String[] args) {
	int n=123;
	String str=convertInteger(n);
	System.out.println(str);
}
	
	
	public static String convertInteger(int number) {
		String str=Integer.toString(number);
		return str;
	}
	//convert string to integer
	
	
}

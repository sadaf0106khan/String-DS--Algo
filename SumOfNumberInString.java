package string;

public class SumOfNumberInString {

public static void main(String[] args) {
	String str="123avgd33";

	System.out.println(sum(str));
}
public static int sum(String str) {
	String temp="";
	int i=0;
	int sum=0;
	while(i<str.length()) {
		char c=str.charAt(i);
		if(Character.isDigit(c)) {
			temp+=c;
		}
		else {
			sum=sum+Integer.parseInt(temp);
			temp="0";
		}
		
		i++;
	}
	return sum+Integer.parseInt(temp);
}
}

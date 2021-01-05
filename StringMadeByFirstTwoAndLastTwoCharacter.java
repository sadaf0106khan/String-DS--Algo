package string;

public class StringMadeByFirstTwoAndLastTwoCharacter {
public static void main(String[] args) {
	String str="udayveersingh";
	System.out.println(firstAndLadTwoChar(str));
}
public static String firstAndLadTwoChar(String str) {
	 String ans="";
	 
	 if(str.length()<2) {
		 System.out.println("please enter valid string");
	 }
	 
	 else if(str.length()==2)
		 return str;
	 else {
	 ans+=(str.charAt(0));
	 ans+=(str.charAt(1));
	 ans+=(str.charAt(str.length()-2));
	 ans+=(str.charAt(str.length()-1));
	 }
	 return ans;
}
}

package string;

import java.util.Scanner;

public class Plaindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A string");
	String str=sc.nextLine();
	System.out.println(isplaindrome(str));
}
public static boolean isplaindrome(String str) {
	int i=0;
	int j=str.length()-1;
	while(i<j) {
		
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		
		i++;j--;
	}
	return true;
}
}

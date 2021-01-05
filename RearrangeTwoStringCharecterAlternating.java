package string;

import java.util.Scanner;

public class RearrangeTwoStringCharecterAlternating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string ");
		String str1=sc.next();
		System.out.println("Enter a second string ");
		String str2=sc.next();
//		String str1="udayveer";
//		String str2="singh";
		String ans=arrangeStrings(str1,str2);
		System.out.println(ans);
	}
	public static String arrangeStrings(String str1,String str2) {
		int len1=str1.length();
		int len2=str2.length();
		int i=0, j=0;
		String result="";
		int k=0;
		while(i<len1&&j<len2) {
			result+=str1.charAt(i);
			i++;
			result+=str2.charAt(j);
			j++;
		}
		
		//if you want to pul left charactr of any onr of them string then uncomment following parts
		
//		if(i==len1) {
//			while(j<len2) {
//				result+=str2.charAt(j);
//				j++;	
//			}
//		}
//		if(j==len2) {
//			while(i<len1) {
//				result+=str1.charAt(i);
//				i++;
//			}
//		}
		return result;
	}

}

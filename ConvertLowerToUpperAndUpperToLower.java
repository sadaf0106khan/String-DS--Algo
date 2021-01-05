import java.util.*;

public class ConvertLowerToUpperAndUpperToLower {
 public static void main(String[] args) {
	String str="UdAy VEer Singh";
	String ans=convert(str);
	System.out.println(ans);
}
 public static String convert(String str) {
	 String ans="";
	 int i=0;
	 while(i<str.length()) {
		 char c=str.charAt(i);
		 if(c==' ') {
			 ans+=" ";
		 }
		 if(c>='A'&&c<='Z') {
			 c=(char)(c+32);
			 ans+=c;
			// System.out.println(ans);
		 }
		 else if(c>='a'&&c<='z') {
			 c=(char)(c-32);
			 ans+=c;
			 
		 }
		 i++;
	 }
	 return ans;
 }
}



public class ConvertGivenStringInToCamelCase {
public static void main(String[] args) {
	String str="sadaf khan Aleem";
	System.out.println(camelCase(str));
}
public static String camelCase(String str1) {
	String str=str1.toLowerCase();
	String ans="";
	ans+=str.charAt(0);
	int i=1;
	while(i<str.length()) {
		char c=str.charAt(i);
		if(c!=' ') {
			ans+=c;
		}else {
			char ch=str.charAt(i+1);
		ch=(char)(ch-32);
		ans+=ch;
		i++;
		}
		i++;
	}
	return ans;
}
}

package string;

public class FirstRepeatingCharcter {
public static void main(String[] args) {
	String str="zxabchgfvghjvgghdetrvlohn";
			//ans = b
	repeatingCharacter(str);
}
public static void repeatingCharacter(String str1) {
	String str=str1.toLowerCase();
	int i=0;
	int count=0,count2=0;
	while(i<str.length()) {
		char c=str.charAt(i);
		int j=i+1;
		while(j<str.length()) {
			char d=str.charAt(j);
			if(c==d) {
				count++;
				if(count==1) {
					break;
				}
			}
			j++;
		}
		if(count==1) {
			System.out.println(c);
			break;
			}
		i++;
	}
	//using for loop
	for(int k=0;k<str.length()-1;k++) {
		for(int j=k+1;j<str.length();j++) {
			if(str.charAt(k)==str.charAt(j)) {
				count2++;
				if(count==1) {
					break;
				}
				
			}
		}
		if(count2==1) {
			System.out.println(str.charAt(k));
			break;
		}
	}
	
}
}

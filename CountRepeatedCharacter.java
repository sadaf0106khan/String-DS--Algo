package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CountRepeatedCharacter {
public static void main(String[] args) {
	String str="udayveersingh";
	countCharacter(str);
}
private static void countCharacter(String str) {
	int count=0;
	for(char i='a';i<='z';i++) {
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==i) {
				count++;
			}
		}
		if(count!=0) {
			System.out.format("%c%d ",i,count);
			
		}
		
		count=0;
	}
}
}

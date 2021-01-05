package string;

public class Panagram {
	public static void main(String[] args) {
		//String str="the quick brown fox jumps over a lazy dog";
		String str="abcdefghijklmnopqrstuvwxyzfghfghsjy";
		System.out.println(isPanagram(str));
	}

	public static boolean isPanagram(String str1) {
		String str = str1.toLowerCase();
		int index=0;
		boolean [] mark=new boolean[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				index=str.charAt(i)-'a';
			}
			mark[index]=true;
		}
		for(int i=0;i<26;i++)
		if(mark[i]==false)
			return false;
		
		return true;
		
	}
}

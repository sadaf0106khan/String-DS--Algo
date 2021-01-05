package string;

public class FindLengthWithoutUsingFunction {
	static char i;
	public static void main(String[] args) {
		String str="Uday veer singh";;
		
		System.out.println(length(str));
	}
	public static int length(String str) {
		int count=0;
		for(char c:str.toCharArray()) {
			count++;
		}
		return count;
	}
}

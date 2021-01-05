package string;

public class SumOfDigitInString {
	public static void main(String[] args) {
		String str = "1263a0b1c332";
		System.out.println(sumOfDigit(str));
	}

	public static int sumOfDigit(String str) {
		int sum = 0;
		int i = 0;
		while (i < str.length()) {
			int c = str.charAt(i);
			if (c >= 48 && c <= 57) {
				c = c - 48;
				sum += c;
			}
			i++;
		}
		return sum;
	}
}

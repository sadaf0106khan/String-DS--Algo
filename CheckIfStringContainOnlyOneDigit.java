package string;

public class CheckIfStringContainOnlyOneDigit {

	public static void main(String[] args) {
		String str = "3ud4ayveer";

		System.out.println(checkIfStringContainOnlyOneDigit(str));

	}

	public static boolean checkIfStringContainOnlyOneDigit(String str) {
		int i = 0, count = 0;
		while (i < str.length()) {
//			if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3'
//					|| str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7'
//					|| str.charAt(i) == '8' || str.charAt(i) == '9') {
//				count++;
//			}
			for(char j='0';j<='9';j++) {
				if(str.charAt(i)==j)
					count++;
			}
			i++;
		}
		if (count != 1)
			return false;

		return true;
	}
}

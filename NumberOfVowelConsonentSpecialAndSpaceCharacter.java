package string;

public class NumberOfVowelConsonentSpecialAndSpaceCharacter {
	public static void main(String[] args) {
		String str = " !Ud23 2ay4@@vee r&$sing%5h ";
		countAll(str);
	}

	public static void countAll(String str1) {
		String str=str1.toLowerCase();
		int i = 0, vow = 0, con = 0, spc = 0, dig = 0, sps = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			
			if(c>=96&&c<=122) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vow++;
				} else {
					con++;
				}	
			}
			else if (c >= 33 && c <= 38 || c == 64) {
				spc++;
			}
			else if (c >= 48 && c <= 57) {
				dig++;
			}
			else if (c == 32) {
				sps++;
			}
			
			i++;
		}
		System.out.println("Number of special character " + spc);
		System.out.println("Number of digits " + dig);
		System.out.println("Number of spaces " + sps);
		System.out.println("Number of vowels " + vow);
		System.out.println("Number of consonent " + con);

	}

}

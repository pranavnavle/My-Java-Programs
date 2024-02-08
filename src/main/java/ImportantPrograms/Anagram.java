package ImportantPrograms;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "race", str2 = "care";
		int cnt = 0;
		boolean str;
		for (int i = 0; i <= str1.length() - 1; i++) {
			for (int j = 0; j <= str2.length() - 1; j++) {
				str = str1.charAt(i) == str2.charAt(j);
				if (str == true) {
					cnt++;
				}
			}

		}
		if (str1.length() == cnt) {
			System.out.println("its Anagram");
		} else
			System.out.println("Not Anagram");
	}

}

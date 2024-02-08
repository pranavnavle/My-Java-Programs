package ImportantPrograms;

public class AnagramString {

	public static void main(String[] args) {
		String str = "Race", str1 = "Care";
		int cnt = 0;
		str.toUpperCase();
		str1.toUpperCase();

		for (int i = 0; i <= str.length()-1; i++) {
			for (int j = 0; j <= str1.length()-1 ; j++) {
				if (str.toUpperCase().charAt(i) == str1.toUpperCase().charAt(j))
					cnt++;
			}
		}
		if (str.length() == cnt) {
			System.out.println("Its Anagram");
		} else
			System.out.println("Not Anagram");
	}

}

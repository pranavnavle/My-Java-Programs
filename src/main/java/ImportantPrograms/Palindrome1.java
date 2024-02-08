package ImportantPrograms;

public class Palindrome1 {

	public static void main(String[] args) {

		String str = "MADAM";
		String revstr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (revstr.equalsIgnoreCase(str)) {
			System.out.println("The given String is Palinmdrome");

		} else
			System.out.println("The given String is not Palindrome");
	}

}

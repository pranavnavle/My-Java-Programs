package ImportantPrograms;

public class Palindrome {

	public static void main(String[] args) {
		 String str = "NITIN";
		String  revStr = "";
		
		for (int i=str.length()-1;i>=0;i--) {
			revStr = revStr + (str.charAt(i));
		}
		if(revStr.equalsIgnoreCase(str)) {
			System.out.println("String is palimndrome");
		}else
			System.out.println("String is not palindrome ");
	}

}

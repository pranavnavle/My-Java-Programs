package ImportantPrograms;

public class SplitToken {

	public static void main(String[] args) {
		String str = "Java is awesome,And we are learning since from year";
		String[] Tokens = str.split(" ");
		for (String s : Tokens) {
			System.out.print(s);
		}

	}

}

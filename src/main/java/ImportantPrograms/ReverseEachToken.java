package ImportantPrograms;

public class ReverseEachToken {

	public static void main(String[] args) {

		String str = "Swapnil Bobade";
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++)
		{
			String s1 = arr[i];
			for (int j = s1.length() - 1; j >= 0; j--) 
			{
				String r = "" + s1.charAt(j);
				System.out.print(r);
			}
			System.out.print(" ");
		}
	}

	}



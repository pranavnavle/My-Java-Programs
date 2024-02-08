package ImportantPrograms;

public class FindSmallNo {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 5, 40, 30, 1 };
		int small = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {

			small = arr[i];
			if (small < arr[i])
				
			small = arr[i];
		}
		System.out.println(small);
	}

}

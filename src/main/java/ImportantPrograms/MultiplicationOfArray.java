package ImportantPrograms;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		int Product = 1;
		int[] arr = { 1, 2, 3};

		for (int i = 0; i <= arr.length - 1; i++) {
			Product = Product * arr[i];
		}

		System.out.println(Product);

	}
}

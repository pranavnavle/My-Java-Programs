package ImportantPrograms;

public class PerfectNo {

	public static void main(String[] args) {

		int no = 28, sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0)
				sum = sum + i;
		}
		if (sum == no) {
			System.out.println("its perfect no = " + no);
		} else
			System.out.println("its not perfect = " + no);

	}
}
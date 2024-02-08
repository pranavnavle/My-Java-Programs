package ImportantPrograms;

public class FindMaxNoArray {

	public static void main(String[] args) {
		int max=0;
		int[] arr = {10,50,60,5,4,1};
		
		for(int i =0;i<=arr.length-1;i++) {
		  if (arr[i]> max)
			  max= arr[i];
		}
		System.out.println(max);
	}

}

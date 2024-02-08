package ImportantPrograms;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
int[]arr= {20,40,10,50,100,30};
		
		//Arrays.stream(arr).sorted((x, y) -> Integer.compare(x, y) == -1));
		//Arrays.stream(arr).sorted((x, y) -> Integer.compare(x, y) == -1);
Arrays.stream(arr)
.mapToLong(x->x)
.sorted()
.toArray();
	}

}

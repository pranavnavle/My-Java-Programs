package ImportantPrograms;

public class ReverseToken {

	public static void main(String[] args) {

		 String str = "Pranav Navale";
		 String[] arr= str.split(" ");
		 
		 for (int i= arr.length-1;i>=0;i--) {
			 System.out.print(arr[i] + ",");
			 
		 }
		
	}
	

}

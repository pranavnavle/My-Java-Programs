package ImportantPrograms;

public class PrimeNo {

	public static void main(String[] args) {

		int no = 17, i=2;
		for(i= 2;i<=no;i++) {
			if(no%i==0)
				 break;
		}
		if(no==i) {
			System.out.println("Its Prime Number =" + i);
		}
		else
			System.out.println("Its not prime number =" + i);
		}
	}



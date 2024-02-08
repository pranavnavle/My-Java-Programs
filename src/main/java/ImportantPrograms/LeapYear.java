package ImportantPrograms;

public class LeapYear {

	public static void main(String[] args) {
 int year= 2020;
 
	//	if (year % 4==0 && year % 100 != 0)  ( year % 400 == 0)
		if(year % 4 == 0) // || (year % 100 !=0 && year % 400 == 0)
		{
			System.out.println("It is leap year = "+ year);
		}else
			System.out.println("it is not leap year");
		
	}

}

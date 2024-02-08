package Demo;

public class ReverseString {

	public static void main(String[] args) {
  String a = "Pranav", rstr="";
	char ch;	
for(int i=0;i<=a.length();i++) {
	ch=a.charAt(i);
	rstr= ch+rstr;
}
	System.out.println("Reverse String"+ rstr);

	}

}

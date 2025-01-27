import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the year--->");
		int n = s2.nextInt();

		String year = n%4 == 0 ? "Leap Year" : "Not a Leap Year" ;
		System.out.println(n+" is " +year);
	}
}
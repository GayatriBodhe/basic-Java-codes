import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.:");
		n = sc.nextInt();
		int i;
		for(i = 2; i < n; i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a Prime no.");
				break;
			}
		}
		if(i==n)
		{
			System.out.println("Prime no");
		}
}
}

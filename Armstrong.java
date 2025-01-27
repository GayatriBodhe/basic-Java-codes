import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int n, sum = 0, temp, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.:");
		n = sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n = n/10;
		}
		if (temp==sum)
			System.out.println("Yes");
		else
			System.out.println("No.");
	}
}
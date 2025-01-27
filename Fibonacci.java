import java.util.*;
class Fibonacci
{
  public static void main(String[] args)
  {
    int n, a=0,b=1,c;
    Scanner s5= new Scanner(System.in);
    System.out.println("Enter no.");
    n=s5.nextInt();
    int i=2;
	while(i<n)
	{
		c = a + b;
		System.out.println(c);
		a=b;
		b=c;
		i++;
	}
  }
}
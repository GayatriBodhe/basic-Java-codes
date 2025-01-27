import java.util.*;
class GCD
{
  public static void main(String[] args)
  {
    int n1, n2;
    Scanner s5= new Scanner(System.in);
    System.out.println("Enter the 2 no.s for GCD");
    n1=s5.nextInt();
    n2=s5.nextInt();

    // initially set to gcd
    int gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {

      // check if i perfectly divides both n1 and n2
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
  }
}
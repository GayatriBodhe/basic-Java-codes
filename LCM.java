import java.util.*;
class LCM
{
  public static void main(String[] args)
  {
    int n1 , n2 , lcm;
    Scanner s6 = new Scanner(System.in);
    System.out.println("Enter 2 no. for LCM");
    n1= s6.nextInt();
    n2 = s6.nextInt();
                                         // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;
                                         // Always true
    while(true)
    {
      if( lcm % n1 == 0 && lcm % n2 == 0 )
      {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
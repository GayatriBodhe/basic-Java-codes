import java.util.*;
class Factors
{
      public static void main(String[] args)
      {
      int num;
      Scanner s3 = new Scanner(System.in);
      System.out.println("Enter the no.--->");
      num = s3.nextInt();
      System.out.println( "Factors of " +num+"  are " );

     // finding and printing factors b/w 1 to num
     for(int i = 1; i <= num; i++)
     {
         if(num % i == 0)
             System.out.println(i + " ");
     }
 }
}
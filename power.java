import java.util.*;
class power
{
  public static void main(String[] args)
  {
    int x, y;
    Scanner s5= new Scanner(System.in);
    System.out.println("the x to the power y is-->");
     int i=1, ans=1;
    while(i <= y)
    {
    	ans =ans * x;
    	i++;
    }
    System.out.println(ans);
   }
  }
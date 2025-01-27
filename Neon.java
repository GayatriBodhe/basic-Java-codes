import java.util.*;
class Neon
{
public static void main(String args[])
{
int sum = 0, n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to check: ");
n = sc.nextInt();
//calculate square of the given number
int sq = n * n;
//loop executes until the condition becomes false
while(sq != 0)
{
//find the last digit of the square
int digit = sq % 10;
//adds digits to the variable sum
sum = sum + digit;
//removes the last digit of the variable square
sq = sq / 10;
}
//compares the given number (n) with sum
if(n == sum)
System.out.println(n + " is a Neon Number.");
else
System.out.println(n + " is not a Neon Number.");
}
}
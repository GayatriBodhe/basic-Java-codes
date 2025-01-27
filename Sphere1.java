import java.util.*;
class Sphere1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Double r, area, vol;
		final float pi=3.14; 
		System.out.println("Enter the radius of sphere:");
		r = sc.nextDouble();
		area = 4*pi*(r*r);
		vol=(4/3)*pi*(r*r*r);
		System.out.println("Surface Area of Sphere:"+area);
		System.out.println("Volume of Sphere: "+vol);
	}
}
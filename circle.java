import java.util.Scanner;
class circle
{
	public static void main(String args[])
	{
		double r,area,perimeter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radious of circle");
		r=sc.nextFloat();
		area=3.14*r*r;
		perimeter=2*3.14*r;
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
	}
}

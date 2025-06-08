import java.util.Scanner;
class smallest
{
        public static void main(String args [])
        {
                int a,b,c;
                Scanner sc=new Scanner(System.in);
                System.out.println("ENTER THREE NUMBERS");
                a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
                if(a<b && b<c)
			System.out.println("The Smallest number is="+a);
		else if(b<a && b<c)
			System.out.println("The Smallest number is="+b);
		else
			System.out.println("The Smallest number is="+c);
	}
}

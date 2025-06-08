import java.util.Scanner;
class cm_into_inch
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double inch,cm;
  System.out.println("Enter a Distance in Inch: ");
  inch=sc.nextDouble();

  cm=(inch*2.54);
  System.out.println("Distance in cm is: "+cm+"cm");

 }
}

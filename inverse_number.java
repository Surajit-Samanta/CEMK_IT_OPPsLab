import java.util.Scanner;
class inverse_number
{
public static void main(String args[])
{
int num,reverse=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
num = sc.nextInt();
while(num !=0)
{
int remainder=num % 10;
reverse = reverse*10+remainder;
num = num/10;
}
System.out.println("The reverse number is : "+reverse);
}
}

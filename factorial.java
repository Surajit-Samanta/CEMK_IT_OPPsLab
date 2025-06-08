import java.utill.Scanner;
class factorial
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
n=sc.nextInt();
int f1=fact_loop(n);
factorial f=new factorial();
int f2=f.fact_rec(n);
System.out.println("Factorial using without recursive:"+f1);
System.out.println("Factorial using recursion: "+f2);
}


static int fact_loop(int n)
{
int i,fact=1;
for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}

static int fact_rec(int n)
{
	if(n==1)
		return 1;
	else

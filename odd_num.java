import java.util.Scanner;
class odd_num
{
        public static void main(String args [])
        {
                int n,sum=0;
		Scanner sc=new Scanner(System.in);
                System.out.println("ENTER AN ODD NUMBERS");
                n= sc.nextInt();
                if(n%2!=0)
		{
			for(int i=1;i<=n;i++)
				{
					if(i%3==0&&i%2!=0)
					{
						sum=sum+i;
					}
				}
				System.out.println("sum="+sum);
		}
		else
		{
			System.out.println("wrong input");
		}
        }
}

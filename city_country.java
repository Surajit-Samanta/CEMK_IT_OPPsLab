import java.util.Scanner;
class city_country
{
	public static void main(String args[])
	{
		int flag=0;
		int flag1=0;
		int i,j;
		Scanner sc=new Scanner(System.in);

		String cc[][]={{"USA","New York","Washington DC","Chicago","Boston"},
				{"India","New Delhi","Mumbai","kolkata","Chennai"},
				{"Bangladesh","Dhaka","Khulna","Pabna","Chattagram"},
              			{"Spain","Madrid"," "," "," ",},
              			{"England","Liverpool"," "," "," "}};

		System.out.println("Enter a city to be searched: ");
		String city=sc.nextLine();

		for(i=0;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(city.equalsIgnoreCase(cc[i][j]) == true)
				{
     					System.out.println(cc[i][0]);
     					flag=1;
     					break;
    				}
 			}
		}
		if(flag==0)
 		{
			System.out.println("No such city");
		}

		System.out.println("Enter a country to be searched: ");
		String country=sc.nextLine();
		for(i=0;i<=4;i++)
		{
			if(country.equalsIgnoreCase(cc[i][0]) == true)
			{
				for(j=1;j<=4;j++)
				System.out.println(cc[i][j]);
				flag1=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("No such Country");
 		}
	}


}


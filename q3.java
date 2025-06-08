import java.util.Scanner;
class date
{
	private int date;
	int month;
	int year;

	date()
	{
		date=01;
		month=01;
		year=1970;
	}

	date(int date, int month)
	{
		date=date;
		month=month;
		year=2013;
	}

	date(int date,int month,int year)
	{
		date=date;
		month=month;
		year=year;
	}

	void set_date(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	int get_date()
	{
		return date;
	}
	int get_month()
	{
		return month;
	}
	int get_month()
	{
		return year;
	}
	void Display()
	{
		System.out.println("Date is: "+get_date()+"/"+get_month()+"/"+get_year());
	}
}


class test_date

{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new scanner(String.in);
		System.out.print("Enter the date: ");
		a=sc.nextInt();
		System.out.print("Enter the month: ");
		b=sc.nextInt();
		System.out.print("Enter the year: ");
		c=sc.nextInt();

		date d1=new date();
		date d2=new date(a,b);
		date d3=new date(a,b,c);

		d1.display();
		d2.display();
		d3.display();
	}
}


class date
{
	int d,m,y;
	date(int a,int b,int c)
	{
		d=a;
		m=b;
		y=c;
	}
	String get_date()
	{
	return (d+"/"+m+"/"+y);
	}
}
class employee
{

		String name;
		int emp_id;
		date hiredate;
		double salary;
		static int c=64;

	employee(String n,date hd,double s)
	{
		name=n;
		hiredate=hd;
		salary=s;
	}
	void setid()
	{
		emp_id=++c;
	}
	void calsal()
	{
		double incr=0;
		date curr_date=new date(20,8,2024);
		int exp=curr_date.y-hiredate.y;
		if(salary<=10000)
		{
			incr=200*exp;
		}
		salary=salary+incr;
		double da=salary*0.3;
		double hra=salary*0.15;
		salary=salary+da+hra;
	}
	void display()
	{
		System.out.println("IT/23/L-"+emp_id+"\t"+name+"\t"+hiredate.get_date()+"\t"+salary);
	}
}

class emp_test
{
	public static void main(String args[])
	{
		date d1=new date(30,7,2003);
		employee e1=new employee("Akash Pal",d1,5000);
		e1.setid();
		e1.calsal();
		date d2=new date(06,8,2002);
		employee e2=new employee("Ashok Barman",d2,8000);
		e2.setid();
		e2.calsal();
		date d3=new date(13,8,2002);
		employee e3=new employee("Techno Kunti",d3,6000);
		e3.setid();
		e3.calsal();
		date d4=new date(20,8,2003);
		employee e4=new employee("Sujit Kumar",d4,5000);
		e4.setid();
		e4.calsal();
		System.out.println("Employee\nid\t\tName\t\tHiredate\tSalay");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
}

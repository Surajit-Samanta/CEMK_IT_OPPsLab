class student
{
	String name;
	int roll_no;
	double marks;
	
	student(String n,int roll,double m)
	{
	name=n;
	roll_no=roll;
	marks=m;
	}
	void display()
	{
	System.out.println("THE STUDENT NAME IS "+name+"\nROLL NO IS "+roll_no+"\nAND MARKS IS "+marks);
	}
}

class student_test
{
	public static void main(String args[])
	{
		int i,j;
		student s[]=new student[4];
		s[0]=new student("A",1,83);
		s[1]=new student("B",2,95.6);
		s[2]=new student("C",3,92);
		s[3]=new student("R",67,97.4);
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				if(s[j].marks<s[j+1].marks)
				{
					student t;
					t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		System.out.println("THE LIST OF MARKS IS:\n");
		for(i=0;i<=3;i++)
		{
			s[i].display();
		}
	}
}

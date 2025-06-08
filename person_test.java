import java.util.Date;
class person
{
        String name;
        String dept;
        String dob;
        person()
        {
                name="Surajit Samanta";
                dept="IT";
                dob="13/4/2003";
        }
        void display()
        {
                System.out.println("Name:"+name+"\nDepertment:"+dept+"\nDate of Birth:"+dob);
        }
        person(String n,String d,String b)
        {
                name=n;
                dept=d;
                dob=b;
                
        }
}
class student extends person
{
        int roll_no;
        int sem;
        double cgpa;
        student()
        {       super();
                roll_no=1;
                sem=3;
                cgpa=9.05;
}
        void display()
        {
                super.display();
                System.out.println("Roll Number:"+roll_no+"\nSemester:"+sem+"\nCGPA:"+cgpa);
        }
        student(String n,String d,String b,int rn,int s,double cg)
        {       super(n,d,b);
                roll_no=rn;
                sem=s;
                cgpa=cg;
                
        }
}
class employee extends person
{
        int empid;
        int desig;
        employee()
        {
                super();
                empid=24424;
                desig=541;
        }
        void display()
        {
                super.display();
                System.out.println("Employee ID:"+empid+"\nDesignation:"+desig);
        }
        employee(String n,String d,String b,int em,int de)
        {
                super(n,d,b);
                empid=em;
                desig=de;
      
        }
}

class person_test
{
	public static void main(String args[])
	{
		person p;
		p=new person("Techno Kunti","IT","21/01/2002");
		p.display();
		p=new student("Sujit Kumar","IT","22/02/2003",1,5,8.9);
		p.display();
		p=new employee("Astik Sutradhar","IT","22/03/1990",25,541);
		p.display();
	}   
}

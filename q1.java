class person{
	String name;
	String dept;
	String dob;
	person()
	{
		this.name="Surajit Samanta";
		this.dept="IT";
		this.dob="13/04/2003";
	}
	person(String name,String dept,String dob)
	{
		this.name=name;
		this.dept=dept;	
		this.dob=dob;
	}
	void display()
	{       System.out.println("\t\t");
		System.out.print("Name is : "+name+" ");
		System.out.print("Department is : "+dept+" ");
		System.out.print("Date of birth is : "+dob);
	}
}
class student extends person{
	int roll;
	int sem;
	double cgpa;
	student(){
		super();
		this.roll=69;
		this.sem=5;
		this.cgpa=6.89;
	}
	student(String name,String dept,String dob,int roll,int sem,double cgpa){
		super(name,dept,dob);
		this.roll=roll;
		this.sem=sem;
		this.cgpa=cgpa;
	}
	void display()
	{
		super.display();
		System.out.print("Roll : "+roll+" ");
		System.out.print("Sem is : "+sem+" ");
		System.out.print("CGPA is : "+cgpa);
	}
}
class employee extends person{
	int emp_id;
	String designation;
	employee(){
		super();
		this.emp_id=23;
		this.designation="assistance";
	}
	employee(String name,String dept,String dob,int emp_id,String designation){
		super(name,dept,dob);
		this.emp_id=emp_id;
		this.designation=designation;
	}
	void display(){
		super.display();
		System.out.print("emp id is : "+emp_id);
		System.out.print("designation is : "+designation);
	}
}
class q1{
	public static void main(String args[]){
	        student s1=new student();
	        s1.display();
		student s2=new student("Sujit Kumar","IT","23/06/2001",140,5,7.24);
		s2.display();
		employee e1=new employee("Techno Kunti","IT","17/03/2002",21,"Student\n");
		e1.display();
	}
}

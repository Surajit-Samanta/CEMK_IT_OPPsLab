class box
{
	double length,breadth,height;
	box()
	{
		length=5.0;
		breadth=4.0;
		height=3.0;
	}
	box(double s)
	{
		length=s;
		breadth=s;
		height=s;
	}
	box(double l,double b,double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	void volume()
	{
		double volume=length*breadth*height;
		System.out.println("The Volume of the box is: "+volume);
	}
}
class q1
{
	public static void main(String areg[])
	{
		box b1=new box();
		box b2=new box(15.0);
		box b3=new box(5.0,10.0,15.0);

		b1.volume();
		b2.volume();
		b3.volume();
	}
}

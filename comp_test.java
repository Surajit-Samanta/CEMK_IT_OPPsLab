class complex
{
	double a,b;
	complex(double x, double y)
	{
		a=x;
		b=y;
	}
	void add(complex c1 , complex c2)
	{
		a=c1.a+c2.a;
		b=c1.b+c2.b;
	}
	void sub(complex c1, complex c2)
	{
		a=c1.a-c2.a;
		b=c1.b-c2.b;
	}
	void multi(complex c1 , complex c2)
	{
		a=(c1.a*c2.a)-(c1.b*c2.b);
		b=(c1.a*c2.b)+(c1.b*c2.a);
	}
	void div(complex c1 , complex c2)
	{
		a=((c1.a*c2.a)+(c1.b*c2.b))/((c2.a*c2.a)+(c2.b*c2.b));
		b=((c1.a*c2.b)-(c1.b*c2.a))/((c2.a*c2.a)+(c2.b*c2.b));
	}
	void display()
	{
		System.out.println("The answer is: "+a+"+i"+b);
	}
}
class comp_test
{
	public static void main(String args[])
	{
		complex c1=new complex(40,30);
		c1.display();
		complex c2=new complex(20,10);
		c2.display();
		complex c3=new complex(0,0);
		c3.add(c1,c2);
		c3.display();
		c3.sub(c1,c2);
		c3.display();
		c3.multi(c1,c2);
		c3.display();
		c3.div(c1,c2);
		c3.display();
	}
}

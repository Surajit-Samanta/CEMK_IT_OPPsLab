abstract class Shape 
{
	protected double dim1, dim2, dim3;

	public Shape () 
	{
	dim1 = dim2 = dim3 = 0;
	}

	public Shape(double d1, double d2, double d3)
	{
	dim1 = d1;
	dim2 = d2;
	dim3 = d3;
	}

	public abstract double area();
}

class Rectangle extends Shape 
{
	public Rectangle()
	{
		super();
	}
	public Rectangle(double length, double width)
	{
		super(length, width, 0);
	}

	public double area()
	{
		return dim1 * dim2;
	}
}

class Square extends Shape
{
	public Square()
	{
		super();
	}
	public Square(double side)
	{
		return dim1 * dim1;
	}
}
final class Triangle extends Shape
{
	public Triangle()
	{
		super();
	}
	public Triangle(double base, double hight)
	{
		super(base, hight, 0);
	}
	
	public double area()
	{
		return 0.5 * dim1 * dim2;
	}
}

class Circle extends Shape
{
	public Circle()
	{
		super();
	}
	public Circle(double radius)
	{
		super(radius, 0, 0);
	}
	public double area()
	{
		return Math.PI * dim1 * dim1;
	}
}

class Sphere extends Circle
{
	public Sphere()
	{
		super();
	}
	
	public Sphere(double radius)
	{
		super(radius);
	}
	public double area()
	{
		return 4 * Math.PI *dim1 * dim1;
	}
}

class Parallelepiped extends Rectangle
{
	public Parallelepiped()
	{
		super();
	}
	public Parallelepiped(double length, double width, double hight)
	{
		super(length, width);
		this.dim3 = higth;
	}
	public double area()
	{
		return 2 * (dim1 *dim2 + dim1 * dim3 + dim2 * dim3);
	}
}
class Cube extends Square
{
	public Cube()
	{
		super();
	}
	public Cube(double side)
	{
		super(side);
		this.dim3 = side;
	}
	public double area()
	{
		return 6 * dim1 *dim1;
	}
}

public class Main
{
	public static void main(String[] args)
	{
	Shape rectangle = new Rectangle(10, 5);
	Shape Square = new Square(4);
	Shape triangle = new Triangle(5, 8);
	Shape circle = new Circle (7);
	Shape sphere = new Sphere(7);
	Shape parallelepiped = new Parallelepiped(5, 6, 7);
	Shape cube = new Cube(3);
	
	System.out.println("Rectangle area: " + rectangle.area());
	System.out.println("Square area: " + square.area());
	System.out.println("Triangle area: " + triangle.area());
	System.out.println("Circle area: " + circle.area());
	System.out.println("Sphere area: " + sphere.area());
	System.out.println("Parallelepiped area: " + parallelepiped.area());
	System.out.println("Cube area: " + cube.area());
	}
}



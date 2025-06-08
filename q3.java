abstract class Shape {
	protected double dim1, dim2, dim3;

	public Shape () {
	dim1 = dim2 = dim3 = 0;
	}

	public Shape(double d1, double d2, double d3){
	dim1 = d1;
	dim2 = d2;
	dim3 = d3;
	}

	public abstract double area();
}

class Rectangle extend Shape {
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double width){
		super(length, width, 0);
	}

	public double area(){
		return dim1 * dim2;
	}
}























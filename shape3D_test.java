import shapepack.shape3D;
class parallelopiped implements shape3D
{
double l,b,h;
parallelopiped(double l, double b, double h)
{
this.l=l;
this.b=b;
this.h=h;
}
public double calcVolume()
{
double v=l*b*h;
return v;
}
public double calcSurfaceArea()
{
double s=2*(l*b+l*h+b*h);
return s;
}
}
class shape3D_test
{
public static void main(String args[])
{
parallelopiped p=new parallelopiped(4.0,5.0,6.0);
System.out.println("Volume of parallelopiped"+p.calcVolume());
System.out.println("Surface area of parallelopiped"+p.calcSurfaceArea());
}
}


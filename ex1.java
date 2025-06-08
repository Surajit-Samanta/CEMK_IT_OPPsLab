{
public static void main(String args[])throws ClassNotException
{
int a,r;
for(int i=0;i<=args.length;i++)
{
try{
a=Integer.parseInt(args[i]);
r=10/(a-5);
System.out.println("Resule" +r);
}
catch(ArithmeticException e)
{
e.printStackTrace();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array out of bounds");
}
catch(NumberFormatException e)
{
System.out.println("Invalid number format")'
}
catch(ArrayStoreException e)
{
System.out.println(" ");
}

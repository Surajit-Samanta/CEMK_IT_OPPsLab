import java.util.Scanner;
class CEMKNotMatchException extends Exception
{
CEMKNotMatchException(String msg)
{
super(msg);
}
}
class ex
{
public static void main(String args[])
{
String str;
Scanner sc =new Scanner(System.in);
try{
System.out.println("Enter a string");
str=sc.next();
if(str.equalsIgnoreCase("CEMK")!=true)
{
throw new CEMKNotMatchException("String is not equal to CEMK or cemk");
}
System.out.println("String:="+str);
}
catch(CEMKNotMatchException e)
{
e.printStackTrace();
}
}
}

input java.io.*;
input javax.swing.JOptionPane;
import java.util.Scanner;
class assignment5
{
 public static void main(String args[]) IOException
 {
  BufferedReader bf=new BufferedReader(new InputStreamReader (System.in));
  Scanner sc=new Scanner(System.in);
  int op;
  String Name;
  int Age;
  int Salary;accBalance;
  System.out.println("option 1:Scanner"+"\n"+"option 2:BufferedReader"+"\n"+"option 3: ");
  System.out.println("option 4:command ineargument");
  System.out.println("Enter your option");
  op=sc.nextInt();
  switch(op)
case 1: System.out.println("Enter name");
	name=sc.nextLine();
	System.out.println("Enter age");
        age=sc.nextLine();
	System.out.println("Enter salary");
        salary=sc.nextLine();
	System.out.println("Enter Account Balance");
        accBalance=sc.nextLine();
	System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Account Ballance: "+accBalance);

case 2: System.out.println("Enter name");
	name=bf.readline();
	System.out.println("Enter age");
	age=Integer.parseInt(bf.readLine());
	System.out.println("Enter salary");
	salary=Integer.parseInt(bf.readLine());
	System.out.println("Enter account Balance");
        accBalance=Integer.parseInt(bf.readLine());
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Salary: "+salary);
	System.out.println("Account Ballance: "+accBalance);	break;

case 3:
	String i=JOptionpane.showInputdialog("Enter name");
	name=i;
	

	salary=Integer.parseInt(i);
	i=JOptionPane.showInputDialog("Enter account balance");
	accBalance=Integer.parseInt(i);
	System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Account Ballance: "+accBalance);
        break;

case 4:
	name=args[0];
	age=Integer.parseInt(args[1]);
	salary=Integer.parseInt(args[2]);
	accBalance=Integer.parseInt(args[3]);
	System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Account Ballance: "+accBalance);
        break;
default:System.out.println("wrong choice");
}
}
}


































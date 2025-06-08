interface salary
{
static final int basic=1000;
void calSal();
}
class salesperson
{
String name;
int totalsale;
void show()
{
System.out.println("Name : "+name);
System.out.println("Total sales : "+totalsale);
}
}
class commision extends salesperson
{
double compercent;
void calCom()
{
if (totalsale>=0 && totalsale<=200)
compercent=0.0;
else if(totalsale>=201 && totalsale<=500)
compercent=0.1;
else
compercent=0.2;
}
}
class earning extends commision implements salary
{
double gross;
public void calSal()
{
gross=basic+compercent*totalsale;
}
void show()
{
super.show();
System.out.println("Gross : "+gross);
}
}
class multiple_inheritance
{
public static void main(String args[])
{
earning e=new earning();
e.name="Sura";
e.totalsale=500;
e.calCom();
e.calSal();
e.show();
}
}


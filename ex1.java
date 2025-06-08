class thread1 implements Runnable
	{
		public void run()
	{
	int i;
	for(i=5;i>=1;i--)
	{
		System.out.println("From Thread 1"+1);
	try
	{
		Thread.sleep(500);
	}
	catch(InterruptedException e)
	{}
	}
		System.out.println("Exit from Thread1");
	}
	}



class thread2 implements Runnable
	{
		public void run()
	{
	int i;
	for(i=5;i>=1;i--)
	{
		System.out.println("From Thread 2"+i);
	try
	{
		Thread.sleep(500);
	}
	catch(InterruptedException e)
	{}
	}
	System.out.println("Exit from Thread2");
	}
	}



class thread3 implements Runnable
        {
                public void run()
        {
        int i;
        for(i=5;i>=1;i--)
        {
                System.out.println("From Thread 3"+i);
        try
        {
                Thread.sleep(500);
        }
        catch(InterruptedException e)
        {}
        }
        System.out.println("Exit from Thread3");
        }
        }



class ex1
{
public static void main(String args[])
{
thread1 t1=new thread1();
Thread o1=new Thread(t1);
thread2 t2=new thread2();
Thread o2=new Thread(t2);
thread3 t3=new thread3();
Thread o3=new Thread(t3);
o1.start();
o2.start();
o3.start();
}
}

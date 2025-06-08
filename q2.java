class car
{
	private int no_of_wheels;
	private double distance,oil_consumed;
	double mileage;
	void set_data(int n,double d,double o)
	{
		no_of_wheels=n;
		distance=d;
		oil_consumed=o;
	}
	int get_no_of_wheels()
	{
		return no_of_wheels;
	}
	double get_distance()
	{
		return distance;
	}
	double get_oil_consumed()
	{
		return oil_consumed;
	}

	void mileage_cal()
	{
		mileage=distance/oil_consumed;
	}
}
 class q2
{
	public static void main(String arge[])
	{
		car c1=new car();
		c1.set_data(4,75.0,5.0);
		c1.mileage_cal();

		System.out.println("The no of wheels in first car: "+c1.get_no_of_wheels());
		System.out.println("The distance traveled by first car: "+c1.get_distance());
		System.out.println("The amount of oil consumed by first car: "+c1.get_oil_consumed());
		System.out.println("The mileage of first car: "+c1.mileage);

		car c2=new car();
		c2.set_data(4,45.0,4.5);
		c2.mileage_cal();

		System.out.println("The no of wheels in second car: "+c2.get_no_of_wheels());
		System.out.println("The distance traveled by second car: "+c2.get_distance());
		System.out.println("The amount of oil consumed by second car: "+c2.get_oil_consumed());
		System.out.println("The mileage of second car: "+c2.mileage);

		if(c1.mileage<c2.mileage)
			System.out.println("2st car's mileage is better.");
		else
			System.out.println("1nd car's mileage is better.");
	}
}

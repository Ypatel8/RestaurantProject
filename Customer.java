 

public class Customer
{
	private static int number=0;
	public Customer()
	{
		number++;
	}
	public static int getNumber()
	{
		return number;
	}
	public Drink getDrinkOrder()
	{
		int x=(int)(Math.random()*3);
		String y="";
		switch(x)
		{
		    case 1: y="Soda";
		       break;
		    case 2: y="Water";
		       break;
		    default: y="Juice";
		       break;
		  }
		int z = 1+(int)(Math.random()*10);
		return new Drink(y,z);
	}
	public SolidFood getFoodOrder()
	{
		int x=(int)(Math.random()*3);
		String y;
		switch(x)
		{
		    case 1: y="Pizza";
		       break;
		    case 2: y="Burger";
		       break;
		    default: y="Sandwich";
		       break;
		  }
		int z = 1+(int)(Math.random()*10);
		return new SolidFood(y,z);
	}
}
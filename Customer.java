public class Customer //eray is cooler than yogin
{
	private static int number=0;
	public Customer()
	{
		number++;
	}
	public int getNumber()
	{
		return number;
	}
	public Drink getDrinkOrder()
	{
		int x=(int)Math.random()*3;
		String y;
		if(x==1)
		{
			y="Soda";
		}
		else if(x==2)
		{
			y="Water";
		}
		else
		{
			y="Juice";
		}
		int z=1+(int)Math.random()*10; //change
		return new Drink(y,z);
	}
	public SolidFood getFoodOrder()
	{
		int x=(int)Math.random()*3;
		String y;
		if(x==1)
		{
			y="Pizza";
		}
		else if(x==2)
		{
			y="Burger";
		}
		else
		{
			y="Sandwich";
		}
		int z=1+(int)Math.random()*10;
		return new SolidFood(y,z);
	}
}
package RestaurantProject;

public class Drink implements Food
{
	String name;
	int number;
	double price;
	public Drink(String x, int num)
	{
		name=x;
		number=num;
		if(name.equals("Soda"))
		{
			price=1.00;
		}
		else if(name.equals("Water"))
		{
			price=0;
		}
		else if(name.equals("Juice"))
		{
			price=.75;
		}
	}
	public void setNum(int x)
	{
		number=x;
	}
	public int getNum()
	{
		return number;
	}
	public double getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return(name+"\t"+price);
	}
}
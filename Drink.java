package RestaurantProject;

/**
 * Drink class that implements the Food interface
 */
public class Drink implements Food
{
	private String name;
	private int number;
	private double price;
	/**
	 * constructor that creates food items and prices
	 */
	public Drink(String x, int num)
	{
		name=x;
		number=num;
		switch(name)
		{
		    case "Soda": price=1.00;
		        break;
		    case "Water": price=0;
		        break;
		    case "Juice": price=2.00;
		        break;
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
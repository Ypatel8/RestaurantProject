package RestaurantProject;

 

 public class SolidFood implements Food
{
	private String name;
	private int number;
	private double price;
	public SolidFood(String x, int num)
	{
		name=x;
		number=num;
		switch(name)
		{
		    case "Burger": price=5.00;
		        break;
		    case "Sandwich": price=4.50;
		        break;
		    case "Pizza": price=2.50;
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
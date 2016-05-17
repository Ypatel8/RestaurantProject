 

public class SolidFood implements Food
{
	String name;
	int number;
	double price;
	public SolidFood(String x, int num)
	{
		name=x;
		number=num;
		if(name.equals("Burger"))
		{
			price=5.00;
		}
		else if(name.equals("Sandwich"))
		{
			price=4.50;
		}
		else if(name.equals("Pizza"))
		{
			price=2.50;
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
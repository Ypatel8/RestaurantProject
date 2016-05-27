/**
 * Author: Yogin Patel, Ben Lukose
 * Version: Final
 */
package RestaurantProject;

public class Customer
{
	private static int number=0;
	/**
	 * constructor, initializes the Customer Class
	 */
	public Customer()
	{
		number++;
	}
	/**
	 * returns the number of customers made at this time
	 */
	public static int getNumber()
	{
		return number;
	}
	/**
	 * returns a random Drink order with Soda, Water, or Juice and the number of the drink ordered
	 */
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
	/**
	 * returns a random Food order with either Pizza, Burgers or Sandwiches and the number of food ordered
	 */
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

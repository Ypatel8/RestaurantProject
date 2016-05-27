/**
 * Author: Yogin Patel, Eray Durson
 * Version: Final
 */
package RestaurantProject;
/**
 * The public interface for all the food items in our order (Drinks and SolidFood)
 */
public interface Food
{
	public int getNum();
	public void setNum(int x);
	public double getPrice();
	public String getName();
}

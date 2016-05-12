package RestaurantProject;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class UnitTestRestaurantProject implements Food
{
    public UnitTestRestaurantProject()
    {
    }
    public int getNum()
    {
    }
    public void setNum(int x)
    {
    }
    public double getPrice()
    {
    }
    @Before//sets up test fixture
    public void setUp()
    {
    }
    @After//tears down test fixture
    public void tearDown()
    {
    }
    @Test
    public void testSolidFoodprice()
    {
        SolidFood s1=new SolidFood("Burger",1);
        assertEquals(2.00,s1.getPrice());
    }
    @Test
    public void testgetNum()
    {
        SolidFood s2= new SolidFood("Sandwich",1);
        assertEquals(4,s2.getNum());
    }
    @Test
    public void testsetNum()
    {
        SolidFood s3=new SolidFood("Sandwich",1);
        s3.setNum(3);
        assertEquals(3,s3.getNum());
    }
    @Test
    public void testDrinkprice()
    {
        Drink d1=new Drink("Soda", 1);
        assertEquals(1.00,d1.getPrice());
    }
    @Test
    public void testOrder()
    {
        Order order1=new Order();
        order1.add(s1);
        order1.add(s2);
        order1.add(d1);
        List<Food>test=new ArrayList<Food>();
        test.add(s1);
        test.add(s2);
        test.add(d1);
        assertEquals(test,theOrder);
        
    }
}
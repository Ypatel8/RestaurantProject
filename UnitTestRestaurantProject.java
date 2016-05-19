 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class UnitTestRestaurantProject implements Food
{
    public UnitTestRestaurantProject()
    {
    }
    public String getName()
    {
        return " ";
    }
    public int getNum()
    {
        return 0;
    }
    public void setNum(int x)
    {
    }
    public double getPrice()
    {
        return 0.0;
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
        assertEquals(5,s1.getPrice(),0.1);
    }
    @Test
    public void testgetNum()
    {
        SolidFood s2= new SolidFood("Sandwich",1);
        assertEquals(1,s2.getNum());
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
        assertEquals(1,d1.getPrice(),0.1);
    }
    @Test
    public void testOrder()
    {
        Order order1=new Order();
        SolidFood s1= new SolidFood("Burger",1);
        SolidFood s2= new SolidFood("Sandwich",1);
        SolidFood s3= new SolidFood("Sandwich", 1);
        Drink d1 =new Drink("Soda",1);
        order1.add(s1);
        order1.add(s2);
        order1.add(d1);
        List<Food>test=new ArrayList<Food>();
        test.add(s1);
        test.add(s2);
        test.add(d1);
        Food f1= order1.getOrder().get(0);
        assertEquals(s1,f1);
        
    }
    @Test
    public void testCustomerGetNumber()
    {
        Customer c1= new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        assertEquals(3,Customer.getNumber());
    }
}
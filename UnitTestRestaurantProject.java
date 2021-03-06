/**
 * Author: Ben Lukose
 * Version: Final
 */
package RestaurantProject;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * Unit Test for the program
 */
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
    @Test// test price for SolidFood
    public void testSolidFoodprice()
    {
        SolidFood s1=new SolidFood("Burger",1);
        assertEquals(5,s1.getPrice(),0.1);
    }
    @Test// test number for SolidFood
    public void testgetNum()
    {
        SolidFood s2= new SolidFood("Sandwich",1);
        assertEquals(1,s2.getNum());
    }
    @Test// test the num method
    public void testsetNum()
    {
        SolidFood s3=new SolidFood("Sandwich",1);
        s3.setNum(3);
        assertEquals(3,s3.getNum());
    }
    @Test// test price for drinks
    public void testDrinkprice()
    {
        Drink d1=new Drink("Soda", 1);
        assertEquals(1,d1.getPrice(),0.1);
    }
    @Test// test the Order class to see if it correctly compiles/creates an order
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
    @Test// tests the Customer class to make sure that it constructs correctly for the program
    public void testCustomerGetNumber()
    {
        Customer c1= new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        assertEquals(3,Customer.getNumber());
    }

    }
    


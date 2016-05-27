/**
 * Author: Yogin Patel, Eray Durson
 * Version: Final
 */
package RestaurantProject;

import java.util.*;
/**
 * This class is responsible for creating the random orders that will appear on the GUI
 */
public class Order {
    private int numPizzas = 0, numBurgers = 0, numSandwichs = 0, numSodas = 0, numWaters = 0, numJuices = 0;
    private List<Food> theOrder= new ArrayList<Food>();
    private double profit=0;
    private double loss=0;
    private int numOrders=0;
    private String printed = "";
    public Order()
    {
        numOrders++;
    }

    public void add(Food item)
    {
        theOrder.add(item);
    }

    public List<Food> getOrder()
    {
        return theOrder;
    }
    /**
     * Goes through the list and adds the number of items of each type to their respective variables
     */
    public void updateVariables()
    {
        for(Food f:theOrder)
        {
            if(f.getName().equals("Soda"))
            {
                numSodas+=f.getNum();
            }
            else if(f.getName().equals("Water"))
            {
                numWaters+=f.getNum();
            }
            else if(f.getName().equals("Juice"))
            {
                numJuices+=f.getNum();
            }
            else if(f.getName().equals("Burger"))
            {
                numBurgers+=f.getNum();
            }
            else if(f.getName().equals("Sandwich"))
            {
                numSandwichs+=f.getNum();
            }
            else if(f.getName().equals("Pizza"))
            {
                numPizzas+=f.getNum();
            }
        }
    }
    /**
     * This method will clear the variables, and set the toString to null
     */
    private void resetVariables()
    {
        numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
        loss=0;
        printed="";
    }
    /**
     * checks each variable inputted and returns true if they match
     */
    public boolean checkVariables(int nP, int nB, int nSand, int nSoda, int nW, int nJ)
    {
        this.updateVariables();
        boolean isTrue = true;

        if(nP == numPizzas)
        {
            profit+=(2.50*numPizzas);
        }
        else
        {
            isTrue = false;
            loss-=(Math.abs(nP-numPizzas))*2.5;
            profit+=(2.50*nP);
        }

        if(nB == numBurgers)
        {
            profit+=(5.00*numBurgers);
        }
        else
        {
            isTrue = false;
            loss-=(Math.abs(nB-numBurgers))*5.00;
            profit+=(5.00*nB);
        }

        if(nSand == numSandwichs)
        {
            profit+=(4.50*numSandwichs);
        }
        else
        {
            isTrue = false;
            loss-=(Math.abs(nSand-numSandwichs))*4.50;
            profit+=(4.50*nSand);
        }

        if(nSoda == numSodas)
        {
            profit+=(1.00*numSodas);
        }
        else
        {
            isTrue = false;
            loss-=(Math.abs(nSoda-numSodas))*1.00;
            profit+=(1.00*nSoda);
        }

        if(nW == numWaters)
        {
        }
        else
        {
            isTrue = false;
        }

        if(nJ == numJuices)
        {
            profit+=(2.00*numJuices);
        }
        else
        {
            isTrue = false;
            loss-=(Math.abs(nJ-numJuices))*2.00;
            profit+=(2.00*nJ);
        }
        profit+=loss;
        return isTrue;
    }
    /**
     * Resets everything but the profit in this class
     */
    public void reset()
    {
        theOrder = new ArrayList<Food>();
        this.resetVariables();
    }
    public double getProfit()
    {
        loss=0;
        return profit;
    }
    /**
     * goes through the list recursively and adds to a string that will be printed
     */
    private String traverse(List<Food> toStringList)
    {
        printed+="\n";
        while(toStringList.size()>0)
        {
            printed += (toStringList.get(0).getName()+"\t"+toStringList.remove(0).getNum());
            traverse(toStringList);
        }

        return printed;
    }
    public String toString()
    {
        return ("Order Up:\n"+traverse(theOrder));
    }
}

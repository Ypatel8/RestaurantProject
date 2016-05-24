import java.util.*;
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

    private void resetVariables()
    {
        numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
    }

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
            loss+=(Math.abs(nP-numPizzas))*2.5;
            profit+=(2.50*numPizzas);
        }

        if(nB == numBurgers)
        {
            profit+=(5.00*numBurgers);
        }
        else
        {
            isTrue = false;
            loss+=(Math.abs(nB-numBurgers))*5.00;
            profit+=(5.00*numBurgers);
        }

        if(nSand == numSandwichs)
        {
            profit+=(4.50*numSandwichs);
        }
        else
        {
            isTrue = false;
            loss+=(Math.abs(nSand-numSandwichs))*4.50;
            profit+=(4.50*numSandwichs);
        }

        if(nSoda == numSodas)
        {
            profit+=(1.00*numSodas);
        }
        else
        {
            isTrue = false;
            loss+=(Math.abs(nSoda-numSodas))*1.00;
            profit+=(1.00*numSodas);
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
            loss+=(Math.abs(nJ-numJuices))*2.00;
            profit+=(2.00*numJuices);
        }

        return isTrue;
    }

    public void reset()
    {
        theOrder = new ArrayList<Food>();
        this.resetVariables();
    }

    public double getProfit()
    {
        return profit;
    }

    private String traverse()
    {
        List<Food> toStringList = theOrder;
        printed+="\n";
        for(int x=0;x<numOrders;x++)
        {
            while(toStringList.size()>0)
            {
                printed += (toStringList.get(0).getName()+"\t"+toStringList.remove(0).getNum());
                traverse();
            }
        }
        return printed;
    }

    public String toString()
    {
        return ("Order Up:\n"+traverse());
    }
}

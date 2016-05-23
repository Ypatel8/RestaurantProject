import java.util.*;
public class Order {
    private int numPizzas = 0, numBurgers = 0, numSandwichs = 0, numSodas = 0, numWaters = 0, numJuices = 0;
    private List<Food> theOrder= new ArrayList<Food>();
    private double profit=0;
    private double loss=0;
    private int numOrders=0;
    private String printed = "";
    public Order(){
        numOrders++;
    }

    public void add(Food item){
        theOrder.add(item);
    }

    public List<Food> getOrder(){
        return theOrder;
    }

    public void updateVariables(){
        for(Food f:theOrder){
            if(f.getName().equals("Soda")){
                numSodas+=f.getNum();
            }
            else if(f.getName().equals("Water")){
                numWaters+=f.getNum();
            }
            else if(f.getName().equals("Juice")){
                numJuices+=f.getNum();
            }
            else if(f.getName().equals("Burger")){
                numBurgers+=f.getNum();
            }
            else if(f.getName().equals("Sandwich")){
                numSandwichs+=f.getNum();
            }
            else if(f.getName().equals("Pizza")){
                numPizzas+=f.getNum();
            }
        }
    }

    private void resetVariables(){
        numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
    }

    public boolean checkVariables(int nP, int nB, int nSand, int nSoda, int nW, int nJ){
        this.updateVariables();
        boolean isTrue = true;

        if(nP == numPizzas){
            profit+=(3*numPizzas);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nP-numPizzas))*3;
        }

        if(nB == numBurgers){
            profit+=(3*numBurgers);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nB-numBurgers))*3;
        }

        if(nSand == numSandwichs){
            profit+=(3*numSandwichs);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nSand-numSandwichs))*3;
        }

        if(nSoda == numSodas){
            profit+=(3*numSodas);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nSoda-numSodas))*3;
        }

        if(nW == numWaters){
            profit+=(3*numWaters);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nW-numWaters))*3;
        }

        if(nJ == numJuices){
            profit+=(3*numJuices);
        }
        else{
            isTrue = false;
            loss+=(Math.abs(nJ-numJuices))*3;
        }

        return isTrue;
    }

    public void reset(){
        theOrder = new ArrayList<Food>();
        this.resetVariables();
    }

    public double getProfit(){
        return profit;
    }

    private String traverse(){
        List<Food> toStringList = theOrder;
        printed+="\n";
        for(int x=0;x<numOrders;x++){
            while(toStringList.size()>0){
                printed += (toStringList.get(0).getName()+"\t"+toStringList.remove(0).getNum());
                traverse();
            }
        }
        return printed;
    }

    public String toString(){
        return ("Order Up:\n"+traverse());
    }
}

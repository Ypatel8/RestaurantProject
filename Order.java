 

import java.util.*;

public class Order {
	private int numPizzas = 0, numBurgers = 0, numSandwichs = 0, numSodas = 0, numWaters = 0, numJuices = 0;
	private List<Food> theOrder= new ArrayList<Food>();
	private double profit=0;
	private double loss=0;
	public Order(){
		
	}
	
	public void add(Food item){
		theOrder.add(item);
	}
	
	public List<Food> getOrder(){
		return theOrder;
	}
	
	private void updateVariables(){
		for(Food f:theOrder){
			if(f.getName().equals("Soda")){
			    numSodas+=f.getNum();
			}
			else if(f.getName().equals("Water")){
			    numWaters+=f.getNum();
			}
			else if(f.getName().equals("Juice")){
			    numJuice+=f.getNum();
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
		if(nP == numPizzas){
			if(nB==numBurgers){
				if(nSand==numSandwichs){
					if(nSoda==numSodas){
						if(nW==numWaters){
							if(nJ==numJuices){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public void reset(){
		theOrder = new ArrayList<Food>();
	}
	
	public String toString(){
		return "";
	}
}

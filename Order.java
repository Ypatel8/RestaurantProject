 

import java.util.*;

public class Order {
	private int numPizzas, numBurgers, numSandwichs, numSodas, numWaters, numJuices;
	numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
	private List<Food> theOrder= new ArrayList<Food>();
	
	public Order(){
		
	}
	
	public void add(Food item){
		theOrder.add(item);
	}
	
	public List<Food> getOrder(){
		return theOrder;
	}
	
	private void updateVariables(){ //go through list recursively, update variables based on what's in list
		for(Food f:theOrder){
			
		}
	}
	
	private void resetVariables(){
		numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
	}
	
	public boolean checkVariables(int nP, int nB, int nSand, int nSoda, int nW, int nJ){
		this.resetVariables();
		this.updateVariables();
	}
	
	public String toString(){
		
	}
}

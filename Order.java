 

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
	
	private void updateVariables(){ //go through list recursively, update variables based on what's in list
		for(Food f:theOrder){
			if(f.getName().equals("Soda")){
			    numSodas+=f.getNum();
			}
			else if(f.getName().equals("Water")){
			    numWaters++;
			}
			else if(f.getName().equals("Juice")){
			    numJuice++;
			}
		}
	}
	
	private void resetVariables(){
		numPizzas = numBurgers = numSandwichs = numSodas = numWaters = numJuices = 0;
	}
	
	public boolean checkVariables(int nP, int nB, int nSand, int nSoda, int nW, int nJ){
		//this.resetVariables();
		this.updateVariables();
		return true;
	}
	
	public void reset(){
		theOrder = new ArrayList<Food>();
	}
	
	public String toString(){
		return "";
	}
}

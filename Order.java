 

import java.util.*;

public class Order {
	private List<Food> theOrder= new ArrayList<Food>();
	public Order(){
		
	}
	
	public void add(Food item){
		theOrder.add(item);
	}
	
	public List<Food> getOrder(){
		return theOrder;
	}
}

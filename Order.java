
public class Order {
	private List<Food> theOrder= new ArrayList<Food>();
	public Order(){
		
	}
	
	public void add(Food item){
		theOrder.add(item);
	}
	
	public ArrayList<Food> getOrder(){
		return theOrder;
	}
}

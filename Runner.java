public class Runner {
	private double moneyMade = 0.0;

	public static void main(String[] args) {
		
	}

	public static void orderCreator(){
		Customer cust = new Customer();
		Order order = new Order();
		int random;
		
		for(int x=0;x<5;x++){
			random = (int)(Math.random()*2);
			if(random==0){
				Order.add(cust.getFoodOrder());
			}
			else{
				Order.add(cust.getDrinkOrder());
			}
		}
	}
	
	public static void orderPrinter(List<Food> x){
		while(x.size()>0){
		System.out.println(x.remove(0));
		if(x.size()>0){
			orderPrinter(x);
		}
		else{
			 
		}
		}
	}
}
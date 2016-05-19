package RestaurantProject;

 

import java.util.*;
public class Runner {
    private double moneyMade = 0.0;

    public static void main(String[] args) {
        Order o1 = new Order();
        Customer cust1 = new Customer();

        for(int x=0;x<5;x++){
            o1 = new Order();
            o1.add(cust1.getFoodOrder());
            o1.add(cust1.getDrinkOrder());
            System.out.println("Order Up");
            orderPrinter(o1);
        }
        orderPrinter(o1);
    }

    /* public static void orderCreator(){
    Customer cust = new Customer();
    Order order = new Order();
    int random;

    for(int x=0;x<5;x++){
    random = (int)(Math.random()*2);
    if(random==0){
    order.add(cust.getFoodOrder());
    }
    else{
    order.add(cust.getDrinkOrder());
    }
    }
    }*/

    public static void orderPrinter(Order x){
        List<Food> orderList = x.getOrder();
        System.out.println();
        while(orderList.size()>0){
            System.out.println(orderList.remove(0));
            if(orderList.size()>0){
                orderPrinter(x);
            }
            else{
                System.out.println();
            }
        }
    }
}
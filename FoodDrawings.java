package RestaurantProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics.*;
import java.awt.Color;
//All Yogin's work HAHAHAHAHAHAHHAHAHAHHAHAHAHAHHHAHAHAH
public class FoodDrawings
{
    private JFrame frame;
    private JPanel panel;
    private int nP,nB,nSand,nSoda,nW,nJ;
    private Graphics x;
    private JLabel pizza,burger,sandwich,soda,water,juice;
    private JButton numPizza,numBurger,numSandwich,numSoda,numWater,numJuice,orderUpButton;
    JTextArea orderMenu;
    Order order=new Order();
    Customer customer=new Customer();
    int numCorrect=0;
    public FoodDrawings() {
        panel=new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(Color.red);
        
        frame=new JFrame("Game");
        
        pizza = new JLabel("Num of Pizzas");
        //pizza.setBounds(29, 11, 90, 16);
        panel.add(pizza);
        
        numPizza = new JButton("Add Pizza");
        //numPizza.setBounds(124, 5, 37, 28);
        panel.add(numPizza);
        numPizza.addActionListener(new PizzaButtonListener());

        burger = new JLabel("Num of Burgers");
        //burger.setBounds(166, 11, 98, 16);
        panel.add(burger);

        numBurger = new JButton("Add Burger");
        //numBurger.setBounds(269, 5, 37, 28);
        panel.add(numBurger);
        numBurger.addActionListener(new BurgerButtonListener());

        sandwich = new JLabel("Num of Sandwichs");
        //sandwich.setBounds(311, 11, 117, 16);
        panel.add(sandwich);

        numSandwich = new JButton("Add Sandwich");
        //numSandwich.setBounds(433, 5, 37, 28);
        panel.add(numSandwich);
        numSandwich.addActionListener(new SandwichButtonListener());
        
        soda=new JLabel("Num of Sodas");
        //soda.setBounds(54, 44, 88, 16);
        panel.add(soda);

        numSoda = new JButton("Add Soda");
        //numSoda.setBounds(147, 38, 37, 28);
        panel.add(numSoda);
        numSoda.addActionListener(new SodaButtonListener());

        water = new JLabel("Num of Water");
        //water.setBounds(189, 44, 86, 16);
        panel.add(water);

        numWater = new JButton("Add Water");
        //numWater.setBounds(280, 38, 37, 28);
        panel.add(numWater);
        numWater.addActionListener(new WaterButtonListener());

        juice = new JLabel("Num of Juice");
        //juice.setBounds(322, 44, 81, 16);
        panel.add(juice);

        numJuice = new JButton("Add Juice");
        //numJuice.setBounds(408, 38, 37, 28);
        panel.add(numJuice);
        numJuice.addActionListener(new JuiceButtonListener());

        orderUpButton = new JButton("Order Up!");
        //orderUpButton.setBounds(189, 78, 117, 29);
        panel.add(orderUpButton);
        orderUpButton.addActionListener(new OrderButtonListener());

        orderMenu = new JTextArea();
        orderMenu.setBackground(Color.ORANGE);
        orderMenu.setEditable(false);
        orderMenu.setLineWrap(true);
        orderMenu.setText("s");
        orderMenu.setBounds(6, 289, 488, 205);
        panel.add(orderMenu);
        
        frame.getContentPane().add(panel);
        //pizza(x);
    }
    private void updateOrder()
    {
    	order.reset();
    	for(int x=0;x<5;x++)
    	{
    		int y=(int)(Math.random()*2);
    		if(y==0)
    		{
    			order.add(customer.getDrinkOrder());
    		}
    		else
    		{
    			order.add(customer.getFoodOrder());
    		}
    	}
    	nP=nB=nSand=nSoda=nW=nJ=0;
    	order.updateVariables();
    	orderMenu.setText(order.toString());
    }
    public void display()
    {
         frame.pack();
         frame.setVisible(true);
    }
    
    public boolean isCorrect()
    {
    	boolean x=order.checkVariables(nP,nB,nSand,nSoda,nW,nJ);
    	return x;
    }
    
    public class PizzaButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nP++;
            pizza.setText("NumPizza= "+nP);
        }
    }
    
    public class BurgerButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nB++;
            burger.setText("NumBurger= "+nB);
        }
    }
    
    public class SandwichButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nSand++;
            sandwich.setText("NumSandwich= "+nSand);
        }
    }
    
    public class SodaButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nSoda++;
            soda.setText("NumSoda= "+nSoda);
        }
    }
    
    public class WaterButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nW++;
            water.setText("NumWater= "+nW);
        }
    }
    
    public class JuiceButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            nJ++;
            juice.setText("NumPizza= "+nJ);
        }
    }
    
    public class OrderButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
        	boolean correct=order.checkVariables(nP,nB,nSand,nSoda,nW,nJ);
        	if(correct)
        	{
        		numCorrect++;
        	}
        	updateOrder();
        }
    }
            
// 
//     public void paint(Graphics g)
//     {
//         //Background
//         setBackground(Color.gray);
// 
//         this.pizza(g);
//         this.drink(g);
//     }
// 
//     public void pizza(Graphics g)
//     {
//         Color bread=new Color(244,164,96);
//         Color cheese=Color.white;
//         g.setColor(new Color(244,164,96));
//         g.fillOval(200, 200, 200, 40);
//         g.setColor(cheese);
//         g.fillOval(215, 205, 170, 28);
//     }
// 
//     public void drink(Graphics g)
//     {
//         Color cup=Color.RED;
//         Color straw=Color.white;
//         g.setColor(cup);
//         g.fillRect(100, 100, 50, 100);
//         g.setColor(straw);
//     }
}


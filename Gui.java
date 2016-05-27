/**
 * Author: Yogin Patel
 * Version: Final
 */
package RestaurantProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui
{
    private JFrame frame;
    private JPanel panel;
    private int nP,nB,nSand,nSoda,nW,nJ;
    private Graphics x;
    private JLabel pizza,burger,sandwich,soda,water,juice,numCorrectLbl,netProfitLbl;
    private JButton numPizza,numBurger,numSandwich,numSoda,numWater,numJuice,orderUpButton,resetButton;
    private JTextArea orderMenu;
    private Order order=new Order();
    private Customer customer=new Customer();
    private int numCorrect=0;
    private int numDone=0;
    /**
     * This constructor makes the frame and overlays the panel that has all of the user interface
     */
    public Gui() {
        panel=new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(new Color(139,69,191));

        frame=new JFrame("Game");

        pizza = new JLabel("Num of Pizzas");
        panel.add(pizza);

        numPizza = new JButton("Add Pizza");
        panel.add(numPizza);
        numPizza.addActionListener(new PizzaButtonListener());

        burger = new JLabel("Num of Burgers");
        panel.add(burger);

        numBurger = new JButton("Add Burger");
        panel.add(numBurger);
        numBurger.addActionListener(new BurgerButtonListener());

        sandwich = new JLabel("Num of Sandwichs");
        panel.add(sandwich);

        numSandwich = new JButton("Add Sandwich");
        panel.add(numSandwich);
        numSandwich.addActionListener(new SandwichButtonListener());

        soda=new JLabel("Num of Sodas");
        panel.add(soda);

        numSoda = new JButton("Add Soda");
        panel.add(numSoda);
        numSoda.addActionListener(new SodaButtonListener());

        water = new JLabel("Num of Water");
        panel.add(water);

        numWater = new JButton("Add Water");
        panel.add(numWater);
        numWater.addActionListener(new WaterButtonListener());

        juice = new JLabel("Num of Juice");
        panel.add(juice);

        numJuice = new JButton("Add Juice");
        panel.add(numJuice);
        numJuice.addActionListener(new JuiceButtonListener());

        orderUpButton = new JButton("Order Up!");
        panel.add(orderUpButton);
        orderUpButton.addActionListener(new OrderButtonListener());

        resetButton=new JButton("Reset");
        panel.add(resetButton);
        resetButton.addActionListener(new ResetButtonListener());

        numCorrectLbl=new JLabel("Num Correct= "+numCorrect);
        panel.add(numCorrectLbl);

        netProfitLbl=new JLabel("Net Profit= $0");
        panel.add(netProfitLbl);

        orderMenu = new JTextArea();
        orderMenu.setBackground(new Color(209,192,39));
        orderMenu.setEditable(false);
        orderMenu.setLineWrap(false); //set True for wide and left centered
        updateOrder();
        orderMenu.setBounds(6, 289, 488, 205);
        panel.add(orderMenu);

        frame.getContentPane().add(panel);
    }
    
    /**
     * This method resets the order and resets the variables in this class
     * then makes the new order
     * and replaces the old order with the older order
     */
    private void updateOrder()
    {
        order.reset();
        //order=new Order();

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
        int rows=orderMenu.getRows();
        orderMenu.replaceRange(null,0,rows);
        orderMenu.setText(order.toString());
        resetNums();
    }
    /**
     * Resets all of the variables in this class and sets all of the labels to what they were before
     */
    private void resetNums()
    {
        nP=nB=nSand=nSoda=nW=nJ=0;
        pizza.setText("Num of Pizza");
        burger.setText("Num of Burgers");
        water.setText("Num of Water");
        sandwich.setText("Num of Sandwichs");
        soda.setText("Num of Sodas");
        juice.setText("Num of Juice");
    }
    /**
     * Allows the frame to be displayed
     */
    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * Helper method for the class to check if inputs were correct
     */
    private boolean isCorrect()
    {
        boolean x=order.checkVariables(nP,nB,nSand,nSoda,nW,nJ);
        return x;
    }
    /**
     * The next few subclasses will increment their respective variables based on when their buttons are pressed
     */
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
            juice.setText("NumJuice= "+nJ);
        }
    }
    /**
     * When the orderUp button is pressed, this subclass will be called
     * It will check all of the variables and reset everything using other supporter methods
     * Additionally it stops the program when there is more than 10 orders, and so that is the end of the game
     */
    public class OrderButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            numDone++;
            if(numDone>=10)
            {
                orderMenu.setText(null);
                orderMenu.setText("You have gotted: "+numCorrect+" orders correct out of 10 total orders");
            }
            else
            {
                boolean correct=order.checkVariables(nP,nB,nSand,nSoda,nW,nJ);
                if(correct)
                {
                    numCorrect++;
                    numCorrectLbl.setText("NumCorrect= "+numCorrect);
                }
                updateOrder();
                netProfitLbl.setText("Net Profit= $"+order.getProfit()+"0");
                //orderMenu.replaceRange(order.toString(),1,6);
            }
        }
    }
    /**
     * This subclass and button does not reset everything, it only resets some of the variables in case the user messes up
     */
    public class ResetButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            resetNums();
        }
    }
}

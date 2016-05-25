import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics.*;
import java.awt.Color;
public class Gui
{
    private JFrame frame;
    private JPanel panel;
    private int nP,nB,nSand,nSoda,nW,nJ;
    private Graphics x;
    private JLabel pizza,burger,sandwich,soda,water,juice,numCorrectLbl,netProfitLbl;
    private JButton numPizza,numBurger,numSandwich,numSoda,numWater,numJuice,orderUpButton,resetButton;
    JTextArea orderMenu;
    Order order=new Order();
    Customer customer=new Customer();
    int numCorrect=0;
    int numDone=0;
    public Gui() {
        panel=new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(new Color(139,69,191));

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
        orderMenu.setText(null);
        orderMenu.setText(order.toString());
        resetNums();
    }

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
            juice.setText("NumJuice= "+nJ);
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
                numCorrectLbl.setText("NumCorrect= "+numCorrect);
            }
            updateOrder();
            netProfitLbl.setText("Net Profit= $"+order.getProfit()+"0");
            //orderMenu.replaceRange(order.toString(),1,6);
        }
    }

    public class ResetButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            resetNums();
        }
    }
}


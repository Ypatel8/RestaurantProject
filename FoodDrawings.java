import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class FoodDrawings extends Applet
{
    public void paint(Graphics g)
    {
        //Background
        setBackground(Color.gray);
                
        this.pizza(g);
        this.drink(g);
    }
    public void pizza(Graphics g)
    {
        Color bread=new Color(244,164,96);
        Color cheese=Color.white;
        g.setColor(bread);
        g.fillOval(200, 200, 200, 40);
        g.setColor(cheese);
        g.fillOval(215, 205, 170, 28);
        for(int x=0;x<=50;x++)
        {
            if(x%2==0)
            {
                g.setColor(Color.red);
                g.fillRect((int)(Math.random()*170)+215,(int)(Math.random()*28)+205,5,5);
            }
            else
            {
                g.setColor(Color.green);
                g.fillRect((int)(Math.random()*170)+215,(int)(Math.random()*28)+205,5,5);
            }
        }
    }
    public void drink(Graphics g)
    {
        Color cup=Color.RED;
        Color straw=Color.white;
        g.setColor(cup);
        g.fillRect(100, 100, 50, 100);
        g.setColor(straw);
        g.fillRect(120, 80, 10, 20);
    }
    public void sandwich(Graphics g, boolean isBurger)
    {
        if(isBurger==true)
        {}}
            
}


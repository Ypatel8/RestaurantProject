import java.awt.*;
import javax.swing.*;
public class FoodDrawings extends JPanel
{
    public void paintComponent(Graphics g)
    {
        //Background
        setBackground(new Color(139,69,191));

        Graphics2D g2=(Graphics2D) g;
        this.pizza(g2);
        this.cup(g2);
        this.burger(g2);
        this.title(g2);
    }

    public void pizza(Graphics g)
    {
        Color bread=new Color(244,164,96);
        Color cheese=Color.white;
        g.setColor(bread);
        g.fillOval(100, 160, 200, 40);
        g.setColor(cheese);
        g.fillOval(115, 165, 170, 28);
        for(int x=0; x<=50;x++)
        {
            if(x%2==0)
            {
                g.setColor(Color.red);
                g.fillRect((int)(Math.random()*170)+110,(int)(Math.random()*25)+160,5,5);
            }
            else
            {
                g.setColor(Color.green);
                g.fillRect((int)(Math.random()*170)+110,(int)(Math.random()*25)+160,5,5);
            }
        }
    }

    public void cup(Graphics g)
    {
        Color cup=Color.RED;
        Color straw=Color.white;
        g.setColor(cup);
        g.fillRect(50, 70, 50, 100);
        g.setColor(straw);
        g.fillRect(70, 40, 10, 30);
    }
    
    public void burger(Graphics g)
    {
        Color bread=new Color(244,164,96);
        Color patty=Color.red;
        g.setColor(bread);
        g.fillArc(310,100,100,50,0,180);
        g.fillRect(310,120,100,20);
        g.setColor(patty);
        g.fillRect(300,140,120,20);
        g.setColor(bread);
        g.fillRect(310,160,100,20);
    }
    
    public void title(Graphics g)
    {
        g.setFont(new Font("serif",Font.BOLD,20));
        g.setColor(Color.pink);
        g.drawString("Welcome to our game!", 110,250);
        g.drawString("It's like DinerDash but with less dash",65,300);
    }
}

import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
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
    }

    public void pizza(Graphics g)
    {
        Color bread=new Color(244,164,96);
        Color cheese=Color.white;
        g.setColor(new Color(244,164,96));
        g.fillOval(200, 200, 200, 40);
        g.setColor(cheese);
        g.fillOval(215, 205, 170, 28);
    }

    public void cup(Graphics g)
    {
        Color cup=Color.RED;
        Color straw=Color.white;
        g.setColor(cup);
        g.fillRect(100, 100, 50, 100);
        g.setColor(straw);
    }
}
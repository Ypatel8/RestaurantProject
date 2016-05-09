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
	}
	public void drink(Graphics g)
	{
		Color cup=Color.RED;
		Color straw=Color.white;
		g.setColor(cup);
		g.fillRect(100, 100, 50, 100);
		g.setColor(straw);
	}
}
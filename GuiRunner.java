package RestaurantProject;

import javax.swing.JFrame;
import java.awt.*;
/**
 * This class runs the GUI on screen for the user
 */
public class GuiRunner
{
    public static void main(String [] args)
    {
        Gui x=new Gui();
        x.display();
        FoodDrawings drawing=new FoodDrawings();
        JFrame frame=new JFrame("Please X out once you have read");
        frame.add(drawing);
        frame.setVisible(true);
        frame.setSize(new Dimension(500,500));
    }
}

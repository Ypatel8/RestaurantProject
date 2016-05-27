/**
 * Author: Yogin Patel
 * Version: Final
 */
package RestaurantProject;

import javax.swing.JFrame;
import java.awt.*;
/**
 * This class runs the GUI, and the foodDrawings class on screen for the user
 * This is the effective runner of the entire program
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

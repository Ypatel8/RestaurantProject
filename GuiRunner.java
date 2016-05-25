import javax.swing.JFrame;
public class GuiRunner
{
    public static void main(String [] args)
    {
        Gui x=new Gui();
        x.display();
        FoodDrawings drawing=new FoodDrawings();
        JFrame frame=new JFrame("Drawings");
        frame.add(drawing);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

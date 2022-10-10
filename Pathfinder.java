import java.awt.*;

public class Pathfinder
{
    public static Canvas canvas = new Canvas();
    public static int SCREENWIDTH = 1000;
    public static int SCREENHEIGHT = 800;

    public static void main (String args[])
    {
        canvas.setSize(SCREENWIDTH, SCREENHEIGHT);
        canvas.setVisible(true);
        Graphics g = canvas.getGraphics();
        canvas.drawfield(g);

        
    }
}
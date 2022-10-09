import java.awt.*;
import java.io.*;

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
        g.setColor(Color.BLACK);
		g.fillRect(0, 0, SCREENWIDTH, SCREENHEIGHT);
        canvas.drawfield(g);
    }

}
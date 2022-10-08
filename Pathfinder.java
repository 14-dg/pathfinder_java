import java.awt.*;
import java.io.*;

public class Pathfinder
{
    public static Canvas canvas = new Canvas();

    public static void main (String args[])
    {
        canvas.setSize(1000, 800);
        canvas.setVisible(true);
        Graphics g = canvas.getGraphics();
        canvas.drawfield(g);
    }

}
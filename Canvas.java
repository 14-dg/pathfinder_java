import java.awt.*;
import javax.swing.JFrame;

public class Canvas extends JFrame {    
    int start_x  = 50;
    int start_y  = 50;   
    int end_x    = 950;
    int end_y    = 750;
    int distance = 20;  

    public Canvas(){        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }          

    public void drawfield(Graphics g){        
        // sets the backgroundcolor to black
        getContentPane().setBackground(Color.BLACK);
        g.setColor(Color.BLUE);
        for (int x = start_x; x < end_x; x+=distance){
            for (int y = start_y; y < end_y; y+=distance){
                g.fillRect(x, y, distance-1, distance-1);
            }
        }
    }
}
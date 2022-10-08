import java.awt.*;
import javax.swing.JFrame;

public class Canvas extends JFrame {    
    int start_x  = 100;
    int start_y  = 100;   
    int end_x    = 800;
    int end_y    = 700;
    int distance = 100;  

    public Canvas(){        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }          
  
    
    public void drawCross(Graphics g, int x, int y){
        x+=1;
        y+=1;
        g.setColor(Color.GREEN);
        g.drawLine(x*distance, y*distance, x*distance + distance, y*distance + distance);      
        g.drawLine(x*distance + distance, y*distance, x*distance, y*distance + distance);      
    }

    public void drawCircle(Graphics g, int x, int y){
        x+=1;
        y+=1;
        // g.setColor(Color.BLUE);
        g.fillOval(x*100 +1, y*100 +1, distance-20, distance-20);    
    }

    public void drawfield2(Graphics g){
        g.setColor(Color.BLUE);
        
        for (int x = start_x; x < end_x; x+=distance){
            for (int y = start_y; y < end_y; y+=distance){
                g.drawLine(x, y, x+100, y);
                g.drawLine(x, y, x, y+100);

            }
        }
        g.drawLine(end_x, start_y, end_x, end_y);        
        g.drawLine(start_x, end_y, end_x, end_y);  
    }

    public void drawfield(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(start_x-50, start_y-50, end_x, end_y);
        g.setColor(Color.WHITE);
        for (int x = start_x; x < end_x; x+=distance){
            for (int y = start_y; y < end_y; y+=distance){
                g.fillOval(x, y, distance-20, distance-20);
                g.fillOval(x, y, distance-20, distance-20);

            }
        }
    }

    public void won(Graphics g, String name){        
        g.setFont(new Font("Dialog", Font.PLAIN, 60));
		g.setColor(Color.BLACK);
		g.drawString(name + " hat gewonnen!", 200,400);
    }

    public void draw(Graphics g){
        g.setFont(new Font("Dialog", Font.PLAIN, 60));
		g.setColor(Color.BLACK);
		g.drawString("unentschieden!", 200,400);
    }
}
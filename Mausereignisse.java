import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;

import javax.swing.JFrame;

public class Mausereignisse implements MouseListener {

    public Mausereignisse() {
        JFrame frame = new JFrame("Maus Ereignisse");
        frame.addMouseListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse " + e.getClickCount() + " times clicked at "
                + e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse " + e.getClickCount() + " times pressed at "
                + e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse " + e.getClickCount() + " times released at "
                + e.getPoint());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at " + e.getPoint());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at " + e.getPoint());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Mausereignisse());
    }
}
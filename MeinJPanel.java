package grafic_1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MeinJPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.fillOval(0,  0, this.getWidth(), this.getHeight());
    }
}


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class CopoDeNieve extends JPanel {

    double sin60 = Math.sin(Math.PI / 3);
    int recursividad = 7;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Copo de Nieve de Sierpinski (Koch)");
        CopoDeNieve panel = new CopoDeNieve();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1000, 1000);
        ventana.add(panel);
        ventana.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        double xp1 = 400, yp1 = 100;
        double xp2 = 200, yp2 = 500;
        double xp3 = 600, yp3 = 500;

        pintarCopoDeNieve(g, recursividad, xp1, yp1, xp2, yp2);
        pintarCopoDeNieve(g, recursividad, xp2, yp2, xp3, yp3);
        pintarCopoDeNieve(g, recursividad, xp3, yp3, xp1, yp1);
    }

    private void pintarCopoDeNieve(Graphics g, int nivel, double xp1, double yp1, double xp2, double yp2) {
        if (nivel == 0) {
            g.setColor(Color.blue);
            g.drawLine((int) xp1, (int) yp1, (int) xp2, (int) yp2);
        } else {
            double dx = (xp2 - xp1) / 3;
            double dy = (yp2 - yp1) / 3;

            double x1 = xp1 + dx;
            double y1 = yp1 + dy;
            double x2 = xp1 + 2 * dx;
            double y2 = yp1 + 2 * dy;

            double xx = (x1 + x2) / 2 - (dy * sin60);
            double yy = (y1 + y2) / 2 + (dx * sin60);

            pintarCopoDeNieve(g, nivel - 1, xp1, yp1, x1, y1);
            pintarCopoDeNieve(g, nivel - 1, x1, y1, xx, yy);
            pintarCopoDeNieve(g, nivel - 1, xx, yy, x2, y2);
            pintarCopoDeNieve(g, nivel - 1, x2, y2, xp2, yp2);
        }
    }
}


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

    protected void graficarCopo(Graphics g) {
        super.graficarCopo(g);

        double xp1 = 400, yp1 = 100;
        double xp2 = 200, yp2 = 500;
        double xp3 = 600, yp3 = 500;

        pintarCopoDeNieve(g, recursividad, xp1, yp1, xp2, yp2);
        pintarCopoDeNieve(g, recursividad, xp2, yp2, xp3, yp3);
        pintarCopoDeNieve(g, recursividad, xp3, yp3, xp1, yp1);
    }
}

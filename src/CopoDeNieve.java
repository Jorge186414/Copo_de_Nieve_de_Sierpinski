
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class CopoDeNieve extends JPanel{
     double sin60 = Math.sin(Math.PI / 3);
     int recursividad = 7;
     
     public static void main (String []args){
         JFrame ventana = new JFrame("Copo de Nieve de Sierpinski (Koch)");
         CopoDeNieve panel = new CopoDeNieve();
         
         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ventana.setSize(1000,1000);
         ventana.add(panel);
         ventana.setVisible(true); 
     }
}

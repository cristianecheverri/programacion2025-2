
import javax.swing.JOptionPane;

public class Votar {
    public static void main(String[] args) {
        final int EDAD_MINIMA = 18;
        String cadenaEdad = JOptionPane.showInputDialog("Ingrese su edad");
        int edad = Integer.parseInt(cadenaEdad);
        if (edad >= EDAD_MINIMA) {
            JOptionPane.showMessageDialog(null, "Usted puede votar");
        } else {
            JOptionPane.showMessageDialog(null, "Usted no puede votar");
        } 
    }
}

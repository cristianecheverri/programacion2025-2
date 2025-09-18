
import javax.swing.JOptionPane;

public class Jardin {
    public double calcularValorMatricula() {
        int edad = 6;
        boolean tieneHermano = true;
        double valorAPagar = 0;
        switch (edad) {
            case 1:
                valorAPagar = 400000;
                break;
            case 2:
            case 3:
                valorAPagar = 500000;
                break;
            case 4:
                valorAPagar = 600000;
                break;
            default:
               JOptionPane.showMessageDialog(null, "No se permite la matrícula");
        }
        if (tieneHermano) {
            double descuento = valorAPagar * 0.15;
            valorAPagar = valorAPagar - descuento;
        }
        return valorAPagar;
    }
}

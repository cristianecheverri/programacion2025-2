
import javax.swing.JOptionPane;

public class Main {

    /**
     * este es el método de entrada de la aplicación
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hola, mundo");
        //int numero = 2;
        String numero = "1224345";

        System.out.printf("Numero PI: %3.0f\n", 3.1416);
        int edad = 7;
        if (edad < 12 || edad > 70) {
            // JOptionPane.showMessageDialog(null, "Debe ingresar con un responsable");
        }

        Jardin jardin = new Jardin();
        double valorAPagar = jardin.calcularValorMatricula();
        JOptionPane.showMessageDialog(null, "El valor a pagar es: " + valorAPagar);
    }
}

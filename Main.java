

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
/*
 * 
 
        Jardin jardin = new Jardin();
        double valorAPagar = jardin.calcularValorMatricula();
        JOptionPane.showMessageDialog(null, "El valor a pagar es: " + valorAPagar);
*/
        FrascoDulce frasco = new FrascoDulce();
        frasco.sabor = "Fresa";
        System.out.println("El sabor es: " + frasco.sabor);
        boolean envase = frasco.envasar(250, "2024-06-01");
        boolean envase2 = frasco.envasar(100, "2024-06-01");
        System.out.println("Envase: " + envase);
        System.out.println("Envase2: " + envase2);

        int cantidadExtraida = frasco.extraer(50);
        System.out.println("Cantidad extraida: " + cantidadExtraida);
        System.out.println("Cantidad restante: " + frasco.revisarCantidad());

        int cantidadExtraida2 = frasco.extraer(180);
        System.out.println("Cantidad extraida: " + cantidadExtraida2);
        System.out.println("Cantidad restante: " + frasco.revisarCantidad());

        FigurasGeometricas figuras = new FigurasGeometricas();
        double area = figuras.calcularArea(2.0, 3.0);
    }
}

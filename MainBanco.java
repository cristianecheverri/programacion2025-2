import banco.Banco;
import banco.Cuenta;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        boolean adicionarCuenta1 = banco.adicionarCuenta("123", 0, "Corriente", "123456", "Miguel");
        System.out.println(adicionarCuenta1);

        boolean adicionarCuenta2 = banco.adicionarCuenta("123-4", 1230, "Ahorros", "345678", "Julian");
        System.out.println(adicionarCuenta2);

        Cuenta cuentaEncontrada = banco.buscarCuenta("123-4");
        System.out.println(cuentaEncontrada);

        String titularMayorSaldo = banco.consultarClienteMayorSaldo();
        System.out.printf("El nombre del cliente con mayor saldo es %s ", titularMayorSaldo);
    }
}

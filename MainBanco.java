public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        boolean adicionarCuenta1 = banco.adicionarCuenta("123", 0, "Corriente");
        System.out.println(adicionarCuenta1);

        boolean adicionarCuenta2 = banco.adicionarCuenta("123-4", 1230, "Ahorros");
        System.out.println(adicionarCuenta2);

        Cuenta cuentaEncontrada = banco.buscarCuenta("123-4");
        System.out.println(cuentaEncontrada);
    }
}

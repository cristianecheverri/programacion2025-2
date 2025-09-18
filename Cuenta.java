public class Cuenta {
    String numeroCuenta;
    double saldo;
    String tipo;

    double consultarSaldo() {
        return saldo;
    }

    void consignar(double valor) {
        saldo += valor;
    }

    boolean retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}

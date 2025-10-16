

public class Cuenta {
    String numeroCuenta;
    double saldo;
    String tipo;

    Cuenta(String numero, String tipo) {
        this.numeroCuenta = numero;
        this.saldo = 0;
        this.tipo = tipo;
    }

    Cuenta(String numero, String tipo, double saldoInicial) {
        this.numeroCuenta = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }

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

    String getNumero() {
        return this.numeroCuenta;
    }

    String getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numeroCuenta + " Tipo: " + this.getTipo() + " Saldo: " + this.saldo;
    }
}

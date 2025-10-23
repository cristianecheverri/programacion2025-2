package banco;

public class Cuenta {
    String numeroCuenta;
    double saldo;
    String tipo;
    Cliente titular;

    Cuenta(String numero, String tipo, Cliente titular) {
        this.numeroCuenta = numero;
        this.saldo = 0;
        this.tipo = tipo;
        this.titular = titular;
    }

    Cuenta(String numero, String tipo, double saldoInicial, Cliente titular) {
        this.numeroCuenta = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.titular = titular;
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

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numeroCuenta + " Tipo: " + this.getTipo() + " Saldo: " + this.saldo;
    }
}

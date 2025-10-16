import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    boolean adicionarCuenta(String numero, double saldoInicial, String tipo)
    {
        Cuenta cuentaEncontrada = this.buscarCuenta(numero);
        if (cuentaEncontrada != null) {
            return false;
        }

        Cuenta cuenta_nueva =  new Cuenta(numero, tipo, saldoInicial);
        this.cuentas.add(cuenta_nueva);
        return true;
    }

    Cuenta buscarCuenta(String numero) {
        for(Cuenta cuenta: cuentas) {
            if (cuenta.getNumero().equals(numero)) {
                return cuenta;
            }
        }
        return null;
    }
    
    double consultarTotalDinero() {
        double saldoTotal = 0;
        for(Cuenta cuenta : this.cuentas) {
            saldoTotal += cuenta.consultarSaldo();
        }
        return saldoTotal;
    }
}

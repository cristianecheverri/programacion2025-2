package banco;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular)
    {
        Cuenta cuentaEncontrada = this.buscarCuenta(numero);
        if (cuentaEncontrada != null) {
            return false;
        }
        banco.Cliente cliente1 = new banco.Cliente(cedulaTitular, nombreTitular);

        Cuenta cuenta_nueva =  new Cuenta(numero, tipo, saldoInicial, cliente1);
        this.cuentas.add(cuenta_nueva);
        return true;
    }

    public Cuenta buscarCuenta(String numero) {
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

    public String consultarClienteMayorSaldo() {
        Cuenta cuentaMayor = null;
        double saldoMayor = 0;
        for (Cuenta cuenta: this.cuentas) {
            if (cuenta.consultarSaldo() > saldoMayor) {
                saldoMayor = cuenta.consultarSaldo();
                cuentaMayor = cuenta;
            }
        }
        if (cuentaMayor != null) {
            Cliente clienteMayor = cuentaMayor.getTitular();
            return clienteMayor.getNombre();
        }
        return null;
    } 
}

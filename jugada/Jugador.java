package jugada;

import juego.Dado;

public class Jugador {
    public void jugar(Dado dado1, Dado dado2) {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();

        if (valor1 > valor2) {
            System.out.println("Ganó el primer jugador");
        } else if (valor2 > valor1) {
            System.out.println("Ganó el segundo jugador");
        } else {
            System.out.println("Empataron");
        }
    }
}

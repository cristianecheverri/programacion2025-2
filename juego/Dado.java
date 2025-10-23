package juego;

import java.util.Random;

public class Dado {
    public int lanzar() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(6) + 1;
    }
}

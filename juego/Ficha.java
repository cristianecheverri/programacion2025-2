package juego;

public class Ficha {
    public void mover(Dado unDado) {
        int casillas = unDado.lanzar();
        System.out.printf("Se debe mover %d casillas", casillas);
    }
}

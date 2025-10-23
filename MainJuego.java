public class MainJuego {
    public static void main(String[] args) {
        jugada.Jugador jugador = new jugada.Jugador();
        juego.Dado dado1 = new juego.Dado();
        juego.Dado dado2 = new juego.Dado();
        jugador.jugar(dado1, dado2);
    }
}

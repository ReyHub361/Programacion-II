/**
 * @author Reynaldo Escobar
 * @version 1.0 15/04/2026
 *
 */
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego() {
        this.numeroDeVidas = 0;
        this.record = 0;
    }

    public void reiniciaPartida() {
        // Este método será sobrescrito por las clases hijas
    }

    public void actualizaRecord() {
        // Actualiza el récord si es necesario
    }

    public boolean quitaVida() {
        if (numeroDeVidas > 0) {
            numeroDeVidas--;
            return numeroDeVidas > 0;
        }
        return false;
    }
}


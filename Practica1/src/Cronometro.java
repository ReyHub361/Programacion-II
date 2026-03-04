/**
 * CLASE PRINCIPAL:
 * 1.Cronometro.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */
import java.util.Date;
public class Cronometro {
    // a) Atributos privados
    private long inicia;
    private long finaliza;

    // b) Constructor sin argumentos: inicializa inicia con la hora actual
    public Cronometro() {
        this.inicia = new Date().getTime();
        System.out.println("(b) Constructor: cronómetro iniciado automáticamente.");
    }

    // a) Métodos getter
    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }

    // c) Reinicia inicia a la hora actual
    public void inicia() {
        this.inicia = new Date().getTime();
        System.out.println("(c) Método inicia(): cronómetro reiniciado.");
    }

    // d) Establece finaliza a la hora actual
    public void detener() {
        this.finaliza = new Date().getTime();
        System.out.println("(d) Método detener(): tiempo final registrado.");
    }

    // e) Retorna el lapso de tiempo en milisegundos
    public long lapsoDeTiempo() {
        System.out.println("(e) Método lapsoDeTiempo(): calculando diferencia...");
        return finaliza - inicia;
    }
}

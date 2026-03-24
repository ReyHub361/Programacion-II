/**
 * Clase MiPunto
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 24/03/2026
 *
 */

public class MiPunto {
    private double x;
    private double y;

    // Constructor por defecto: punto (0, 0)
    public MiPunto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con coordenadas especificadas
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter para x
    public double getX() {
        return x;
    }

    // Getter para y
    public double getY() {
        return y;
    }

    // Distancia desde este punto hasta otro punto MiPunto
    public double distancia(MiPunto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distancia desde este punto hasta coordenadas (x, y) dadas
    public double distancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
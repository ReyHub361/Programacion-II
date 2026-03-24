/**
 * TestMiPunto
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 24/03/2026
 *
 */
public class TestMiPunto {
    public static void main(String[] args) {
        // Crear puntos
        MiPunto p1 = new MiPunto(0,0);                // (0, 0)
        MiPunto p2 = new MiPunto(10, 30.5);        // (10, 30.5)

        // Calcular distancia usando método con parámetro MiPunto
        double distancia1 = p1.distancia(p2);
        System.out.println("Distancia de p1 a p2: " + distancia1);

        // Calcular distancia usando método con coordenadas directas
        double distancia2 = p1.distancia(10, 30.5);
        System.out.println("Distancia de (0,0) a (10,30.5): " + distancia2);
    }
}
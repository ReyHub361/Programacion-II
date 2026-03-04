/**
 * CLASE PRINCIPAL: public class TestEstadisticas {
 * . Estadísticas: calcular el promedio y la desviación estándar.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */

import java.util.Locale;
import java.util.Scanner;
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        w.useLocale(Locale.US);

        Estadistica ec = new Estadistica(
                w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(),
                w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble()
        );

        System.out.println("El promedio es: " + ec.promedio());
        System.out.println("La desviación estándar es: " + ec.desviacion());
        w.close();
    }
}

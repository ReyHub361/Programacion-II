/**
 * CLASE PRINCIPAL:
 * 3. Algebra: Ecuaciones Cuadráticas
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */
import java.util.Scanner;
public class TestEcuacionesCuadraticas {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        EcuacionesCuadraticas ec = new EcuacionesCuadraticas(
                w.nextInt(), w.nextInt(), w.nextInt());

        if (ec.getDiscriminante() > 0) {
            System.out.println("La ecuación tiene dos raíces: " + ec.getRaiz1() + ", y: " + ec.getRaiz2());
        } else if (ec.getDiscriminante() == 0) {
            System.out.println("La ecuación tiene una raíz: " + ec.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
        w.close();
    }

}

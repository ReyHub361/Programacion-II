/**
 * CLASE PRINCIPAL:
 * 2. Algebra: ecuación lineal 2 x 2.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */
import java.util.Scanner;
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        EcuacionLineal ec = new EcuacionLineal(
                w.nextInt(), w.nextInt(), w.nextInt(),
                w.nextInt(), w.nextInt(), w.nextInt()
        );

        if (ec.tieneSolucion() == 1) {
            System.out.println("x = " + ec.getX() + ", y = " + ec.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        w.close();
    }
}

/**
 * Clase PruebaAlgebraVectorial
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 24/03/2026
 *
 */
public class PruebaAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial v2 = new AlgebraVectorial(0, 1, 0);
        AlgebraVectorial v3 = new AlgebraVectorial(2, 0, 0);
        AlgebraVectorial v4 = new AlgebraVectorial(4, 0, 0);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        // Pruebas de perpendicularidad
        System.out.println("\n¿v1 perpendicular a v2? (a·b=0): " + v1.perpendicularProductoPunto(v1, v2));
        System.out.println("¿v1 perpendicular a v2? (|a+b|=|a-b|): " + v1.perpendicular(v1, v2));
        System.out.println("¿v1 perpendicular a v2? (|a+b|² = |a|²+|b|²): " + v1.perpendicularTeoremaPitagoras(v1, v2));

        // Pruebas de paralelismo
        System.out.println("\n¿v3 paralelo a v4? (a = r b): " + v1.paralelaEscalar(v3, v4));
        System.out.println("¿v3 paralelo a v4? (a×b = 0): " + v1.paralelaProductoVectorial(v3, v4));
        System.out.println("¿v1 paralelo a v2? (a×b = 0): " + v1.paralelaProductoVectorial(v1, v2));

        // Proyección y componente
        AlgebraVectorial proy = v1.proyeccion(v3, v1);
        System.out.println("\nProyección de v3 sobre v1: " + proy);

        double comp = v1.componente(v3, v1);
        System.out.println("Componente de v3 en v1: " + comp);
    }
}

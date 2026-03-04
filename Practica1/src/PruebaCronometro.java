/**
 * CLASE PRINCIPAL:
 * 1. Cronòmetro
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 */
import java.util.Random;

public class PruebaCronometro {
    public static void main(String[] args) {
        final int TAMANO = 100000;
        int[] arreglo = new int[TAMANO];
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < TAMANO; i++) {
            arreglo[i] = rand.nextInt(1000000);
        }

        // Crear e iniciar el cronómetro
        Cronometro crono = new Cronometro();
        crono.inicia();

        // Ordenar por selección
        ordenacionSeleccion(arreglo);

        // Detener el cronómetro
        crono.detener();

        // Mostrar el tiempo transcurrido
        System.out.println("Tiempo de ordenación por selección: "
                + crono.lapsoDeTiempo() + " ms");
    }

    // Método de ordenación por selección
    public static void ordenacionSeleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Intercambiar
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}

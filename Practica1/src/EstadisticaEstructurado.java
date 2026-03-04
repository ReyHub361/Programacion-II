import java.util.Locale;
import java.util.Scanner;
public class EstadisticaEstructurado {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double x : datos) {
            suma += x;  }
        return (suma / datos.length);
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double sum = 0;
        for (double x : datos) {
            sum += (x - prom) * (x - prom); }
        return Math.sqrt(sum / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 números:");
        w.useLocale(Locale.US);
        for (int i = 0; i < 10; i++) {
            datos[i] = w.nextDouble();}
        System.out.println("Promedio: " + promedio(datos));
        System.out.println("Desviación estándar: " + desviacion(datos));
        w.close();
    }
}

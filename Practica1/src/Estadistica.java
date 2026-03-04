/**
 * 4. Estadísticas: calcular el promedio y la desviación estándar.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */
public class Estadistica {
    private double a; private double b; private double c; private double d; private double e;
    private double f; private double g; private double h; private double i; private double j;

    public Estadistica(double a, double b, double c, double d, double e,
                        double f, double g, double h, double i, double j) {
        this.a = a; this.b = b; this.c = c; this.d = d; this.e = e;
        this.f = f; this.g = g; this.h = h; this.i = i; this.j = j;
    }
    public double promedio() {
        double prom = (a + b + c + d + e + f + g + h + i + j) / 10.0;
        return prom;
    }
    public double desviacion() {
        double prom = promedio();
        double sum = Math.pow(a - prom, 2) + Math.pow(b - prom, 2) + Math.pow(c - prom, 2) +
                Math.pow(d - prom, 2) + Math.pow(e - prom, 2) + Math.pow(f - prom, 2) +
                Math.pow(g - prom, 2) + Math.pow(h - prom, 2) + Math.pow(i - prom, 2) +
                Math.pow(j - prom, 2);
        double desv = Math.sqrt(sum / 9);
        return desv;
    }
}

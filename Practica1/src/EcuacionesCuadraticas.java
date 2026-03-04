/**
 * 3.EcuacionesCuadraticas.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */
public class EcuacionesCuadraticas {
    private int a;
    private int b;
    private int c;

    public EcuacionesCuadraticas(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        double disc = b*b - 4*a*c;
        return disc;
    }
    public double getRaiz1(){
        double raiz1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        return raiz1;
    }
    public double getRaiz2(){
        double raiz2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        return raiz2;
    }
}

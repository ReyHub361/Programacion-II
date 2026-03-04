/**
 * 2. Algebra: ecuación lineal 2 x 2.
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 04/03/2026
 *
 */

public class EcuacionLineal {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public EcuacionLineal(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public double tieneSolucion(){
        if ((a*d-b*c)!=0) {
            return 1; //1 = True
        }
        else {
            return 0; //0 = False
        }
    }
    public double getX(){
        double x = (e*d-b*f)/(a*d-b*c);
        return x;
    }
    public double getY(){
        double y = (a*f-e*c)/(a*d-b*c);
        return y;
    }
}

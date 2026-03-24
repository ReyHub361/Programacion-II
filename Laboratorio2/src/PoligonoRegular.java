/**
 * Clase MiPunto
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 24/03/2026
 *
 */
public class PoligonoRegular {
    // Atributos privados
    private int n;           // número de lados
    private double lado;     // longitud del lado
    private double x;        // coordenada x del centro
    private double y;        // coordenada y del centro

    // Constructor sin argumentos (valores predeterminados)
    public PoligonoRegular() {
        this.n = 3;
        this.lado = 1;
        this.x = 0;
        this.y = 0;
    }

    // Constructor con número de lados y longitud, centro en (0,0)
    public PoligonoRegular(int n, double lado) {
        this.n = n;
        this.lado = lado;
        this.x = 0;
        this.y = 0;
    }

    // Constructor con todos los parámetros
    public PoligonoRegular(int n, double lado, double x, double y) {
        this.n = n;
        this.lado = lado;
        this.x = x;
        this.y = y;
    }

    // Métodos getter y setter
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular el perímetro
    public double getPerimetro() {
        return n * lado;
    }

    // Método para calcular el área
    public double getArea() {
        return (n * lado * lado) / (4 * Math.tan(Math.PI / n));
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("Polígono regular de %d lados, lado = %.2f, centro = (%.2f, %.2f)",
                n, lado, x, y);
    }
    public static void main(String[] args) {
        // Crear tres objetos PoligonoRegular usando diferentes constructores
        PoligonoRegular p1 = new PoligonoRegular();                    // constructor por defecto
        PoligonoRegular p2 = new PoligonoRegular(6, 4);               // hexágono de lado 4
        PoligonoRegular p3 = new PoligonoRegular(10, 4, 5.6, 7.8);    // decágono centrado en (5.6,7.8)

        // Mostrar información y resultados para cada polígono
        System.out.println("Polígono 1:");
        System.out.println(p1);
        System.out.println("Perímetro:"+ p1.getPerimetro());
        System.out.println("Área:"+ p1.getArea());

        System.out.println("Polígono 2:");
        System.out.println(p2);
        System.out.println("Perímetro:"+ p2.getPerimetro());
        System.out.println("Área:"+ p2.getArea());

        System.out.println("Polígono 3:");
        System.out.println(p3);
        System.out.println("Perímetro:"+ p3.getPerimetro());
        System.out.println("Área:"+ p3.getArea());
    }
}

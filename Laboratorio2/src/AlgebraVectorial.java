/**
 * Clase AlgebraVectorial
 *
 * @author Escobar Herbas Reynaldo Jair
 * @version 1.0 24/03/2026
 *
 */
public class AlgebraVectorial {
    private double x, y, z;

    // Constructor por defecto: vector (0,0,0)
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Constructor con parámetros
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Métodos para operaciones vectoriales

    // 1. Perpendicular: |a + b| == |a - b|
    public boolean perpendicular(AlgebraVectorial a, AlgebraVectorial b) {
        AlgebraVectorial suma = new AlgebraVectorial(a.x + b.x, a.y + b.y, a.z + b.z);
        AlgebraVectorial resta = new AlgebraVectorial(a.x - b.x, a.y - b.y, a.z - b.z);
        return Math.abs(suma.modulo() - resta.modulo()) < 1e-9;
    }

    // 2. Perpendicular: |a - b| == |b - a| (siempre es cierto, pero lo incluimos como ejemplo)
    public boolean perpendicularPropiedad2(AlgebraVectorial a, AlgebraVectorial b) {
        AlgebraVectorial resta1 = new AlgebraVectorial(a.x - b.x, a.y - b.y, a.z - b.z);
        AlgebraVectorial resta2 = new AlgebraVectorial(b.x - a.x, b.y - a.y, b.z - a.z);
        return Math.abs(resta1.modulo() - resta2.modulo()) < 1e-9;
    }

    // 3. Perpendicular: a · b == 0
    public boolean perpendicularProductoPunto(AlgebraVectorial a, AlgebraVectorial b) {
        return Math.abs(a.x * b.x + a.y * b.y + a.z * b.z) < 1e-9;
    }

    // 4. Perpendicular: |a + b|² == |a|² + |b|²
    public boolean perpendicularTeoremaPitagoras(AlgebraVectorial a, AlgebraVectorial b) {
        double sumaModCuadrado = Math.pow(a.x + b.x, 2) + Math.pow(a.y + b.y, 2) + Math.pow(a.z + b.z, 2);
        double modACuadrado = a.modulo() * a.modulo();
        double modBCuadrado = b.modulo() * b.modulo();
        return Math.abs(sumaModCuadrado - (modACuadrado + modBCuadrado)) < 1e-9;
    }

    // 5. Paralela: a = r * b  (existencia de escalar r)
    public boolean paralelaEscalar(AlgebraVectorial a, AlgebraVectorial b) {
        // Evitar división por cero
        if (Math.abs(b.x) < 1e-9 && Math.abs(b.y) < 1e-9 && Math.abs(b.z) < 1e-9) return false;
        double r = 0;
        if (Math.abs(b.x) > 1e-9) r = a.x / b.x;
        else if (Math.abs(b.y) > 1e-9) r = a.y / b.y;
        else if (Math.abs(b.z) > 1e-9) r = a.z / b.z;
        else return false;

        return (Math.abs(a.x - r * b.x) < 1e-9 &&
                Math.abs(a.y - r * b.y) < 1e-9 &&
                Math.abs(a.z - r * b.z) < 1e-9);
    }

    // 6. Paralela: a × b == 0 (producto vectorial nulo)
    public boolean paralelaProductoVectorial(AlgebraVectorial a, AlgebraVectorial b) {
        AlgebraVectorial cruz = new AlgebraVectorial(
                a.y * b.z - a.z * b.y,
                a.z * b.x - a.x * b.z,
                a.x * b.y - a.y * b.x
        );
        return Math.abs(cruz.x) < 1e-9 && Math.abs(cruz.y) < 1e-9 && Math.abs(cruz.z) < 1e-9;
    }

    // 7. Proyección de a sobre b: (a·b / |b|²) * b
    public AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double productoPunto = a.x * b.x + a.y * b.y + a.z * b.z;
        double modBCuadrado = b.x * b.x + b.y * b.y + b.z * b.z;
        if (modBCuadrado == 0) return new AlgebraVectorial(); // evitar división por cero
        double factor = productoPunto / modBCuadrado;
        return new AlgebraVectorial(factor * b.x, factor * b.y, factor * b.z);
    }

    // 8. Componente de a en b: (a·b) / |b|
    public double componente(AlgebraVectorial a, AlgebraVectorial b) {
        double productoPunto = a.x * b.x + a.y * b.y + a.z * b.z;
        double modB = b.modulo();
        if (modB == 0) return 0;
        return productoPunto / modB;
    }

    // Método auxiliar para calcular el módulo
    public double modulo() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Método para mostrar el vector
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
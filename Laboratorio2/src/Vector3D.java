public class Vector3D {
    private double x, y, z;

    // Constructor por defecto: vector (0,0,0)
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Constructor con parámetros
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // a) Suma de dos vectores
    public Vector3D sumar(Vector3D b) {
        return new Vector3D(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    // b) Multiplicación por escalar
    public Vector3D multiplicarEscalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    // c) Longitud del vector
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // d) Normalización (vector unitario)
    public Vector3D normalizar() {
        double mod = longitud();
        if (mod == 0) {
            return new Vector3D(); // vector nulo, no se puede normalizar
        }
        return new Vector3D(x / mod, y / mod, z / mod);
    }

    // e) Producto escalar
    public double productoEscalar(Vector3D b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    // f) Producto vectorial
    public Vector3D productoVectorial(Vector3D b) {
        double nx = this.y * b.z - this.z * b.y;
        double ny = this.z * b.x - this.x * b.z;
        double nz = this.x * b.y - this.y * b.x;
        return new Vector3D(nx, ny, nz);
    }

    // Perpendicularidad: |a + b| == |a - b|  (diagonales iguales en el paralelogramo)
    public boolean esPerpendicular(Vector3D b) {
        Vector3D suma = this.sumar(b);
        Vector3D resta = this.sumar(b.multiplicarEscalar(-1)); // this - b
        return Math.abs(suma.longitud() - resta.longitud()) < 1e-9;
    }

    // Representación del vector como cadena
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    // Método main de prueba
    public static void main(String[] args) {
        // Crear vectores
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, 1, 0);
        Vector3D v3 = new Vector3D(2, 3, 4);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        // Suma
        Vector3D suma = v1.sumar(v2);
        System.out.println("v1 + v2 = " + suma);

        // Multiplicación por escalar
        Vector3D escalado = v3.multiplicarEscalar(2);
        System.out.println("2 * v3 = " + escalado);

        // Longitud
        System.out.println("|v3| = " + v3.longitud());

        // Normalización
        Vector3D unitario = v3.normalizar();
        System.out.println("Unitario de v3 = " + unitario);
        System.out.println("Longitud del unitario = " + unitario.longitud());

        // Producto escalar
        double pe = v1.productoEscalar(v2);
        System.out.println("v1 · v2 = " + pe);

        // Producto vectorial
        Vector3D pv = v1.productoVectorial(v2);
        System.out.println("v1 × v2 = " + pv);

        // Perpendicularidad
        System.out.println("¿v1 perpendicular a v2? " + v1.esPerpendicular(v2));
        System.out.println("¿v1 perpendicular a v3? " + v1.esPerpendicular(v3));
    }
}


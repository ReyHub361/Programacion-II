public class Aplicacion {
    public static void main(String[] args) {
        // Crear instancias de los tres juegos con 3 vidas cada uno
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        // Jugar los tres juegos en secuencia
        System.out.println("LOS JUEGOS DE ADIVINANZA");
        System.out.println("=====================================");

        juegoNormal.juega();
        juegoPar.juega();
        juegoImpar.juega();

        System.out.println("\n¡Gracias por jugar!");
    }
}

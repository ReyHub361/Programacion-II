import java.util.Scanner;
import java.util.Random;
/**
 * @author Reynaldo Escobar
 * @version 1.0 15/04/2026
 *
 */

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super();
        this.numeroDeVidas = vidas;
    }

    @Override
    public void reiniciaPartida() {
        numeroDeVidas = 3; // Reinicia las vidas a su valor inicial
    }

    @Override
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("¡NUEVO RÉCORD! Vidas restantes: " + record);
        }
    }

    @Override
    public boolean quitaVida() {
        if (numeroDeVidas > 0) {
            numeroDeVidas--;
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return numeroDeVidas > 0;
        }
        return false;
    }

    // Nuevo método validaNumero
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        reiniciaPartida();
        numeroAAdivinar = random.nextInt(11);

        System.out.println("\n=== JUEGO: Adivina el Número ===");
        System.out.println("Tienes " + numeroDeVidas + " vidas.");

        while (numeroDeVidas > 0) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            // Validar el número ingresado
            if (!validaNumero(intento)) {
                System.out.println("ERROR: El número debe estar entre 0 y 10.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡ACERTASTE!!");
                actualizaRecord();
                break;
            } else {
                System.out.println("¡Fallaste!");

                boolean tieneVidas = quitaVida();

                if (tieneVidas) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es MAYOR que " + intento);
                    } else {
                        System.out.println("El número a adivinar es MENOR que " + intento);
                    }
                    System.out.println("¡Inténtalo de nuevo!");
                } else {
                    System.out.println("¡GAME OVER! Te has quedado sin vidas.");
                    System.out.println("El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}

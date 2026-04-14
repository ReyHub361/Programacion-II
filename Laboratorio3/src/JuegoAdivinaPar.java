import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        // Primero valida que esté en el rango
        if (numero < 0 || numero > 10) {
            System.out.println("ERROR: El número debe estar entre 0 y 10.");
            return false;
        }

        // Luego valida que sea par
        if (numero % 2 != 0) {
            System.out.println("ERROR: El número debe ser PAR. Has ingresado un número impar: " + numero);
            return false;
        }

        return true;
    }

    @Override
    public void juega() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        reiniciaPartida();

        // Generar un número par aleatorio entre 0 y 10
        do {
            numeroAAdivinar = random.nextInt(11);
        } while (numeroAAdivinar % 2 != 0);

        System.out.println("\n=== JUEGO: Adivina el Número PAR ===");
        System.out.println("Tienes " + numeroDeVidas + " vidas.");
        System.out.println("Solo puedes ingresar números PARES entre 0 y 10.");

        while (numeroDeVidas > 0) {
            System.out.print("Adivina un número PAR entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
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
                        System.out.println("El número PAR a adivinar es MAYOR que " + intento);
                    } else {
                        System.out.println("El número PAR a adivinar es MENOR que " + intento);
                    }
                    System.out.println("¡Inténtalo de nuevo!");
                } else {
                    System.out.println("¡GAME OVER! Te has quedado sin vidas.");
                    System.out.println("El número PAR era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}

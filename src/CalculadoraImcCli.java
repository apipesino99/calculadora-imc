import java.util.Scanner;

public class CalculadoraImcCli {

    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {

        int opcion = 0;

        do {

            mostrarMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un numero valido.");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Funcionalidad pendiente.");
                    break;

                case 2:
                    System.out.println("Funcionalidad pendiente.");
                    break;

                case 3:
                    System.out.println("Funcionalidad pendiente.");
                    break;

                case 4:
                    System.out.println("Funcionalidad pendiente.");
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

    private void mostrarMenu() {

        System.out.println();
        System.out.println("=== Calculadora de IMC ===");
        System.out.println("1. Calcular IMC");
        System.out.println("2. Clasificar IMC");
        System.out.println("3. Calcular peso minimo recomendado");
        System.out.println("4. Calcular peso maximo recomendado");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }
}
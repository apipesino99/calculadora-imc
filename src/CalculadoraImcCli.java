import java.util.Scanner;

public class CalculadoraImcCli {

    private final Scanner scanner = new Scanner(System.in);
    private final CalculadoraImc calculadora = new CalculadoraImc();

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
                    ejecutarCalculoImc();
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

    private void ejecutarCalculoImc() {

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        if (peso <= 0 || estatura <= 0) {
            System.out.println("El peso y la estatura deben ser positivos.");
            return;
        }

        double imc = calculadora.calcularImc(peso, estatura);

        System.out.printf("Su IMC es: %.2f%n", imc);
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
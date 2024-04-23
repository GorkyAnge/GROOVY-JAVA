import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shakira shakira = new Shakira();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ejecutar Función desde JAVA");
            System.out.println("2. Ejecutar un script personalizado");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    shakira.executeHelloJava();
                    break;
                case 2:
                    //println "El valor de la variable es: " + variable
                    //println "El valor de la variable multiplicado por 2 es: " + variable.toInteger() * 2
                    System.out.print("Ingrese el script personalizado: ");
                    scanner.nextLine(); // Consuming newline character
                    String script = scanner.nextLine();
                    System.out.print("Ingrese la variable: ");
                    String variable = scanner.nextLine();
                    Object result = shakira.executeScript(script, variable);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

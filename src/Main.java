import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shakira shakira = new Shakira();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ejecutar Función desde JAVA");
            System.out.println("2. Ejecutar un script personalizado (utilizando Shakira)");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    shakira.executeHelloJava();
                    break;
                case 2:

                    //EJEMPLOS DE SCRIPTS PERSONALIZADOS
                    //println "Hello from Groovy!"

                    System.out.print("Ingrese el script personalizado: ");
                    scanner.nextLine(); // Consuming newline character
                    String script = scanner.nextLine();
                    shakira.setStringScript(script);
                    Object result = shakira.executeScript(script);
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

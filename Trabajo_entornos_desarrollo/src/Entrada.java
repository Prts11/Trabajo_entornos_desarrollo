import controller.Registro;
import model.Usuario;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Registro registroInicio = new Registro();

        do {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce tu edad:");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce tu telefono:");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce tu correo:");
                    String correo = scanner.nextLine();
                    System.out.println("Introduce una contraseña:");
                    String contrasena = scanner.nextLine();
                    System.out.println("Introduce tu dni:");
                    String dni = scanner.nextLine();

                    Usuario usuario1 = new Usuario(dni, edad, correo, telefono, nombre, contrasena);
                    registroInicio.agregarUsuario(usuario1);
                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige nuevamente.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}


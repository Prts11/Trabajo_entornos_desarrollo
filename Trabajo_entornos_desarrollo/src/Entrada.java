import controller.Registro_Inicio;

import model.Usuario;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean loggin;

        Registro_Inicio registroInicio = new Registro_Inicio();

        do {
            System.out.println("------------------------");
            System.out.println("----Concesionario-SS----");
            System.out.println("------------------------");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("------------------------");
                    System.out.println("--------REGISTRO--------");
                    System.out.println("------------------------");
                    System.out.println("Introduce un nombre de usuario:");
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
                    System.out.println("------------------------");
                    System.out.println("-----INICIO-SESION------");
                    System.out.println("------------------------");
                    System.out.println("Introduce el nombre de usuario");
                    String nombreUsuario=scanner.next();
                    System.out.println("Introduce la contraseña");
                    String contrasena1= scanner.next();
                    registroInicio.iniciarSesion(nombreUsuario,contrasena1);
                    if(registroInicio.isLoggin()){
                        do {
                            System.out.println("-----------------------------");
                            System.out.println("---------BIENVENIDOS---------");
                            System.out.println("-----------------------------");
                            System.out.println("1.Catalogo");
                            System.out.println("2.Reserva");
                            System.out.println("3.Ubicacion y sobre nosotros");
                            System.out.println("4.Editar perfil");
                            System.out.println("5.Salir");
                            opcion=scanner.nextInt();
                            switch (opcion){
                                case 1:
                                    do {
                                        System.out.println("-----------------------------");
                                        System.out.println("----------CATÁLOGO-----------");
                                        System.out.println("-----------------------------");
                                        System.out.println("1.Coches");
                                        System.out.println("2.Motos");
                                        System.out.println("3.Atras");
                                        opcion= scanner.nextInt();
                                        switch (opcion){
                                            case 1:
                                                do {
                                                    System.out.println("-----------------------------");
                                                    System.out.println("-----------COCHES------------");
                                                    System.out.println("-----------------------------");
                                                    System.out.println("1.Ford focus");
                                                    System.out.println("2.Renault megan");
                                                    System.out.println("3.Atras");
                                                    opcion= scanner.nextInt();
                                                    switch (opcion){
                                                        case 1:
                                                            do {
                                                            System.out.println("-----------------------------");
                                                            System.out.println("---------FORD-FOCUS----------");
                                                            System.out.println("-----------------------------");
                                                            System.out.println("1.Precio:");
                                                            System.out.println("2.Motor:");
                                                            System.out.println("3.CV:");
                                                            System.out.println("4.Vmax:");
                                                                System.out.println("Pulsa 5 para salir");
                                                                opcion=scanner.nextInt();
                                                            }while (opcion!=5);
                                                            break;
                                                        case 2:
                                                            do {
                                                            System.out.println("-----------------------------");
                                                            System.out.println("-------RENAULT-MEGAN---------");
                                                            System.out.println("-----------------------------");
                                                            System.out.println("1.Precio:");
                                                            System.out.println("2.Motor:");
                                                            System.out.println("3.CV:");
                                                            System.out.println("4.Vmax:");
                                                            System.out.println("Pulsa 5 para salir");
                                                            opcion=scanner.nextInt();
                                                    }while (opcion!=5);
                                                            break;
                                                        case 3:
                                                            break;
                                                    }
                                                }while (opcion!=3);
                                                break;
                                            case 2:
                                                do {
                                                    System.out.println("-----------------------------");
                                                    System.out.println("-----------MOTOS-------------");
                                                    System.out.println("-----------------------------");
                                                    System.out.println("1.Kawasaki ninja h2r");
                                                    System.out.println("2.Honda CBR");
                                                    System.out.println("3.Atras");
                                                    opcion= scanner.nextInt();
                                                    switch (opcion){
                                                        case 1:
                                                            do {
                                                            System.out.println("-----------------------------");
                                                            System.out.println("------KAWASAKI-NINJA-H2R-----");
                                                            System.out.println("-----------------------------");
                                                            System.out.println("1.Precio:55.000€");
                                                            System.out.println("2.Motor:4 cilindros y 1000 CC");
                                                            System.out.println("3.CV:326");
                                                            System.out.println("4.Vmax:400km/h");
                                                                System.out.println("Pulsa 5 para salir");
                                                                opcion=scanner.nextInt();
                                                            }while (opcion!=5);
                                                            break;
                                                        case 2:
                                                            do {


                                                            System.out.println("-----------------------------");
                                                            System.out.println("-------HONDA-CBR-650R--------");
                                                            System.out.println("-----------------------------");
                                                            System.out.println("1.Precio:9700€");
                                                            System.out.println("2.Motor:4 cilindros y 649 CC");
                                                            System.out.println("3.CV:95");
                                                            System.out.println("4.Vmax:225km/h");
                                                                System.out.println("Pulsa 5 para salir");
                                                                opcion=scanner.nextInt();
                                                            }while (opcion!=5);
                                                            break;
                                                        case 3:
                                                            break;
                                                    }
                                                }while (opcion!=3);
                                                break;
                                            case 3:
                                                break;
                                        }
                                    }while (opcion!=3);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                            }

                        }while (opcion!=5);
                    }

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



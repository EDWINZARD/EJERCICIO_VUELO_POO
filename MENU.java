import java.util.Scanner;

public class Main {
    //Ingreso usuario
    public static void main(String[] args) {
        String NombreUsuario = "EDWINZARD";
        String correousuario = "esermitanov@udistrital.edu.co";
        String contraseñausuario = "12345";

        Scanner Scanner;
        Scanner = new Scanner(System.in);

        System.out.println("ingrese su correo: " + correousuario);
        String inputcorreo;
        inputcorreo = Scanner.nextLine();

        System.out.println("ingrese su usuario: " + NombreUsuario);
        String inputUsuario;
        inputUsuario = Scanner.nextLine();

        System.out.println("ingrese su contraseña:" + contraseñausuario);
        String inputcontraseña;
        inputcontraseña = Scanner.nextLine();

        if (inputcorreo.equals(NombreUsuario)) {
            if (inputcorreo.equals(pass)) {
                System.out.println("¡Inicio de sesión exitoso!");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else if (inputUsuario.equals(NombreUsuario)) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Correo incorrecto");
        }

        //Ingreso MENU
        Scanner reader = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("1.Consulta Vuelos");
            System.out.println("2.Reserva Vuelos");
            System.out.println("3.Compra de Tickets");
            System.out.println("4.Salir");
            System.out.println("ingrese una opcion: ");
            int op = reader.nextInt();
            switch (op) {
                case 1:
                    System.out.println("se encuentra consultando los vuelos");
                    break;
                case 2:
                    System.out.println("se encuentra reservando vuelos");
                    break;
                case 3:
                    System.out.println("se encuentra comprando los tickets");
                    break;
                case 4:
                    System.out.println("Esta saliendo");
                    salir = true;
                    break;
                default:
                    System.out.println("datos invalidos");

            }
        } while (!salir);
    }
}

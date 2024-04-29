import java.util.Scanner;

public class Main {
    enum Color { BLANCO(1), AZUL(2), VERDE(3), ROJO(4) }

    public static void main(String[] args) {
        Color rotulador = Color.ROJO;
        int opcion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al programa de colores!");
        System.out.println("Por favor, seleccione un color:");
        for (Color color : Color.values()) {
            System.out.println(color.ordinal() + 1 + ". " + color);
        }

        boolean seleccionValida = false;
        while (!seleccionValida) {
            System.out.print("Opción seleccionada: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= Color.values().length) {
                    rotulador = Color.values()[opcion - 1];
                    seleccionValida = true;
                } else {
                    System.out.println("Por favor, seleccione una opción válida.");
                }
            } else {
                System.out.println("Por favor, introduzca un número.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        switch (rotulador) {
            case ROJO:
                System.out.println("Ha seleccionado el color rojo.");
                break;
            case AZUL:
                System.out.println("Ha seleccionado el color azul.");
                break;
            case VERDE:
                System.out.println("Ha seleccionado el color verde.");
                break;
            case BLANCO:
                System.out.println("Ha seleccionado el color blanco.");
                break;
            default:
                System.out.println("Color indefinido.");
                break;
        }
        scanner.close();
    }
}

using System;

public class App
{
    enum Color { BLANCO = 1, AZUL = 2, VERDE = 3, ROJO = 4 }

    public static void Main(string[] args)
    {
        Color rotulador = Color.ROJO;
        int opcion;
        Console.WriteLine("¡Bienvenido al programa de colores!");
        Console.WriteLine("Por favor, seleccione un color:");
        Console.WriteLine("1. Blanco");
        Console.WriteLine("2. Azul");
        Console.WriteLine("3. Verde");
        Console.WriteLine("4. Rojo");

        bool seleccionValida = false;
        while (!seleccionValida)
        {
            Console.Write("Opción seleccionada: ");
            if (int.TryParse(Console.ReadLine(), out opcion) && Enum.IsDefined(typeof(Color), opcion))
            {
                rotulador = (Color)opcion;
                seleccionValida = true;
            }
            else
            {
                Console.WriteLine("Por favor, seleccione una opción válida.");
            }
        }

        switch (rotulador)
        {
            case Color.ROJO:
                Console.WriteLine("Ha seleccionado el color rojo.");
                break;
            case Color.AZUL:
                Console.WriteLine("Ha seleccionado el color azul.");
                break;
            case Color.VERDE:
                Console.WriteLine("Ha seleccionado el color verde.");
                break;
            case Color.BLANCO:
                Console.WriteLine("Ha seleccionado el color blanco.");
                break;
            default:
                Console.WriteLine("Color indefinido.");
                break;
        }
    }
}

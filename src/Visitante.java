import java.util.Scanner;

public class Visitante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Es propietario? (true/false): ");
        boolean esPropietario = scanner.nextBoolean();

        System.out.print("Ingrese su género (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Ingrese su numero de teléfono: ");
        long telefono = scanner.nextLong();

        System.out.print("Ingrese su altura en centimetros: ");
        float altura = scanner.nextFloat();

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Es propietario: " + esPropietario);
        System.out.println("Género: " + genero);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
    }
}

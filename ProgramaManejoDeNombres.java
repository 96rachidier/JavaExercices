import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creo objeto tipo scanner

        System.out.println("Ingrese el nombre del familiar 1:"); //solicito ingresar cada nombre
        String nombreA = scanner.nextLine(); //creo variable para almacenar el nombre ingresado
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length() - 2); //uso 3 métodos para transformar el string ingresado

        System.out.println("Ingrese el nombre del familiar 2:"); //repito el proceso 2 veces más
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length() - 2);

        System.out.println("Ingrese el nombre del familiar 3:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length() - 2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
        System.out.println(resultado);
    }
}
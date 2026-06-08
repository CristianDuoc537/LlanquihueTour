package app;

import model.Cliente;
import model.Direccion;

import java.util.Scanner;

/**
 * Esta es la clase principal donde creamos nuestros objetos.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int opcion;
        System.out.print("1. cliente001\n");
        System.out.print("2. cliente002\n");
        System.out.print("3. cliente003\n");

        do {
            System.out.print("\nIngrese el numero de cliente: ");
            opcion = Integer.parseInt(scn.nextLine());
            switch (opcion) {
                case 1:
                    Direccion dir001 = new Direccion("La Serena", "Avenida del Mar", 235);
                    Cliente cliente001 = new Cliente(
                            "Camila Torres",
                            dir001,
                            "68295738",
                            "Camila_Torres@gmail.com",
                            10);
                    System.out.println("\nCliente 001:\n");
                    System.out.println(cliente001);
                    break;

                case 2:
                    Direccion dir002 = new Direccion("La Serena", "Avenida Francisco de Aguirre", 1425);
                    Cliente cliente002 = new Cliente(
                            "Diego Herrera",
                            dir002,
                            "86251946",
                            "Diego3764@gmail.com",
                             12);
                    System.out.println("\nCliente 002:\n");
                    System.out.println(cliente002);
                    break;
                case 3:
                    Direccion dir003 = new Direccion("Coquimbo", "Aldunate", 634);
                    Cliente cliente003 = new Cliente(
                            "Valentina Díaz",
                            dir003,
                            "95731625",
                            "Valentina12873gmail.com",
                            2);
                    System.out.println("\nCliente 003:\n");
                    System.out.println(cliente003);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
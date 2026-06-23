package app;

import model.Cliente;
import model.Direccion;
import service.GestorClientes;

import java.util.Scanner;

/**
 * Esta es la clase principal donde creamos nuestros objetos.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int opcion;
        System.out.print("1. Ver todos los Clientes\n");
        System.out.print("2. Buscar Cliente\n");
        System.out.print("3. \n");


        GestorClientes gestor = new GestorClientes();
        do {
            System.out.print("\nIngrese el numero de solicitud: ");
            opcion = Integer.parseInt(scn.nextLine());

            switch (opcion) {
                case 1:

                    gestor.cargarClientes("src/resources/clientes.txt");
                    gestor.mostrarClientes();
                    break;

                case 2:

                    gestor.buscarCliente();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
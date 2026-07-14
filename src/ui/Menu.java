package ui;

import data.GestorClientes;
import java.util.Scanner;

public class Menu {

    private final Scanner scn = new Scanner(System.in);
    private final GestorClientes gestor = new GestorClientes();

    public void iniciar() {

        gestor.cargarClientes("src/resources/clientes.txt");

        int opcion;

        do {
            mostrarMenu();

            System.out.print("\nIngrese el número de solicitud: ");
            opcion = Integer.parseInt(scn.nextLine());

            switch (opcion) {

                case 1:
                    gestor.mostrarClientes();
                    break;

                case 2:
                    gestor.buscarCliente();
                    break;

                case 3:
                    // Otra opción
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Ver todos los clientes");
        System.out.println("2. Buscar cliente");
        System.out.println("3. ...");
        System.out.println("0. Salir");
    }
}
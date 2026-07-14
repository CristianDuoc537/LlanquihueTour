package data;

import model.Cliente;
import model.Direccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase se encarga de administrar los datos de clientes
 */

public class GestorClientes {

    private ArrayList<Cliente> clientes;

    public GestorClientes() {

        clientes = new ArrayList<>();
    }

    public void cargarClientes(String rutaArchivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Direccion direccion = new Direccion(
                        datos[1],
                        datos[2],
                        Integer.parseInt(datos[3])
                );

                Cliente cliente = new Cliente(
                        datos[0],
                        direccion,
                        datos[4],
                        datos[5]
                );

                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }

    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println();
        }
    }

    public void buscarCliente() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreBuscado = teclado.nextLine();

        boolean encontrado = false;

        for (Cliente cliente : clientes) {

            if (cliente.getNombre().equalsIgnoreCase(nombreBuscado)) {

                System.out.println("\n Cliente encontrado!\n");
                System.out.println(cliente);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }
    public void registrarCliente () {

    }
}
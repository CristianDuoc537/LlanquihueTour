package data;

import model.Cliente;
import model.Direccion;
import util.ArchivoUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorCLiente {

    public void guardarCliente(Cliente cliente) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/resources/cliente.txt", true))) {

            bw.write(
                    cliente.getNombre() + ";" +
                            cliente.getRut() + ";" +
                            cliente.getCorreoElectronico() + ";" +
                            cliente.getDireccion().getComuna() + ";" +
                            cliente.getDireccion().getCalle() + ";" +
                            cliente.getDireccion().getNumero() + ";" +
                            cliente.getIdCliente() + ";" +
                            cliente.getTipoCLiente()
            );

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar guía: " + e.getMessage());
        }
    }
    public ArrayList<Cliente> cargarClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        ArrayList<String> lineas = ArchivoUtil.leerArchivo("src/resources/cliente.txt");
        //System.out.println("Líneas: " + lineas.size());
        for (String linea : lineas) {

            String[] datos = linea.split(";");

            Direccion direccion = new Direccion(
                    datos[3],
                    datos[4],
                    Integer.parseInt(datos[5])
            );
            Cliente cliente = new Cliente(
                    datos[0],
                    datos[1],
                    datos[2],
                    direccion,
                    datos[6],
                    datos[7]
            );

            listaClientes.add(cliente);
        }

        return listaClientes;
    }
}

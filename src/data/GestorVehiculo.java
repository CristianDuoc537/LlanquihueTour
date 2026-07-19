package data;

import model.Vehiculo;
import util.ArchivoUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorVehiculo {

    public void guardarVehiculo(Vehiculo vehiculo) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/resources/vehiculo.txt", true))) {

            bw.write(
                    vehiculo.getMarca() + ";" +
                            vehiculo.getPatente()
            );

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar guía: " + e.getMessage());
        }
    }

    public ArrayList<Vehiculo> cargarVehiculos() {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        ArrayList<String> lineas = ArchivoUtil.leerArchivo("src/resources/vehiculo.txt");

        for (String linea : lineas) {

            String[] datos = linea.split(";");

            Vehiculo vehiculo = new Vehiculo(
                    datos[0],
                    datos[1]
            );

            listaVehiculos.add(vehiculo);
        }

        return listaVehiculos;
    }
}

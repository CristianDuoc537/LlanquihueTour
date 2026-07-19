package data;

import model.Direccion;
import model.GuiaTuristico;
import util.ArchivoUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorGuiaTuristico {

    public void guardarGuia(GuiaTuristico guia) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/resources/guiaTuristico.txt", true))) {

            bw.write(
                    guia.getNombre() + ";" +
                            guia.getRut() + ";" +
                            guia.getCorreoElectronico() + ";" +
                            guia.getDireccion().getComuna() + ";" +
                            guia.getDireccion().getCalle() + ";" +
                            guia.getDireccion().getNumero() + ";" +
                            guia.getEspecialidad()
            );

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar guía: " + e.getMessage());
        }
    }

    public ArrayList<GuiaTuristico> cargarGuias() {

        ArrayList<GuiaTuristico> listaGuias = new ArrayList<>();

        ArrayList<String> lineas = ArchivoUtil.leerArchivo("src/resources/guiaTuristico.txt");

        for (String linea : lineas) {

            String[] datos = linea.split(";");

            Direccion direccion = new Direccion(
                    datos[3],
                    datos[4],
                    Integer.parseInt(datos[5])
            );

            GuiaTuristico guia = new GuiaTuristico(
                    datos[0],
                    datos[1],
                    datos[2],
                    direccion,
                    datos[6]
            );

            listaGuias.add(guia);
        }

        return listaGuias;
    }
}

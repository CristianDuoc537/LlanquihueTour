package data;

import model.ColaboradorExterno;
import model.Direccion;
import util.ArchivoUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorColaboradorExterno {

    public void guardarColaboradorExterno(ColaboradorExterno colaborador) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/resources/colaboradorExterno.txt", true))) {

            bw.write(
                    colaborador.getNombre() + ";" +
                            colaborador.getRut() + ";" +
                            colaborador.getCorreoElectronico() + ";" +
                            colaborador.getDireccion().getComuna() + ";" +
                            colaborador.getDireccion().getCalle() + ";" +
                            colaborador.getDireccion().getNumero() + ";" +
                            colaborador.getServicioPrestado()
            );

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar guía: " + e.getMessage());
        }
    }

    public ArrayList<ColaboradorExterno> cargarColaboradores() {

        ArrayList<ColaboradorExterno> listaColaboradores = new ArrayList<>();

        ArrayList<String> lineas = ArchivoUtil.leerArchivo("src/resources/colaboradorExterno.txt");

        for (String linea : lineas) {

            String[] datos = linea.split(";");

            Direccion direccion = new Direccion(
                    datos[3],
                    datos[4],
                    Integer.parseInt(datos[5])
            );

            ColaboradorExterno colaborador = new ColaboradorExterno(
                    datos[0],
                    datos[1],
                    datos[2],
                    direccion,
                    datos[6]
            );

            listaColaboradores.add(colaborador);
        }

        return listaColaboradores;
    }
}

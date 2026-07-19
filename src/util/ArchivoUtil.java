package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Este metodo sirve para leer todas las líneas de un archivo .txt y devolverlas en un ArrayList<String>.
 */

public class ArchivoUtil {

    public static ArrayList<String> leerArchivo(String nombreArchivo) {

        ArrayList<String> lineas = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader(nombreArchivo)
            );

            String linea;

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo archivo");
        }

        return lineas;
    }
}
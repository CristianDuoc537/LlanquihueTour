package data;

import model.Cliente;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

/**
 * Administra cualquier entidad registrable.
 */

public class GestorEntidades {
    private ArrayList<Registrable> entidades = new ArrayList<>();

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public void mostrarEntidades() {
        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {
                System.out.println("Tipo: Guía Turístico");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("Tipo: Vehiculo");
            } else if (entidad instanceof Cliente) {
                System.out.println("Tipo: Cliente");
            }

            entidad.mostrarResumen();

            System.out.println();
        }
    }
}

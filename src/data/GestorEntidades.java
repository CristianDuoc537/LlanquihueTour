package data;

import model.*;

import java.util.ArrayList;

/**
 * Administra cualquier entidad registrable.
 */

public class GestorEntidades {
    private ArrayList<Registrable> entidades = new ArrayList<>();
    private GestorGuiaTuristico gestorGuia = new GestorGuiaTuristico();
    private GestorVehiculo gestorVehiculo = new GestorVehiculo();
    private GestorCLiente gestorCLiente = new GestorCLiente();
    private GestorColaboradorExterno gestorColaborador = new GestorColaboradorExterno();

    public void agregarEntidad(Registrable entidad) {

        if (entidad instanceof GuiaTuristico) {

            GuiaTuristico guiaTuristico = (GuiaTuristico) entidad; // Convierte la entidad recibida a tipo GuiaTuristico para poder usar sus métodos y atributos.
            gestorGuia.guardarGuia(guiaTuristico);
            System.out.println("Guardando guía turística");

        } else if (entidad instanceof Vehiculo) {

            Vehiculo vehiculo = (Vehiculo) entidad;
            gestorVehiculo.guardarVehiculo(vehiculo);
            System.out.println("Guardando Vehiculo");

        } else if (entidad instanceof Cliente) {

            Cliente cliente = (Cliente) entidad;
            gestorCLiente.guardarCliente(cliente);
            System.out.println("Guardando Cliente");

        } else if (entidad instanceof ColaboradorExterno) {

            ColaboradorExterno colaborador = (ColaboradorExterno) entidad;
            gestorColaborador.guardarColaboradorExterno(colaborador);
            System.out.println("Guardando Colaborador Externo");
        }
        entidades.add(entidad);
    }

    public String mostrarEntidades() {
        String texto = "";
        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {
                texto = entidad.mostrarDatos();
            } else if (entidad instanceof Vehiculo) {
                texto = entidad.mostrarDatos();
            } else if (entidad instanceof Cliente) {
                texto = entidad.mostrarDatos();
            } else if (entidad instanceof ColaboradorExterno) {
                texto = entidad.mostrarDatos();
            }
        }
        return texto;
    }

    public String cargarEntidades() {

        entidades.clear();

        entidades.addAll(gestorCLiente.cargarClientes());
        entidades.addAll(gestorGuia.cargarGuias());
        entidades.addAll(gestorVehiculo.cargarVehiculos());
        entidades.addAll(gestorColaborador.cargarColaboradores());

        String texto = "";

        for (Registrable entidad : entidades) {

            texto += entidad.mostrarDatos();
            texto += "\n\n";

        }

        return texto;
    }

    public String buscarEntidadPorRut(String rut) {

        for (Registrable entidad : entidades) {

            if (entidad instanceof Persona persona) {

                if (persona.getRut().equals(rut)) {
                    return entidad.mostrarDatos();
                }

            }
        }

        return null;
    }
}

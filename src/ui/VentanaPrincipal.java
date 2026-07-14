package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.JOptionPane;

public class VentanaPrincipal {

    private final GestorEntidades gestor = new GestorEntidades();

    public void iniciar() {

        int opcion;

        do {

            String menu = """
                    ===== LLANQUIHUE TOUR =====

                    1. Registrar entidad
                    2. Mostrar entidades

                    0. Salir
                    """;

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            switch (opcion) {

                case 1:
                    crearEntidad();
                    break;

                case 2:
                    gestor.mostrarEntidades();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(
                            null,
                            "Saliendo del programa..."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );
            }

        } while (opcion != 0);
    }

    private void crearEntidad() {

        String opcion = JOptionPane.showInputDialog("""
                ¿Qué desea registrar?

                1. Guía Turístico
                2. Vehículo
                3. Cliente
                """);

        switch (opcion) {

            case "1":
                crearGuia();
                break;

            case "2":
                crearVehiculo();
                break;

            case "3":
                crearCliente();
                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Opción no válida."
                );
        }
    }

    private void crearGuia() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String rut = JOptionPane.showInputDialog("Ingrese el rut: ");
        String especialidad = JOptionPane.showInputDialog("Ingrese su especialidad: ");
        String comuna = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la comuna: ");
        String calle = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la calle: ");
        String numero = JOptionPane.showInputDialog("Direccion\n" + "Ingrese el numero: ");

        // Crear GuiaTuristico
        Direccion direccion = new Direccion(comuna, calle, Integer.parseInt(numero));
        GuiaTuristico guia = new GuiaTuristico(nombre, direccion, rut, especialidad);

        // gestor.agregarEntidad(guia);
        gestor.agregarEntidad(guia);
    }

    private void crearVehiculo() {

        String marca = JOptionPane.showInputDialog("Ingrese la marca: ");
        String patente = JOptionPane.showInputDialog("Ingrese la patente: ");

        Vehiculo vehiculo = new Vehiculo(marca, patente);

        gestor.agregarEntidad(vehiculo);

    }

    private void crearCliente() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String rut = JOptionPane.showInputDialog("Ingrese el rut: ");
        String comuna = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la comuna: ");
        String calle = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la calle: ");
        String numero = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la numero: ");
        String correoElectronico = JOptionPane.showInputDialog("Ingrese su correo: ");

        Direccion direccion = new Direccion(comuna, calle, Integer.parseInt(numero));
        Cliente cliente = new Cliente(nombre, direccion, rut, correoElectronico);

        gestor.agregarEntidad(cliente);

    }
}
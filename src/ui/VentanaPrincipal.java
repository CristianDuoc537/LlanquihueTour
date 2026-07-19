package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal {

    private final GestorEntidades gestor = new GestorEntidades();

    public void iniciar() {

        gestor.cargarEntidades();
        int opcion;

        do {

            String menu = """
                    ===== LLANQUIHUE TOUR =====

                    1. Registrar entidad
                    2. Mostrar entidades
                    3. Buscar
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

                    String texto = gestor.cargarEntidades();

                    JTextArea area = new JTextArea(texto);
                    area.setEditable(false);
                    area.setLineWrap(true);
                    area.setWrapStyleWord(true);

                    JScrollPane scroll = new JScrollPane(area);
                    scroll.setPreferredSize(new Dimension(500, 300));

                    JOptionPane.showMessageDialog(
                            null,
                            scroll,
                            "Listado de Clientes",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 3:
                    String rut = JOptionPane.showInputDialog("Buscar rut: ");
                    JOptionPane.showMessageDialog(null, gestor.buscarEntidadPorRut(rut));
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
                4. Colaborador Externo
                """);

        switch (opcion) {

            case "1":
                crearGuiaTuristico();
                break;

            case "2":
                crearVehiculo();
                break;

            case "3":
                crearCliente();
                break;

            case "4":
                crearColaborador();
                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Opción no válida."
                );
        }
    }

    private void crearGuiaTuristico() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String rut = JOptionPane.showInputDialog("Ingrese el rut: ");
        String correoElectronico = JOptionPane.showInputDialog("Ingrese su correo: ");

        String comuna = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la comuna: ");
        String calle = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la calle: ");
        String numero = JOptionPane.showInputDialog("Direccion\n" + "Ingrese el numero: ");

        String especialidad = JOptionPane.showInputDialog("Ingrese su especialidad: ");

        Direccion direccion = new Direccion(comuna, calle, Integer.parseInt(numero));
        GuiaTuristico guia = new GuiaTuristico(nombre, rut, correoElectronico, direccion, especialidad);

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
        String correoElectronico = JOptionPane.showInputDialog("Ingrese su correo: ");

        String comuna = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la comuna: ");
        String calle = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la calle: ");
        String numero = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la numero: ");

        String idCliente = JOptionPane.showInputDialog("Ingrese el id del cliente: ");
        String tipoCLiente = JOptionPane.showInputDialog("Ingrese el tipo de cliente: ");



        Direccion direccion = new Direccion(comuna, calle, Integer.parseInt(numero));
        Cliente cliente = new Cliente(nombre, rut, correoElectronico, direccion, idCliente, tipoCLiente);

        gestor.agregarEntidad(cliente);

    }

    private void crearColaborador() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String rut = JOptionPane.showInputDialog("Ingrese el rut: ");
        String correoElectronico = JOptionPane.showInputDialog("Ingrese su correo: ");

        String comuna = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la comuna: ");
        String calle = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la calle: ");
        String numero = JOptionPane.showInputDialog("Direccion\n" + "Ingrese la numero: ");

        String servicioPrestado = JOptionPane.showInputDialog("Ingrese el tipo de servicio prestado");

        Direccion direccion = new Direccion(comuna, calle, Integer.parseInt(numero));
        ColaboradorExterno colaboradorExterno = new ColaboradorExterno(nombre, rut, correoElectronico, direccion, servicioPrestado);

        gestor.agregarEntidad(colaboradorExterno);
    }
}
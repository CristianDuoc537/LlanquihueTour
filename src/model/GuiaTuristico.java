package model;

public class GuiaTuristico extends Persona implements Registrable {
    private String especialidad;

    public GuiaTuristico(String nombre, String rut, String correoElectronico, Direccion direccion, String especialidad) {
        super(nombre, direccion, rut, correoElectronico);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

    @Override
    public void mostrarResumen() {
        System.out.print("GUia");
    }

    @Override
    public String mostrarDatos() {
        return "=======Guia Turistico=======" +
                "\nNombre: " + getNombre() +
                "\nRUT: " + getRut() +
                "\nCorreo: " + getCorreoElectronico() +
                "\nComuna: " + getDireccion().getComuna() +
                "\nCalle: " + getDireccion().getCalle() +
                "\nNúmero: " + getDireccion().getNumero() +
                "\nEspecialidad: " + getEspecialidad();
    }
}

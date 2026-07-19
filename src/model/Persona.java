package model;

/**
 * Esta clse representa a una persona
 * contiene atributos de clase como Direccion, y atributos simples como nombre, telefono.
 */
public class Persona implements Registrable {
    private String nombre;
    private String rut;
    private String correoElectronico;
    private Direccion direccion;

    public Persona(String correoElectronico) {
        this.nombre = null;
        this.rut = null;
        this.correoElectronico = null;
        this.direccion = null;
    }

    public Persona(String nombre, Direccion direccion, String rut, String correoElectronico) {
        this.nombre = nombre;
        this.rut = rut;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                ", rut='" + rut + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Esta es una persona");
    }

    @Override
    public String mostrarDatos() {
        return "Persona";
    }
}

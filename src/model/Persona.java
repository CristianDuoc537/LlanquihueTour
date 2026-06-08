package model;

/**
 * Esta clse representa a una persona
 * contiene atributos de clase como Direccion, y atributos simples como nombre, telefono.
 */
public class Persona {
    private String nombre;
    private String telefono;
    private Direccion direccion;

    public Persona() {
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;
    }

    public Persona(String nombre, Direccion direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\n" +
                "telefono = " + telefono + "\n" +
                "direccion > " + direccion;
    }
}

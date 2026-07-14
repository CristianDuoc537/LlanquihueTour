package model;

/**
 * Esta clse representa a una persona
 * contiene atributos de clase como Direccion, y atributos simples como nombre, telefono.
 */
public class Persona implements Registrable {
    private String nombre;
    private Direccion direccion;
    private String rut;

    public Persona() {
        this.nombre = null;
        this.direccion = null;
        this.rut = null;
    }

    public Persona(String nombre, Direccion direccion, String rut) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rut = rut;

        // validar el rut
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\n" +
                "direccion > " + direccion;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Persona registrada");
    }
}

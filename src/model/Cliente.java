package model;

/**
 * Esta clase representa a un Cliente dentro del sistema
 * Establece una relacion de herencia con Persona
 */

public class Cliente extends Persona implements Registrable{
    private String correoElectronico;

    public Cliente(String nombre
            , Direccion direccion
            , String rut
            , String correoElectronico) {

        super(nombre, direccion, rut);

        if (!correoElectronico.contains("@")) {
            throw new IllegalArgumentException("El correo electrónico debe contener '@'");
        }
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    @Override
    public void mostrarResumen() {
        System.out.println(
                "Nombre: " + getNombre() + "\n" +
                "Direccion > " + getDireccion() + "\n" +
                "rut: " + getRut() + "\n" +
                "Correo Electronico: " + correoElectronico

        );
    }
}

package model;

/**
 * Esta clase representa a un Cliente dentro del sistema
 * Establece una relacion de herencia con Persona
 */

public class Cliente extends Persona{
    private String correoElectronico;
    private boolean clienteFrecuente = false;

    public Cliente(String nombre
            , Direccion direccion
            , String telefono
            , String correoElectronico
            , int frecuenciaCliente) {

        super(nombre, direccion, telefono);

        if (frecuenciaCliente < 0) {
            throw new IllegalArgumentException("frecuencia no puede ser negativa");
        }
        if (frecuenciaCliente >= 8) {
            this.clienteFrecuente = true;
        }
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

    public boolean getClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(int frecuencia) {
        if (frecuencia >= 8) {
            this.clienteFrecuente = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Correo electronico: " + correoElectronico + "\n" +
                "Cliente frecuente: " + clienteFrecuente;
    }
}

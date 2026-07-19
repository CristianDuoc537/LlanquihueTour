package model;

/**
 * Esta clase representa a un Cliente dentro del sistema
 * Establece una relacion de herencia con Persona
 */

public class Cliente extends Persona implements Registrable{
    private String idCliente;
    private String tipoCLiente;

    public Cliente(String nombre, String rut, String correoElectronico, Direccion direccion, String idCliente, String tipoCLiente) {
        super(nombre, direccion, rut, correoElectronico);
        this.idCliente = idCliente;
        this.tipoCLiente = tipoCLiente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCLiente() {return tipoCLiente;}
    public void setTipoCLiente(String tipoCLiente) {
        this.tipoCLiente = tipoCLiente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCLiente='" + tipoCLiente + '\'' +
                ", idCliente='" + idCliente + '\'' +
                '}';
    }

    @Override
    public void mostrarResumen() {
        System.out.print("Cliente");
    }

    @Override
    public String mostrarDatos() {
        return "=======Cliente=======" +
                "\nNombre: " + getNombre() +
                "\nRUT: " + getRut() +
                "\nCorreo: " + getCorreoElectronico() +
                "\nComuna: " + getDireccion().getComuna() +
                "\nCalle: " + getDireccion().getCalle() +
                "\nNúmero: " + getDireccion().getNumero() +
                "\nID Cliente: " + getIdCliente() +
                "\nTipo de Cliente: " + getTipoCLiente();
    }
}

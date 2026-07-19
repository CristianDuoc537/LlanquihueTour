package model;

public class ColaboradorExterno extends Persona implements Registrable {
    private String servicioPrestado;

    public ColaboradorExterno(String nombre,
                              String rut,
                              String correoElectronico,
                              Direccion direccion,
                              String servicioPrestado) {
        super(nombre, direccion, rut, correoElectronico);
        this.servicioPrestado = servicioPrestado;
    }

    public String getServicioPrestado() {
        return servicioPrestado;
    }
    public void setServicioPrestado(String servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    @Override
    public String toString() {
        return "ColaboradorExterno{" +
                "servicioPrestado='" + servicioPrestado + '\'' +
                '}';
    }

    @Override
    public void mostrarResumen() {
        System.out.print("Colaborador");
    }

    @Override
    public String mostrarDatos() {
        return "=======Colaborador Externo=======" +
                "\nNombre: " + getNombre() +
                "\nRUT: " + getRut() +
                "\nCorreo: " + getCorreoElectronico() +
                "\nComuna: " + getDireccion().getComuna() +
                "\nCalle: " + getDireccion().getCalle() +
                "\nNúmero: " + getDireccion().getNumero() +
                "\nServicio Prestado: " + getServicioPrestado();
    }
}
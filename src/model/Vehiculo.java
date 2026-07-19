package model;

public class Vehiculo implements Registrable{
    private String marca;
    private String patente;

    public Vehiculo(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Registrando vehiculo!" + "\n" +
                "Marca: " + marca + "\n" +
                "Patente: " + patente
        );
    }

    @Override
    public String mostrarDatos() {
        return "=======Vehiculo=======" +
                "\nMarca: " + getMarca() +
                "\nPatente: " + getPatente();
    }
}

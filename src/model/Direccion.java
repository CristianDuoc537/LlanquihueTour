package model;

/**
 * Esta clase representa la direccion de una persona
 *
 */
public class Direccion {
    private String comuna;
    private String calle;
    private int numero;

    public Direccion() {
        this.comuna = null;
        this.calle = null;
        this.numero = 0;
    }

    public Direccion(String comuna, String calle, int numero) {
        this.comuna = comuna;
        this.calle = calle;
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {this.calle = calle;}

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "comuna = " + comuna +
                ", calle= " + calle +
                ", numero= " + numero;
    }
}

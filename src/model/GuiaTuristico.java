package model;

public class GuiaTuristico extends Persona implements Registrable {
    private String especialidad;

    public GuiaTuristico(String nombre, Direccion direccion, String rut, String especialidad) {
        super(nombre, direccion, rut);
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
        System.out.println(
                "Especialidad: " + getEspecialidad() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "rut: " + getRut() + "\n" +
                "Direccion > " + getDireccion()
        );
    }
}

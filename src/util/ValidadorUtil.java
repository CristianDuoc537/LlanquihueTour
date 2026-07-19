package util;

public class ValidadorUtil {

    public static boolean estaVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    public static boolean esNumero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean correoValido(String correo) {
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean rutValido(String rut) {
        return rut.matches("\\d{7,8}-[0-9Kk]");
    }

}
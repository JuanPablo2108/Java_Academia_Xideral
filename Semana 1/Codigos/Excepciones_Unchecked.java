public class Excepciones_Unchecked {

    // Método que provoca una NullPointerException (excepción unchecked)
    public static void causarNullPointerException() {
        String texto = null;
        // Al intentar llamar length() sobre un objeto null, se lanza NullPointerException
        System.out.println(texto.length());
    }

    // Método que provoca una ArrayIndexOutOfBoundsException (excepción unchecked)
    public static void causarArrayIndexOutOfBoundsException() {
        int[] numeros = {1, 2, 3};
        // Intentamos acceder a un índice fuera del rango válido del arreglo
        System.out.println(numeros[5]);
    }

    public static void main(String[] args) {
        try {
            causarNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Capturada NullPointerException: " + e.getMessage());
        }

        try {
            causarArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturada ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Programa continúa ejecutándose después de manejar las excepciones unchecked.");
    }
}

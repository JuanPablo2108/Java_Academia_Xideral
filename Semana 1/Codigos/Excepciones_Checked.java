import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones_Checked {

    // Método que lee la primera línea de un archivo y puede lanzar IOException (checked)
    public static String leerPrimeraLinea(String rutaArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String linea = br.readLine();
        br.close(); // Es importante cerrar el recurso
        return linea;
    }

    public static void main(String[] args) {
        String archivo = "archivo_inexistente.txt";

        try {
            // Intentamos leer un archivo que probablemente no exista
            String linea = leerPrimeraLinea(archivo);
            System.out.println("Primera línea del archivo: " + linea);
        } catch (IOException e) {
            // Capturamos la excepción IOException (checked) para manejarla
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Programa continúa ejecutándose después de manejar la excepción checked.");
    }
}

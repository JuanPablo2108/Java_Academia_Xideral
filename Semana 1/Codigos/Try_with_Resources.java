import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_Resources {

    // Método que lee la primera línea de un archivo usando try-with-resources
    public static void leerArchivo(String rutaArchivo) {
        // El recurso BufferedReader se declara dentro del try,
        // así se cierra automáticamente al terminar, sin necesidad de hacerlo manualmente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea = br.readLine();
            System.out.println("Primera línea del archivo: " + linea);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No es necesario cerrar el BufferedReader explícitamente, se cierra automáticamente
    }

    public static void main(String[] args) {
        String archivo = "archivo.txt";

        leerArchivo(archivo);

        System.out.println("Programa continúa después de manejar recursos con try-with-resources.");
    }
}

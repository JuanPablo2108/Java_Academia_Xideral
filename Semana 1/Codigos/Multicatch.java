import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multicatch {

        // Método que puede lanzar IOException o NumberFormatException
        public static void leerArchivoYParsearNumero(String rutaArchivo) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea = br.readLine();
            br.close();

            // Intentamos convertir la línea leída a un número entero
            int numero = Integer.parseInt(linea);
            System.out.println("Número leído: " + numero);
        }

        public static void main(String[] args) {
            String archivo = "datos.txt"; // Archivo que podría no existir o contener texto no numérico

            try {
                leerArchivoYParsearNumero(archivo);
            } catch (IOException | NumberFormatException e) {
                // Multicatch: Captura IOException (checked) y NumberFormatException (unchecked)
                System.out.println("Error al procesar el archivo o el número: " + e.getMessage());
            }

            System.out.println("Programa continúa ejecutándose después de manejar las excepciones.");
        }
    }


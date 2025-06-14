public class Singleton {

    // Clase Singleton
    static class Conexion {

        // 1. Variable estática que guarda la única instancia
        private static Conexion instancia;

        // 2. Constructor privado para evitar que se creen más objetos desde fuera
        private Conexion() {
            System.out.println("⚙️ Conexión creada");
        }

        // 3. Método público que devuelve la única instancia (creándola si no existe)
        public static Conexion getInstance() {
            if (instancia == null) {
                instancia = new Conexion(); // Se crea una vez
            }
            return instancia; // Siempre se devuelve la misma
        }

        // Método de ejemplo
        public void conectar() {
            System.out.println("🔌 Conectado al sistema");
        }
    }

    // Método principal donde usamos el Singleton
    public static void main(String[] args) {

        // Obtenemos la instancia única de la clase
        Conexion conexion1 = Conexion.getInstance();
        conexion1.conectar(); // Se imprime mensaje de conexión

        // Obtenemos la instancia otra vez
        Conexion conexion2 = Conexion.getInstance();
        conexion2.conectar(); // Mismo objeto, mismo método

        // Verificamos que ambas referencias apuntan al mismo objeto
        System.out.println("¿Es la misma instancia? " + (conexion1 == conexion2)); // true
    }
}

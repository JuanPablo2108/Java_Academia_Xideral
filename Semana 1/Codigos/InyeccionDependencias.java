public class InyeccionDependencias {

    // Interfaz que define un contrato común para los servicios
    public interface Servicio {
        void ejecutar();  // Método que cada implementación debe definir
    }

    // Implementación concreta de la interfaz Servicio
    public static class ServicioCorreo implements Servicio {
        @Override
        public void ejecutar() {
            System.out.println("Enviando correo...");  // Simula el envío de un correo
        }
    }

    // Cliente que recibe la dependencia a través del constructor
    public static class ClienteConstructor {
        private Servicio servicio;

        // El servicio se inyecta al momento de crear la instancia
        public ClienteConstructor(Servicio servicio) {
            this.servicio = servicio;
        }

        // Método que utiliza el servicio
        public void procesar() {
            servicio.ejecutar();
        }
    }

    // Cliente que recibe la dependencia a través de un método setter
    public static class ClienteSetter {
        private Servicio servicio;

        // El servicio se inyecta después de crear la instancia
        public void setServicio(Servicio servicio) {
            this.servicio = servicio;
        }

        // Método que utiliza el servicio
        public void procesar() {
            servicio.ejecutar();
        }
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        // Se crea una instancia del servicio (la dependencia)
        Servicio servicio = new ServicioCorreo();

        // Inyección por constructor: el servicio se pasa al crear el objeto
        ClienteConstructor cliente1 = new ClienteConstructor(servicio);
        cliente1.procesar();  // Resultado: "Enviando correo..."

        // Inyección por setter: el servicio se establece después
        ClienteSetter cliente2 = new ClienteSetter();
        cliente2.setServicio(servicio);
        cliente2.procesar();  // Resultado: "Enviando correo..."
    }
}

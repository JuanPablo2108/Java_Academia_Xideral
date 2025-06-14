import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Se declara la clase como final para que no pueda ser extendida
public final class Persona {

    // 2. Los campos son private y final, por lo que solo se asignan una vez y no pueden cambiar
    private final String nombre;
    private final int edad;
    private final List<String> hobbies;

    // 3. Constructor que inicializa todos los campos
    public Persona(String nombre, int edad, List<String> hobbies) {
        this.nombre = nombre;
        this.edad = edad;

        // 4. Se hace una copia defensiva de la lista para evitar que se modifique desde fuera
        this.hobbies = new ArrayList<>(hobbies);
    }

    // 5. Getters que solo devuelven los valores (sin permitir modificaciones)

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // 6. Se retorna una versión no modificable de la lista para proteger el estado interno
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
}

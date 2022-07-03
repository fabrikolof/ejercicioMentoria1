package Ejercicio4;

public abstract class Persona {

    final char HOMBRE = 'H';
    final char MUJER = 'M';

    String nombre;
    char sexo;
    int edad;

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public abstract boolean disponibilidad();
}

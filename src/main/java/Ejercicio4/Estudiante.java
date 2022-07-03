package Ejercicio4;

import java.util.Random;

public class Estudiante extends Persona {
    int nota;

    public Estudiante(String nombre, char sexo, int edad, int nota) {
        super(nombre, sexo, edad);
        this.nota = nota;
    }

    @Override
    public boolean disponibilidad() {
        int a = new Random().nextInt(10);
        if (a < 4) {
            // 50% chance
            return true;
        } else {
            // 50% chance
            return false;
        }
    }
}

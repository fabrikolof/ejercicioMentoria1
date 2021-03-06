package Ejercicio4;

import java.util.Random;

public class Profesor extends Persona{
    String materia;

    public Profesor(String nombre, char sexo, int edad, String materia) {
        super(nombre, sexo, edad);
        this.materia = materia;
    }

    @Override
    public boolean disponibilidad() {
        int a = new Random().nextInt(10);
        if (a < 8) {
            // 80% chance
            return true;
        } else {
            // 20% chance
            return false;
        }
    }
}

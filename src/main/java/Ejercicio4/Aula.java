package Ejercicio4;

import com.sun.javafx.logging.PulseLogger;

import java.util.Arrays;

public class Aula {
    String materia;
    int identificador;
    int capacidad;
    Profesor profesor;
    Estudiante estudiantes[];

    public Aula(String materia, int identificador, int capacidad, Profesor profesor, Estudiante[] estudiantes) {
        this.materia = materia;
        this.identificador = identificador;
        this.capacidad = capacidad;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public int estudiantesDisponibles(){
        int estudiantesDis = 0;
        for(Estudiante estudiante : estudiantes) {
            if (estudiante.disponibilidad()){
                estudiantesDis++;
            }
        }
        return estudiantesDis;
    }

    public int estudiantesTotales(){
        return estudiantes.length;
    }

    //profe disponible + materia valida
    public boolean profeCheker(){
        System.out.println("profe: "+profesor.disponibilidad());
        System.out.println("profe: "+profesor.materia);
        System.out.println("aula: "+this.materia);

        return profesor.disponibilidad() && profesor.materia == this.materia;
    }

    //Más del 50% de alumnos.
    public boolean hayEstudiantes(){
        return estudiantesDisponibles() > estudiantesTotales()/2;
    }

    public boolean darClase(){
        return profeCheker() && hayEstudiantes();
    }

    //mostrar los aprobados por separado, alumnos y alumnas con una nota mayor a 5
    public void darNotas(){
        int alumnasApro = 0;
        int alumnosApro = 0;
        for(Estudiante estudiante : estudiantes) {
            if(estudiante.nota>5){
                if(estudiante.sexo=='M'){
                    alumnasApro++;
                }else{
                    alumnosApro++;
                }
            }
        }
        System.out.println("Alumnas aprobadas: "+alumnasApro+" Alumnos aprobados "+alumnosApro);
    }


}

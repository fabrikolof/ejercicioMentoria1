package Ejercicio4;

import java.util.Random;

public class Ejecutable {
    public static int numeroAleatorio(int numMin, int numMax) { //Devuelve un número aleatorio entre los números ingresados
        Random random = new Random();
        return random.nextInt(numMax + 1 - numMin) + numMin;
    }

    //terminar
    public static String setMateria(){
        String materia = "";
        int aleatorio = numeroAleatorio(0, 2);
        return aleatorio==0?"matematica":aleatorio==1?"filosofia":"fisica";
    }


    //MAIN
    public static void main(String[] args) {

        //ARRAY DECLARATION
        //1- ClassName obj[]=new ClassName[array_length]; //declare and instantiate an array of objects
        //2- ClassName[] objArray;
        //3- ClassName objeArray[];
        Estudiante estudiantes[] = new Estudiante[6];
        estudiantes[0] = new Estudiante("Federico", 'H', numeroAleatorio(13, 15), numeroAleatorio(0, 10));
        estudiantes[1] = new Estudiante("Maria", 'M', numeroAleatorio(13, 15), numeroAleatorio(0, 10));
        estudiantes[2] = new Estudiante("Sofia", 'm', numeroAleatorio(13, 15), numeroAleatorio(0, 10));
        estudiantes[3] = new Estudiante("Martin", 'H', numeroAleatorio(13, 15), numeroAleatorio(0, 10));
        estudiantes[4] = new Estudiante("Ramon", 'H', numeroAleatorio(13, 15), numeroAleatorio(0, 10));
        estudiantes[5] = new Estudiante("Kantacia", 'M', numeroAleatorio(13, 15), numeroAleatorio(0, 10));

        //PROFESOR
        Profesor profesor = new Profesor("Roberto", 'H', numeroAleatorio(18, 80), setMateria());

        //AULA
        Aula aula = new Aula(setMateria(), 1, 10, profesor, estudiantes);

/*        int num = estudiantes.length-1;
        while(num>=0){
            System.out.println(estudiantes[num].nombre+" Nota: "+estudiantes[num].nota);
            num--;
        }*/
        if(aula.darClase()){
            System.out.println("Hay clases!!!!");
            aula.darNotas();
        } else {
            System.out.println("No se puede dar clases.");
            System.out.println("Estudiantes totales: "+aula.estudiantesTotales());
            System.out.println("Estudiantes Dispo: "+aula.estudiantesDisponibles());
        }
    }
}

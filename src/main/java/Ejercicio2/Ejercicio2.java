package Ejercicio2;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        boolean validator = true;
        while(validator){

            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa las millas: ");
            double millas = sc.nextDouble();
            if(millas == 0){
                validator = false;
                break;
            }
            double kilometros = millas * 1.6093434;

            Double resultado = (double) (Math.round(kilometros*100.0)/100.0);

            System.out.println("Distancia en Millas      = " + millas + " Millas");
            System.out.println("Distancia en Kilometros = " + resultado + " Kilometros");
        }
    }
}

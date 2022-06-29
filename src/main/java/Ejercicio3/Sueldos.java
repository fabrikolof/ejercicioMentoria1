package Ejercicio3;

public class Sueldos {

    String areaTrabajo;
    double sueldo;
    double cantidadHijos;

    public Sueldos(double sueldo, String areaTrabajo, double cantidadHijos) {
        this.sueldo = sueldo;
        this.areaTrabajo = areaTrabajo;
        this.cantidadHijos = cantidadHijos;
    }

    public double bonificacion() {
        double boniTotal, boniArea, boniHijos = 0;

        if(this.areaTrabajo == "Sistemas"){
            boniArea = this.sueldo * 1.25;
        } else if (this.areaTrabajo == "Contabilidad"){
            boniArea = this.sueldo * 1.20;
        } else {
            boniArea = this.sueldo * 1.10;

        }

        if(this.cantidadHijos>2) {
            boniHijos = cantidadHijos * 150;
        }

        boniTotal = boniArea + boniHijos;
        return boniTotal;
    }

    public static void main(String[] args) {
        Sueldos s = new Sueldos(1000, "Sistemas", 3);
        System.out.println(s.bonificacion());
    }
}

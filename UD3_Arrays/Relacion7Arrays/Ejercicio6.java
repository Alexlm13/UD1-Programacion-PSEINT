package UD3_Arrays.Relacion7Arrays;
import java.util.*;

/*
Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por
teclado.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int alumnos=0;
        double  suma=0, media=0;

        System.out.print("Cuántos alumnos hay en clase? ");
        alumnos=entrada.nextInt();

        if (alumnos<=0) {
            System.out.println("El número de alumnos debe ser mayor que 0");
        }

        double notas[]=new double[alumnos];

        System.out.println("Introduzca las notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Alumno %d: ",i+1);
            notas[i]=entrada.nextDouble();
        }

        for (double d : notas) {
            suma+=d;
        }
        media=suma/notas.length;
        System.out.printf("Nota media del grupo: %.2f\n\n", media);

        System.out.println("Alumnos por encima de la media:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>media) {
                System.out.printf("- Alumno %d: %.2f\n",i+1, notas[i]);
            }
        }
    }
}

package UD2_Java.Relacion6;

/*Realizar un programa que comprueba si una cadena leída por teclado 
comienza por una subcadena introducida por teclado */

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String cadena1, cadena2;
        System.out.println("Introduzca una cadena:");
        cadena1=entrada.nextLine();

        System.out.println("Introduzca la subcadena:");
        cadena2=entrada.nextLine();

        if (cadena1.startsWith(cadena2)) {
            System.out.println("La subcadena empieza por la cadena");
        }else{
            System.out.println("Su subcadena no empieza por la cadena");
        }
    }
}

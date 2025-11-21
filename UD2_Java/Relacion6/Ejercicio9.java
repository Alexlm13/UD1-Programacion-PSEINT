package UD2_Java.Relacion6;

/*Realizar un programa que compruebe si una cadena contiene una subcadena.
Las dos cadenas se introducen por teclado */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String cadena1, cadena2;
        System.out.println("Introduzca una cadena:");
        cadena1=entrada.nextLine();

        System.out.println("Introduzca la subcadena:");
        cadena2=entrada.nextLine();

        if (cadena1.contains(cadena2)) {
            System.out.println("La cadena contiene la subcadena");
        }else{
            System.out.println("Su subcadena no se encuentra en la cadena");
        }
    }
}

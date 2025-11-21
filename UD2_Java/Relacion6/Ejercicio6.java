package UD2_Java.Relacion6;
/*Realizar un programa que dada una cadena de caracteres por caracteres, 
genere otra cadena resultado de invertir la primera */

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena, reves="";

        System.out.println("Introduzca una cadena");
        cadena=entrada.nextLine();

        for (int i = cadena.length()-1; i>=0; i--) {
            reves+=cadena.charAt(i);
        }

        System.out.println("Su cadena al revés seria: "+reves);
    }
}
